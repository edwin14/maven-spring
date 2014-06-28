
package com.edwin.web;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DAO {
    
private static final ThreadLocal t1 = new ThreadLocal();

private static final SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

public DAO(){ }

public static Session getSession(){
    Session session = (Session) DAO.t1.get();
    if (session == null){
        session = sessionFactory.openSession();
        DAO.t1.set(session);
       }
    return session;
}
    
}
