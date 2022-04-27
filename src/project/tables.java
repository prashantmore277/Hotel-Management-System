/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author PRASHANT MORE
 */
public class tables {
    public static void main(String[] Args){
        Connection con =  null;
        Statement st = null;
//        Try Section
        try{
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate("Create table users(name varchar(200),email varchar(200),password varchar(50),securityQuestion varchar(500),answer varchar(200),address varchar(200),status varchar(20))");

        }
//        Catch Section
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
//        Finally Section
        finally{
            try{
                con.close();
                st.close();
            }
            catch(Exception e){
                
            }
                
        }
            
    }
    
}
