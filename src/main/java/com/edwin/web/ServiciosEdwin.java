

package com.edwin.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiciosEdwin {

@Bean
Persona ejecutarGracia(){
    
    return new CuentaChistes();
}
    
}
