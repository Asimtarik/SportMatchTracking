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
public class BasketballTeam extends SportTeam {

    public BasketballTeam(String name, String groupname, int winNumber, int loseNumber, int tieNumber, int score) {
        super(name, groupname, winNumber, loseNumber, tieNumber, score);
    }

   

    /**
     * @return the footballmatch
     */
   

    public void setPoint() {
        super.setScore((super.getWinNumber() * 3) + super.getTieNumber());
    }
}
