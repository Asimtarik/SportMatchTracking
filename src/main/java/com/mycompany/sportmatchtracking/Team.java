/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportmatchtracking;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "TEAM")
@NamedQueries({
    @NamedQuery(name = "Team.findAll", query = "SELECT t FROM Team t"),
    @NamedQuery(name = "Team.findByTeamtype", query = "SELECT t FROM Team t WHERE t.teamtype = :teamtype"),
    @NamedQuery(name = "Team.findByTeamid", query = "SELECT t FROM Team t WHERE t.teamid = :teamid"),
    @NamedQuery(name = "Team.findByTeamname", query = "SELECT t FROM Team t WHERE t.teamname = :teamname"),
    @NamedQuery(name = "Team.findByGroupnumber", query = "SELECT t FROM Team t WHERE t.groupnumber = :groupnumber"),
    @NamedQuery(name = "Team.findByWinnumber", query = "SELECT t FROM Team t WHERE t.winnumber = :winnumber"),
    @NamedQuery(name = "Team.findByLosenumber", query = "SELECT t FROM Team t WHERE t.losenumber = :losenumber"),
    @NamedQuery(name = "Team.findByTienumber", query = "SELECT t FROM Team t WHERE t.tienumber = :tienumber"),
    @NamedQuery(name = "Team.findByScore", query = "SELECT t FROM Team t WHERE t.score = :score")})
public class Team implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "TEAMTYPE")
    private String teamtype;
    @Id
    @Basic(optional = false)
    @Column(name = "TEAMID")
    private Integer teamid;
    @Column(name = "TEAMNAME")
    private String teamname;
    @Column(name = "GROUPNUMBER")
    private Integer groupnumber;
    @Column(name = "WINNUMBER")
    private Integer winnumber;
    @Column(name = "LOSENUMBER")
    private Integer losenumber;
    @Column(name = "TIENUMBER")
    private Integer tienumber;
    @Column(name = "SCORE")
    private Integer score;
    @OneToMany(mappedBy = "team1")
    private Collection<Matches> matchesCollection;
    @OneToMany(mappedBy = "team2")
    private Collection<Matches> matchesCollection1;

    public Team() {
    }

    public Team(Integer teamid) {
        this.teamid = teamid;
    }

    public String getTeamtype() {
        return teamtype;
    }

    public void setTeamtype(String teamtype) {
        this.teamtype = teamtype;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public Integer getGroupnumber() {
        return groupnumber;
    }

    public void setGroupnumber(Integer groupnumber) {
        this.groupnumber = groupnumber;
    }

    public Integer getWinnumber() {
        return winnumber;
    }

    public void setWinnumber(Integer winnumber) {
        this.winnumber = winnumber;
    }

    public Integer getLosenumber() {
        return losenumber;
    }

    public void setLosenumber(Integer losenumber) {
        this.losenumber = losenumber;
    }

    public Integer getTienumber() {
        return tienumber;
    }

    public void setTienumber(Integer tienumber) {
        this.tienumber = tienumber;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Collection<Matches> getMatchesCollection() {
        return matchesCollection;
    }

    public void setMatchesCollection(Collection<Matches> matchesCollection) {
        this.matchesCollection = matchesCollection;
    }

    public Collection<Matches> getMatchesCollection1() {
        return matchesCollection1;
    }

    public void setMatchesCollection1(Collection<Matches> matchesCollection1) {
        this.matchesCollection1 = matchesCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (teamid != null ? teamid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Team)) {
            return false;
        }
        Team other = (Team) object;
        if ((this.teamid == null && other.teamid != null) || (this.teamid != null && !this.teamid.equals(other.teamid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.sportmatchtracking.Team[ teamid=" + teamid + " ]";
    }

    public void setName(String a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
