
package com.lhs.entity;

import java.util.ArrayList;
import java.util.List;
import com.lhs.entity.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class RegistrationEntity {
	
	
	
	
	
	private String firstname;

	private String lastname;
	private String username;
	private String password;

	private String dob;

	private String gender;

	private long mobileno;


	@Override
	public String toString() {
		return "RegistrationEntity [firstname=" + firstname + ", lastname=" + lastname + ", username=" + username
				+ ", password=" + password + ", dob=" + dob + ", gender=" + gender + ", mobileno=" + mobileno + ", id="
				+ id + ", role=" + role + ", rolen=" + rolen + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	List<Roles> role=  new ArrayList<>();
	
	
     public RegistrationEntity(String firstname, String lastname, String username, String password, String dob,
			String gender, long mobileno, int id, List<Roles> role,  String rolen) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.dob = dob;
		this.gender = gender;
		this.mobileno = mobileno;
		this.id = id;
		this.role = role;
		
		this.rolen = rolen;
	}

	

	private String rolen;


	public List<Roles> getRole() {
		return role;
	}

	public RegistrationEntity() {
		super();
	}

	public void setRole(List<Roles> role) {
		this.role = role;
	}

	public String getRolen() {
		return rolen;
	}

	public void setRolen(String rolen) {
		this.rolen = rolen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	
	
	
}
