package com.hibernate.mapmany;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class TestQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
		
        Scanner in = new Scanner(System.in);
		System.out.println("Enter empid : ");
		
		Employee e = (Employee) session.get(Employee.class, in.nextInt());
		
		List<Project> projects = e.getProjects();
		for(Project proj : projects) {
			System.out.println(proj.getPid() + " " + proj.getProjectName());
		}
		System.out.println("Enter pid : ");
		Project p = (Project) session.get(Project.class, in.nextInt());
	
		List<Employee> employees = p.getEmps();
		for(Employee emp : employees) {
			System.out.println(emp.getId() + " " + emp.getName());
		}
	}

}
