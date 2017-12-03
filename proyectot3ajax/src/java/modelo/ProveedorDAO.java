/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entidades.ProveedorMO;
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
 * @author VAIO
 */
public class ProveedorDAO {

    public ProveedorDAO() {
    }
    
     public String ContEmpleados(){
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
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ob;
        } 
     
    public List<ProveedorMO> obtener() {
        List<ProveedorMO> lista= new ArrayList();
        
        String sql="select e.nom_emp as Nombre,e.ape_emp as Apellidos,e.dni_emp as Dni,e.OTROS as Tipo,e.FECHA AS FRegistro,c.DESC_CARGO as Cargo from tb_empleado e inner join TB_CARGOEMP c on e.COD_CARG=c.COD_CAREMP where e.estado='ACTIVO'" ;
         Connection c= new data().getMysql();
        
   
        try {
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            ProveedorMO e=new ProveedorMO();
            e.setRazonsocial(rs.getString(1));
            e.setDireccion(rs.getString(2));
            e.setSitioweb(rs.getString(3));
            e.setTelefono(rs.getString(4));
            e.setObservaciones(rs.getString(5));
            e.setFechareg(rs.getDate(6));
            e.setCorreo(rs.getString(7));
            e.setContacto(rs.getString(8));
          
            lista.add(e);
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
            
        return lista;
    }
     
    public int Regproveedor(ProveedorMO e) {
           

        	
        String sql="INSERT INTO proveedor (`RazonSocial`, `Direccion`, `SitioWeb`, `Correo`, `Telefono`, `Observaciones`, `FechaReg`, `Contacto`)  VALUES ('"+ e.getRazonsocial() +"', '"+ e.getDireccion() +"', '"+ e.getSitioweb() +"', '"+ e.getCorreo() +"', '"+e.getTelefono()+"', '"+e.getObservaciones()+"', '"+e.getFechareg()+"', '"+e.getContacto()+"')";
       
        
        int r=0;
             Connection c= new data().getMysql();
     
        
        Statement st;
        try {
            st = c.createStatement();
              r=st.executeUpdate(sql);
              
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    return r;
                  
    }
       
    public int ModificarEmpleado(ProveedorMO e){
        
          String sql="UPDATE tb_empleado set tb_empleado.NOM_EMP='"+e.getRazonsocial()+"' , tb_empleado.APE_EMP='"+e.getContacto()+"' WHERE tb_empleado.DNI_EMP='"+e.getIdproveedor()+"' ";
              int r=0;
             Connection c= new data().getMysql();
     
        
        Statement st;
        try {
            st = c.createStatement();
              r=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    return r;
        
        
        
        
        }
    
    public int descativarEmpleado(ProveedorMO e){
       String sql="UPDATE tb_empleado set tb_empleado.ESTADO='INACTIVO' WHERE tb_empleado.DNI_EMP='"+e.getIdproveedor()+"' ";
            
        int r=0;
             Connection c= new data().getMysql();
     
        
        Statement st;
        try {
            st = c.createStatement();
              r=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    return r;
    
        }
    
    
}
