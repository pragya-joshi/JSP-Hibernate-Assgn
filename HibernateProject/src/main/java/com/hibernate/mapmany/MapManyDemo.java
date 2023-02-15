package com.hibernate.mapmany;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapManyDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();
        
        Employee e1=new Employee();
        Employee e2=new Employee();
        
        e1.setId(101);
        e1.setName("Pragya");
        
        e2.setId(102);
        e2.setName("Parul");
        
        Project p1=new Project();
        Project p2=new Project();
        
        p1.setPid(501);
        p1.setProjectName("HR Mgmt System");
        
        p2.setPid(502);
        p2.setProjectName("Automation Project");
        
        List<Employee>list1=new ArrayList<Employee>();
        List<Project>list2=new ArrayList<Project>();
        
        
        list1.add(e1);
        list1.add(e2);
        
        list2.add(p1);
        list2.add(p2);
        
        e1.setProjects(list2);
        p2.setEmps(list1);
        
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);
        
        
       
        tx.commit();
        session.close();
	}
}
