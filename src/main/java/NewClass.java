
import com.mycompany.sportmatchtracking.Team;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Lenovo
 */
public class NewClass {

    public static void main(String[] args) throws SQLException {

       String url= "jdbc:derby:Db";
       try{
       Connection conn= DriverManager.getConnection(url);
        System.out.println("connected");
            
       } catch(SQLException e){
           
           e.printStackTrace();
       }
       

    }
}
