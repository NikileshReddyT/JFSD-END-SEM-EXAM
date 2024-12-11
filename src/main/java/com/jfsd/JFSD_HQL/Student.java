package com.jfsd.JFSD_HQL;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	int sid;
	String sname;
	char gender;
	String department;
	long contact;
	float cgpa;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "\n1.Student sid = " + sid + "\n2.student name = " + sname + "\n3.gender = " + gender + "\n4.department = " + department
				+ "\n5.contact = " + contact + "\n6.cgpa = " + cgpa + "\n";
	}
	
}
