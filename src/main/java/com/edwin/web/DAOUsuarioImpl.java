
package com.edwin.web;

import java.util.ArrayList;

public class DAOUsuarioImpl {
    
    public static ArrayList<Usuario2> implementar(){
        
        ArrayList<Usuario2> arreglousuario= new ArrayList<Usuario2>();
        
        Usuario2 u1;
        
        u1 = new Usuario2("jcampos","xxx" , "y");
        arreglousuario.add(u1);
        
        u1 = new Usuario2("analopez","yyy" , "y");
        arreglousuario.add(u1);
        
        u1 = new Usuario2("pedroperez","www" , "n");
        arreglousuario.add(u1);
        
        return arreglousuario;
    }
    
}
