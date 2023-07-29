/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author NOC
 */
public class koneksi {
    public Connection con;
    public Statement stm;
    
    public void config(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/db_crudjava","root","");
        stm=con.createStatement();
        
    }catch(Exception e){
         JOptionPane.showMessageDialog(null, "koneksi gagal"+e.getMessage());
    }
}

}
