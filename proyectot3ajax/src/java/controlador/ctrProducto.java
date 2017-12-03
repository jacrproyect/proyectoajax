/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.EmpleadoMO;
import entidades.ProductoMO;
import modelo.EmpleadoDAO;
import modelo.ProductoDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author VAIO
 */
@Controller
public class ctrProducto {

    
    @RequestMapping(value = "/registrar.html",method = RequestMethod.POST)
    public String entrada(@RequestParam("txtnombre") String nombre,
                          @RequestParam("txtapellido") String color,  
                          @RequestParam("txtdni") String stock,
                          @RequestParam("txtdireccion") String preciocompra ,
                          @RequestParam("txttelefono") String precioventa,
                          @RequestParam("cmbdepartamento") String subcategoria,
                          @RequestParam("cmbprovincia") String categoria,
                          @RequestParam("cmbdistrito") String marca,
                          @RequestParam("txtusuario") String proveedor,
            
                          Model m)
        {
            if (nombre.trim().equals("") || color.trim().equals("") || preciocompra.trim().equals("") || 
            precioventa.trim().equals("") || subcategoria.trim().equals("") || categoria.trim().equals("") ||
            marca.trim().equals("") || proveedor.trim().equals("")) 
            {
                return "vacio";
            }
        else 
        {
            String msg ="";
            ProductoMO e = new ProductoMO();
            ProductoDAO edao = new ProductoDAO();
            
            e.setNombre(nombre);
            e.setColor(color);
            e.setStock(Integer.parseInt(stock));
            e.setPrecio_compra(Double.parseDouble(preciocompra));
            e.setPrecio_venta(Double.parseDouble(precioventa));
            e.setSubCategoria(Integer.parseInt(subcategoria));
            e.setIdCategoria(Integer.parseInt(categoria));
            e.setIdMarca(Integer.parseInt(marca));
            e.setIdProveedor(Integer.parseInt(proveedor));
          
         
            int ax = edao.RegProducto(e);
            
            
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
