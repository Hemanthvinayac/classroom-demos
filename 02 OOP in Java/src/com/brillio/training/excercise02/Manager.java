package com.brillio.training.excercise02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Manager extends Employee {

	private String currentProject;
	private Date projectStartDate;
	
	public Manager() {
	}

	public Manager(int employeeId, String employeeName, double salary, String currentProject, String projectStartDate) {
		super(employeeId, employeeName, salary);
		this.currentProject = currentProject;
		this.projectStartDate = stringToDate(projectStartDate);
	}

	public String getCurrentProject() {
		return currentProject;
	}

	public void setCurrentProject(String currentProject) {
		this.currentProject = currentProject;
	}

	public Date getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(String projectStartDate) {
		this.projectStartDate = stringToDate(projectStartDate);
	}
	private static Date stringToDate(String input) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(input);
		} catch (ParseException e) {
			return null;
		}
	}
	
}
