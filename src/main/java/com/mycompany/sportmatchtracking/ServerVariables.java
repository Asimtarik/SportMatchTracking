/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportmatchtracking;

/**
 *
 * @author Lenovo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 
@author fener*/
public class ServerVariables {

    private static final String url = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String username = "root";
    private static final String password = "kutluer";

    public static Connection getConnection () throws SQLException{
        return DriverManager.getConnection(url, username, password);
    }
    public void showErrorMessage(SQLException exception){
        System.out.println("Error :"+ exception.getMessage());
        System.out.println("Error Code :"+exception.getErrorCode());
    }
}