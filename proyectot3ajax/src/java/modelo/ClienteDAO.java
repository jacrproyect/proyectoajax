/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entidades.ClienteMO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteDAO {

    public ClienteDAO() {
    }
    
    
    public String ContCliente(){
        String ob="";
        
           String sql="select count(COD_EMP) as Total from TB_EMPLEADO";
           Connection c= new data().getMysql();
        
          Statement st;
        try {
            st = c.createStatement();
            ResultSet rs=st.executeQuery(sql);
            rs.next();
           ob=rs.getString(1);
           
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ob;
        } 
     
    public List<ClienteMO> obtener() {
        List<ClienteMO> lista= new ArrayList();
        
        String sql="select e.nom_emp as Nombre,e.ape_emp as Apellidos,e.dni_emp as Dni,e.OTROS as Tipo,e.FECHA AS FRegistro,c.DESC_CARGO as Cargo from tb_empleado e inner join TB_CARGOEMP c on e.COD_CARG=c.COD_CAREMP where e.estado='ACTIVO'" ;
         Connection c= new data().getMysql();
        
   
        try {
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            ClienteMO e=new ClienteMO();
            e.setNombre_persona(rs.getString(1));
            e.setApellido_persona(rs.getString(2));
            e.setDni(rs.getString(3));
            e.setTelefono(rs.getInt(4));
            e.setDireccion(rs.getString(5));
            e.setDistrito(rs.getString(6));
            e.setProvincia(rs.getString(7));
            e.setDepartamento(rs.getString(8)); 
            e.setCorreo(rs.getString(9));
            e.setRuc(rs.getString(11));
            e.setRazon_social(rs.getString(12));
  
            lista.add(e);
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
            
        return lista;
    }
     
    public int RegCliente(ClienteMO e) {
           

        String sql="INSERT INTO persona (COD_EMP,COD_CARG,NOM_EMP,APE_EMP,DNI_EMP,OTROS,FECHA,ESTADO) values ('"+e.getIdpersona()+"','"+e.getNombre_persona()+"','"+e.getApellido_persona()+"','"+e.getDni()+"','"+e.getTelefono()+"','"+e.getDepartamento()+"','"+e.getProvincia()+"','"+e.getDistrito()+"','"+e.getDireccion()+"','"+e.getCorreo()+"')";		
         int r=0;
             Connection c= new data().getMysql();
     
        
        Statement st;
        try {
            st = c.createStatement();
              r=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    return r;
                  
    }
       
    public int ModificarEmpleado(ClienteMO e){
        
          String sql="UPDATE tb_empleado set tb_empleado.NOM_EMP='"+e.getNombre_persona()+"' , tb_empleado.APE_EMP='"+e.getApellido_persona()+"' WHERE tb_empleado.DNI_EMP='"+e.getDni()+"' ";
              int r=0;
             Connection c= new data().getMysql();
     
        
        Statement st;
        try {
            st = c.createStatement();
              r=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    return r;
        
        
        
        
        }
    
    public int descativarEmpleado(ClienteMO e){
       String sql="UPDATE tb_empleado set tb_empleado.ESTADO='INACTIVO' WHERE tb_empleado.DNI_EMP='"+e.getDni()+"' ";
            
        int r=0;
             Connection c= new data().getMysql();
     
        
        Statement st;
        try {
            st = c.createStatement();
              r=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    return r;
    
        }
    
    
    
    
    
    
    
}
