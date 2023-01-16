package com.demo.test.DTO.update;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class updateDTO implements Serializable

{
 private String email;
 private String pwd;
 
 public updateDTO() {
	 System.out.println(this.getClass().getSimpleName()+"Created");
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
	return "LoginDTO [email=" + email + ", pwd=" + pwd + "]";
}
 
}
