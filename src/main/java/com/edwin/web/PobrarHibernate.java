
package com.edwin.web;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Query;
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
            //sesion.save(new Usuario2("emorales2", "xxx", "y"));
       
            //sesion.update(new Usuario2("kcruces", "kkk", "c"));
            
       /*
            Query q = sesion.createQuery("from Uusuario2");
            ArrayList<Usuario2> usuarios=(ArrayList<Usuario2>)  q.list();
            for(Usuario2 usu:usuarios){
                System.out.println(usu);
           }
      */
               
       Criteria c = sesion.createCriteria(Usuario2.class);
       ArrayList<Usuario2> usuarios=(ArrayList<Usuario2>)  c.list();
            for(Usuario2 usu:usuarios){
                System.out.println(usu);
            } c.list();
            
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
