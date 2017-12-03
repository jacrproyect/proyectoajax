/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import entidades.ClienteMO;
import entidades.EmpleadoMO;
import modelo.ClienteDAO;
import modelo.EmpleadoDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


public class ctrCliente {
    
    
    
    @RequestMapping(value = "/registrar.html",method = RequestMethod.POST)
    public String entrada(@RequestParam("txtnombre") String nombre,
                          @RequestParam("txtapellido") String apellido,  
                          @RequestParam("txtdni") String dni,
                          @RequestParam("txtdireccion") String direccion ,
                          @RequestParam("txttelefono") String telefono,
                          @RequestParam("txtemail") String email,
                          @RequestParam("cmbdepartamento") String departamento,
                          @RequestParam("cmbprovincia") String provincia,
                          @RequestParam("cmbdistrito") String distrito,
                          @RequestParam("cmbdistrito") String correo,
                          @RequestParam("txtusuario") String usuario,
                          @RequestParam("txtcontrasena") String contrasena,
                          @RequestParam("cmbtipoempleado") String tipoempleado, 
                          Model m)
        {
            if (nombre.trim().equals("") || apellido.trim().equals("") || dni.trim().equals("") || 
            direccion.trim().equals("") || telefono.trim().equals("") || email.trim().equals("") ||
            departamento.trim().equals("") || provincia.trim().equals("") || distrito.trim().equals("") ||
            usuario.trim().equals("") || contrasena.trim().equals("") || tipoempleado.trim().equals("")) 
            {
                return "vacio";
            }
            else 
        {
            String msg ="";
            ClienteMO e = new ClienteMO();
            ClienteDAO edao = new ClienteDAO();
            
            e.setNombre_persona(nombre);
            e.setApellido_persona(apellido);
            e.setDni(dni);
            e.setDireccion(direccion);
            e.setTelefono(Integer.parseInt(telefono));
            e.setCorreo(email);
            e.setDepartamento(departamento);
            e.setProvincia(provincia);
            e.setDistrito(distrito);
            e.setCorreo(correo);
            e.setRuc(usuario);
            e.setRazon_social(contrasena);
         
            
            int ax = edao.RegCliente(e);
            
            
            if (ax==1) 
            {
                msg="index"; 
                m.addAttribute("mesan",msg);
                return "rederec";
                
            } else {
                msg="Cliente no registrado" ;
                m.addAttribute("mesan", msg);
                return "Login";
            }
            
        }
    }
            
            
            
            
    
    
}
