package com.sangram.model;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.sangram.custannotations.IsValidEmail;

public class Student {

	@Pattern(regexp="[^0-9]*")
	private String uname;
	@Size(min=10,max=20) @IsValidEmail(domain="@tid.com")
	private String uemail;
	@Size(min=6,max=15,message="password must be between {min} to {max} characters")
	private String upwd;
	@Max(2222)
	private Long umob;
	@Past
	private Date dob;
	/*private ArrayList<String> skills;*/
	private Address addr;

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Long getUmob() {
		return umob;
	}

	public void setUmob(Long umob) {
		this.umob = umob;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	/*public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}
*/
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

}
