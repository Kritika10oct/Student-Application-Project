package com.springrest.studentapplication.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	private String studentname; 
	private String studentemail;
	private int studentpassword;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentemail() {
		return studentemail;
	}
	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}
	public int getStudentpassword() {
		return studentpassword;
	}
	public void setStudentpassword(int studentpassword) {
		this.studentpassword = studentpassword;
	}
	@Override
	public String toString() {
		return "student [studentId=" + studentId + ", studentname=" + studentname + ", studentemail=" + studentemail
				+ ", studentpassword=" + studentpassword + "]";
	}
	
	
	
	

}
