/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author HP
 */
@Controller
public class homeController {
    
    @RequestMapping ("gestionarEmpleado.htm")
    public ModelAndView gestionarEmpleado(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("GestionarEmpleado");
        return mav;
    }
}
