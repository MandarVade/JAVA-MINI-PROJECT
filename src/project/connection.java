/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
/**
 *
 * @author Dell
 */
public class connection {
    public static Connection getcon()
    {
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver") ;
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","mandar@1317");
         return con;
        }
        catch(Exception e)
                {
                  return null;  
                }
    }
    
}
