/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entidades.DepartamentoMO;
import entidades.EmpleadoMO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class DepartamentoDAO {

    public DepartamentoDAO() {
    }
    
    public List<DepartamentoMO> listardepartamento()
    {
        List<DepartamentoMO> lista= new ArrayList(); 
        
        String sql="select d.idDepartamento, d.nombreDepartamento from departamento d ORDER BY d.nombreDepartamento " ;
        Connection c= new data().getMysql();
        
   
        try {
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            DepartamentoMO d=new DepartamentoMO(rs.getInt(1),rs.getString(2));
                   
            lista.add(d);
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
            
        return lista;
    }
/* provando metodos */    
    /*
    public static void main(String[] args) {
        DepartamentoDAO dao= new DepartamentoDAO();
        for (DepartamentoMO dp : dao.listardepartamento()) 
        {
            System.out.println(dp.getIdDepartamento());
            System.out.println(dp.getNombreDepartamento());
        }
    }
    */
/*fin de probar metodos */
}
