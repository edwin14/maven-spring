
package com.edwin.web;

import org.hibernate.Session;


public class PobrarHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
       Session sesion = HibernateUtilidades.getSessionFactory().openSession();
       //paso 1 empezar la sesion
       sesion.getTransaction().begin();
       //paso 2 HACER UNA OPERACION!!!
       sesion.save(new Usuario2("emorales2", "xxx", "y"));
       //paso 3 hacer el commit
       sesion.getTransaction().commit();
       //cerrar la sesion, NO SE TE OLVIDE NUNCA ESTEEEE
       
       // no olvidar el sesion.flush  para transacciones masivas(pago de nomina)
       sesion.close();
       System.out.println();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
