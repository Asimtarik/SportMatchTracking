/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportmatchtracking;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class SportTeam {

    private String name;

    private String groupname;
    
    private int winNumber;
    private int loseNumber;
    private int tieNumber;
    private int score;
    private final ArrayList<Match> sportmatches = new ArrayList();

    public SportTeam(String name, String groupname, int winNumber, int loseNumber, int tieNumber, int score) {
        this.name = name;
        this.groupname = groupname;
        this.winNumber = winNumber;
        this.loseNumber = loseNumber;
        this.tieNumber = tieNumber;
        this.score = score;
    }

    
 public ArrayList<Match> getMatches() {
        return sportmatches;
    }

   
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the groupname
     */
    public String getGroupname() {
        return groupname;
    }

    /**
     * @param groupname the groupname to set
     */
    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * @return the winNumber
     */
    public int getWinNumber() {
        return winNumber;
    }

    /**
     * @param winNumber the winNumber to set
     */
    public void setWinNumber(int winNumber) {
        this.winNumber = winNumber;
    }

    /**
     * @return the loseNumber
     */
    public int getLoseNumber() {
        return loseNumber;
    }

    /**
     * @param loseNumber the loseNumber to set
     */
    public void setLoseNumber(int loseNumber) {
        this.loseNumber = loseNumber;
    }

    /**
     * @return the tieNumber
     */
    public int getTieNumber() {
        return tieNumber;
    }

    /**
     * @param tieNumber the tieNumber to set
     */
    public void setTieNumber(int tieNumber) {
        this.tieNumber = tieNumber;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

}
