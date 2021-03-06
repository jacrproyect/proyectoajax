/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entidades.EmpleadoMO;
import entidades.ProductoMO;
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
public class ProductoDAO {

    public ProductoDAO() {
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
     
    public List<EmpleadoMO> obtener() {
        List<EmpleadoMO> lista= new ArrayList();
        
        String sql="select e.nom_emp as Nombre,e.ape_emp as Apellidos,e.dni_emp as Dni,e.OTROS as Tipo,e.FECHA AS FRegistro,c.DESC_CARGO as Cargo from tb_empleado e inner join TB_CARGOEMP c on e.COD_CARG=c.COD_CAREMP where e.estado='ACTIVO'" ;
         Connection c= new data().getMysql();
        
   
        try {
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            EmpleadoMO e=new EmpleadoMO();
            e.setNombre_persona(rs.getString(1));
            e.setApellido_persona(rs.getString(2));
            e.setDni(rs.getString(3));
            e.setAcceso(rs.getString(6));
          
            lista.add(e);
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
            
        return lista;
    }
     
    public int RegProducto(ProductoMO e) {
	
        String sql="INSERT INTO producto (`Nombre`, `Color`, `Stock`, `Precio_Compra`, `Precio_Venta`, `SubCategoria_idSubCategoria`, `SubCategoria_Categoria_idCategoria`, `Marca_idMarca`, `Proveedor_idProveedor`)  VALUES ('"+ e.getNombre() +"', '"+ e.getStock() +"', '"+ e.getPrecio_compra() +"','"+ e.getPrecio_venta() +"', '" + e.getSubCategoria()+ "', '"+e.getIdCategoria()+"', '"+e.getIdMarca()+"', '"+e.getIdProveedor()+"')";
        
        int r=0;
             Connection c= new data().getMysql();
     
        
        Statement st;
        try {
            st = c.createStatement();
              r=st.executeUpdate(sql);
       
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    return r;
                  
    }
       
    public int ModificarEmpleado(EmpleadoMO e){
        
          String sql="UPDATE tb_empleado set tb_empleado.NOM_EMP='"+e.getNombre_persona()+"' , tb_empleado.APE_EMP='"+e.getApellido_persona()+"' WHERE tb_empleado.DNI_EMP='"+e.getDni()+"' ";
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
    
    public int descativarEmpleado(EmpleadoMO e){
       String sql="UPDATE tb_empleado set tb_empleado.ESTADO='INACTIVO' WHERE tb_empleado.DNI_EMP='"+e.getDni()+"' ";
            
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
