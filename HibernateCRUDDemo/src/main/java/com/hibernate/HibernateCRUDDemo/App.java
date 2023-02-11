package com.hibernate.HibernateCRUDDemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.Transaction;



public class App 
{
    public static void main( String[] args )
    {
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        
        Student stud1 = new Student();
        stud1.setId(101);
        stud1.setName("Isha");
        stud1.setCity("Kolkata");
        
        Student stud2 = new Student();
        stud2.setId(102);
        stud2.setName("Amisha");
        stud2.setCity("Ahmedabad");
        
        
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(stud1);
        session.save(stud2);
        
        tx.commit();
        session.close();
        System.out.println("Creation Done Successfully");
    }
}
