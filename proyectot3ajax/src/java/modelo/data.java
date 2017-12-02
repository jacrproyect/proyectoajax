/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class data {
    
    public data() {
    }
    
    public Connection getMysql(){
        String usuario="root";
        String clave = "aseas123";
        String url = "jdbc:mysql://localhost:3306/sowad";
        Connection con = null;
        try {
            DriverManager.registerDriver(new Driver());
            con = DriverManager.getConnection(url, usuario, clave);
        } catch (SQLException ex) {
            Logger.getLogger(data.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
