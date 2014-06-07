
package com.edwin.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProbarPersona {
    public static void main(String[] args) {
        
        ApplicationContext ctx= new AnnotationConfigApplicationContext(ServiciosEdwin.class);
        Persona p = ctx.getBean(Persona.class);
       System.out.println( p.ejecutarGracia());
    }
    
}
