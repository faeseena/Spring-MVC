package com.demo.test.DTO.Registration;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="stud_details")
public class studentDTO implements Serializable

{
@Id
@GenericGenerator(name="ref",strategy = "increment")
@GeneratedValue(generator = "ref")
private int sid;
@Column(name = "Stundent_name")
private String sname;
@Column(name = "Stundent_address")
private String Addr;
@Column(name = "Stundent_course")
private String course;
@Column(name = "Stundent_place")
private String place;
@Column(name = "Stundent_age")
private int sage;
@Column(name="email")
private String email;
@Column(name="password")
private String pwd;
public studentDTO() {
	System.out.println(this.getClass().getSimpleName()+"created");
}

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

public String getAddr() {
	return Addr;
}

public void setAddr(String addr) {
	Addr = addr;
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
}

public int getSage() {
	return sage;
}

public void setSage(int sage) {
	this.sage = sage;
}


public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

@Override
public String toString() {
	return "studentDTO [sid=" + sid + ", sname=" + sname + ", Addr=" + Addr + ", course=" + course + ", place=" + place
			+ ", sage=" + sage + ", email=" + email + ", pwd=" + pwd + "]";
}



}
