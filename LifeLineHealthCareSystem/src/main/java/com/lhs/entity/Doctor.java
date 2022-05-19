package com.lhs.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Doctor {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private	long id;
	private String firstname;
	private String lastname;
	private String doctorname;
	private String mobilename;
	private String email;
	private String gender;
	private String speciality;
	private String location;
	@Enumerated(EnumType.STRING)
    private DoctorAvailability status;
	private int experience;
    private Date availabieDate;
    private String  fee;
    
    
    
    public Doctor() {
    
    }
    
    
    
    
    
    
    
	public long getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public String getMobilename() {
		return mobilename;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
	public String getSpeciality() {
		return speciality;
	}
	public String getLocation() {
		return location;
	}
	public DoctorAvailability getStatus() {
		return status;
	}
	public int getExperience() {
		return experience;
	}
	public Date getAvailabieDate() {
		return availabieDate;
	}
	public String getFee() {
		return fee;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setStatus(DoctorAvailability status) {
		this.status = status;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public void setAvailabieDate(Date availabieDate) {
		this.availabieDate = availabieDate;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public Doctor(long id, String firstname, String lastname, String doctorname, String mobilename, String email,
			String gender, String speciality, String location, DoctorAvailability status, int experience,
			Date availabieDate, String fee) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.doctorname = doctorname;
		this.mobilename = mobilename;
		this.email = email;
		this.gender = gender;
		this.speciality = speciality;
		this.location = location;
		this.status = status;
		this.experience = experience;
		this.availabieDate = availabieDate;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", doctorname=" + doctorname
				+ ", mobilename=" + mobilename + ", email=" + email + ", gender=" + gender + ", speciality="
				+ speciality + ", location=" + location + ", status=" + status + ", experience=" + experience
				+ ", availabieDate=" + availabieDate + ", fee=" + fee + "]";
	}
    
}
	
	




