/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.EmpleadoMO;
import entidades.ProveedorMO;
import java.util.Date;
import modelo.EmpleadoDAO;
import modelo.ProveedorDAO;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author VAIO
 */
public class ctrProveedor {
    
    
     @RequestMapping(value = "/registrar.html",method = RequestMethod.POST)
    public String entrada(@RequestParam("txtnombre") String Razonsocial,
                          @RequestParam("txtapellido") String Direccion,  
                          @RequestParam("txtdni") String Sitioweb,
                          @RequestParam("txtdireccion") String Correo ,
                          @RequestParam("txttelefono") String Telefono,
                          @RequestParam("txtemail") String Observaciones,
                          @RequestParam("cmbdepartamento") Date Fechareg,
                          @RequestParam("cmbprovincia") String Contacto,
                   
                          Model m)
        {
            if (Razonsocial.trim().equals("") || Direccion.trim().equals("") || 
             Sitioweb.trim().equals("") ||  Correo.trim().equals("") || Telefono.trim().equals("") ||
            Observaciones.trim().equals("") || Fechareg.toString().equals("") || Contacto.trim().equals("")) 
            {
                return "vacio";
            }
        else 
        {
            String msg ="";
            ProveedorMO e = new ProveedorMO();
            ProveedorDAO edao = new ProveedorDAO();
            
   
                    
            e.setRazonsocial(Razonsocial);
            e.setDireccion(Direccion);
            e.setSitioweb(Sitioweb);
            e.setCorreo(Correo);
            e.setTelefono((Telefono)); 
            e.setObservaciones(Observaciones);
            e.setFechareg(Fechareg);
            e.setContacto(Contacto);
          
            
            int ax = edao.Regproveedor(e);
            
            
            if (ax==1) 
            {
                msg="index"; 
                m.addAttribute("mesan",msg);
                return "rederec";
                
            } else {
                msg="Empleado no registrado" ;
                m.addAttribute("mesan", msg);
                return "Login";
            }
            
        }
    }
    
    
    
    
}
