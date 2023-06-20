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
public class DataBase {

    private static ArrayList<User> users = new ArrayList();

    private static ArrayList<Match> matches = new ArrayList();

    private static ArrayList<SportTeam> teams = new ArrayList();

    /**
     * @return the users
     */
    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void AddBasketballTeam(String name, String groupname) {

        BasketballTeam basketballteam = new BasketballTeam(name, groupname, 0, 0, 0, 0);
        teams.add(basketballteam);
    }

    public static void AddFootballTeam(String name, String groupname) {

        FootballTeam footballteam = new FootballTeam(name, groupname, 0, 0, 0, 0);
        teams.add(footballteam);
    }

    public static void AddVolleyballTeam(String name, String groupname) {

        VolleyballTeam volleyballteam = new VolleyballTeam(name, groupname, 0, 0, 0, 0);
        teams.add(volleyballteam);
    }

    /**
     * @return the matches
     */
    public static ArrayList<Match> getMatches() {
        return matches;
    }

    /**
     * @return the teams
     */
    public static ArrayList<SportTeam> getTeams() {
        return teams;
    }

}
