

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas Chate
 * @version 1.0
 * @since 20/01/2017
 */
//sets packages needed
import java.sql.DriverManager;
import java.net.*;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tom
 */
public class DatabaseConnection {

    /**
     *
     * @return
     */
    public static Connection establishConnection() {    //This method connects to the database and returns the connection.

        try {
 
            String host = "jdbc:mysql://213.104.129.95:3306/INSE";   //Location of mySQL server
            String uName = "root";    //account details for accessing database      
            String uPass = "root";
            Connection con = DriverManager.getConnection(host, uName, uPass);
            System.out.println("Connected database successfully...");

            return con;
        } catch (SQLException err) {
            System.out.println(err.getMessage());   //Prints out SQL error if connection is not established
            return null;
        }
    }
    
    /**
     *
     * @param con
     */
    public void closeConnection(Connection con){
    //end of connection
        try{
        con.close();
        }catch(SQLException err){
        
        
        }
    
    }

}
