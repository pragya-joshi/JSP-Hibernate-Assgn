package com.hibernate.mapmany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import java.util.*;

@Entity
public class Project {
	@Id
	private int pid;
	private String projectName;
	
	@ManyToMany(mappedBy="projects")
	private List<Employee>emps;

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", projectName=" + projectName + ", emps=" + emps + "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	public Project(int pid, String projectName, List<Employee> emps) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.emps = emps;
	}

	public Project() {
		super();
	}
	
}
