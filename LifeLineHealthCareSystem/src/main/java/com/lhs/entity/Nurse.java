package com.lhs.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Nurse {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String temparature;
	private String bloodPressure;
	private int ECG;
	private String Bloodgroup;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<RegistrationEntity> entity;
	
	
	public List<RegistrationEntity> getEntity() {
		return entity;
	}



	public void setEntity(List<RegistrationEntity> entity) {
		this.entity = entity;
	}



	public Nurse(long id, String temparature, String bloodPressure, int eCG, String bloodgroup,
			RegistrationEntity entity) {
		super();
		this.id = id;
		this.temparature = temparature;
		this.bloodPressure = bloodPressure;
		ECG = eCG;
		Bloodgroup = bloodgroup;
		
	}

	

	public Nurse(long id, String temparature, String bloodPressure, int eCG, String bloodgroup,
			List<RegistrationEntity> entity) {
		super();
		this.id = id;
		this.temparature = temparature;
		this.bloodPressure = bloodPressure;
		ECG = eCG;
		Bloodgroup = bloodgroup;
		this.entity = entity;
	}



	

   
	public int getECG() {
		return ECG;
	}
	public String getBloodgroup() {
		return Bloodgroup;
	}
	public void setECG(int eCG) {
		ECG = eCG;
	}
	public void setBloodgroup(String bloodgroup) {
		Bloodgroup = bloodgroup;
	}
	public long getId() {
		return id;
	}
	public String getTemparature() {
		return temparature;
	}
	public String getBloodPressure() {
		return bloodPressure;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setTemparature(String temparature) {
		this.temparature = temparature;
	}
	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	
	public Nurse() {
	
	}
	@Override
	public String toString() {
		return "Nurse [id=" + id + ", temparature=" + temparature + ", bloodPressure=" + bloodPressure + ", ECG=" + ECG
				+ ", Bloodgroup=" + Bloodgroup + ", entity=" + entity + "]";
	}



	


	 
	
}
	
	