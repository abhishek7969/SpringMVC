package com.abhi.school;

import java.util.ArrayList;

public class Student {
	
	private String studentName;
	private String studentHobby;
	
	private String studentMobile;
	private String studentDOB;
	private ArrayList<String> studentSkills;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public String getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}
	public String getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(String studentDOB) {
		this.studentDOB = studentDOB;
	}
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}

}
