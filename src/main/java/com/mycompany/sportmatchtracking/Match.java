/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportmatchtracking;

/**
 *
 * @author Lenovo
 */
public class Match {
    
    private SportTeam team1;
    private SportTeam team2;
    private int score1;
    private int score2;
    private int id;
    private static int newId=100;
            

    public Match(SportTeam team1, SportTeam team2, int score1, int score2) {
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = score1;
        this.score2 = score2;
        this.id= newId++;
        
    }

    /**
     * @return the team1
     */
    public SportTeam getTeam1() {
        return team1;
    }

    /**
     * @param team1 the team1 to set
     */
    public void setTeam1(SportTeam team1) {
        this.team1 = team1;
    }

    /**
     * @return the team2
     */
    public SportTeam getTeam2() {
        return team2;
    }

    /**
     * @param team2 the team2 to set
     */
    public void setTeam2(SportTeam team2) {
        this.team2 = team2;
    }

    /**
     * @return the score1
     */
    public int getScore1() {
        return score1;
    }

    /**
     * @param score1 the score1 to set
     */
    public void setScore1(int score1) {
        this.score1 = score1;
    }

    /**
     * @return the score2
     */
    public int getScore2() {
        return score2;
    }

    /**
     * @param score2 the score2 to set
     */
    public void setScore2(int score2) {
        this.score2 = score2;
    }

    @Override
    public String toString() {
        return team1.toString() + "-" + team2.toString();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
}
