package com.lhs.entity;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Slot {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private Date date;
	private LocalTime time;
	@Enumerated(EnumType.STRING)
	private Status apstatus;
	@OneToOne
	private Doctor doctor;
	public Slot() {}
	public Slot(long id, Date date, LocalTime time, Status apstatus, Doctor doctor) {
		super();
		this.id = id;
		this.date = date;
		time = time;
		this.apstatus = apstatus;
		
	}
	
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		time = time;
	}
	public Status getApstatus() {
		return apstatus;
	}
	public void setApstatus(Status apstatus) {
		this.apstatus = apstatus;
	}


	@Override
	public String toString() {
		return "Slot [id=" + id + ", date=" + date + ", Time=" + time + ", apstatus=" + apstatus + ", doctor=" + doctor
				+ "]";
	}
	
	
}
	
