/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportmatchtracking;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "MATCHES")
@NamedQueries({
    @NamedQuery(name = "Matches.findAll", query = "SELECT m FROM Matches m"),
    @NamedQuery(name = "Matches.findByMatchtype", query = "SELECT m FROM Matches m WHERE m.matchtype = :matchtype"),
    @NamedQuery(name = "Matches.findByMatchid", query = "SELECT m FROM Matches m WHERE m.matchid = :matchid"),
    @NamedQuery(name = "Matches.findByScore1", query = "SELECT m FROM Matches m WHERE m.score1 = :score1"),
    @NamedQuery(name = "Matches.findByScore2", query = "SELECT m FROM Matches m WHERE m.score2 = :score2")})
public class Matches implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "MATCHTYPE")
    private String matchtype;
    @Id
    @Basic(optional = false)
    @Column(name = "MATCHID")
    private Integer matchid;
    @Column(name = "SCORE1")
    private Integer score1;
    @Column(name = "SCORE2")
    private Integer score2;
    @JoinColumn(name = "TEAM1", referencedColumnName = "TEAMID")
    @ManyToOne
    private Team team1;
    @JoinColumn(name = "TEAM2", referencedColumnName = "TEAMID")
    @ManyToOne
    private Team team2;

    public Matches() {
    }

    public Matches(Integer matchid) {
        this.matchid = matchid;
    }

    public String getMatchtype() {
        return matchtype;
    }

    public void setMatchtype(String matchtype) {
        this.matchtype = matchtype;
    }

    public Integer getMatchid() {
        return matchid;
    }

    public void setMatchid(Integer matchid) {
        this.matchid = matchid;
    }

    public Integer getScore1() {
        return score1;
    }

    public void setScore1(Integer score1) {
        this.score1 = score1;
    }

    public Integer getScore2() {
        return score2;
    }

    public void setScore2(Integer score2) {
        this.score2 = score2;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matchid != null ? matchid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matches)) {
            return false;
        }
        Matches other = (Matches) object;
        if ((this.matchid == null && other.matchid != null) || (this.matchid != null && !this.matchid.equals(other.matchid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.sportmatchtracking.Matches[ matchid=" + matchid + " ]";
    }
    
}
