

package com.edwin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/servicio-usuario")
public class ControllerUsuario {
    
    @RequestMapping(value="/todos", method=RequestMethod.GET, headers=("Accept=text/html")) 
    
    public @ResponseBody String buscartodos(){
        String mensajito="probando el metodo get para enviar a todos los usuarios";
        
        
        return mensajito;
    }
    
}
