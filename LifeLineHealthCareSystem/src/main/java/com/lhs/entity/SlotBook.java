package com.lhs.entity;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SlotBook {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private Date dayid;
	private LocalTime slot;
	 
	@Enumerated(EnumType.STRING)
	private Status slotstatus;
	
	@Override
	public String toString() {
		return "SlotBook [id=" + id + ", dayid=" + dayid + ", slot=" + slot + ", status=" + slotstatus + ", doctor="
				+ doctor + "]";
	}

	public SlotBook(long id, Date dayid, LocalTime slot, Status status, Doctor doctor) {
		super();
		this.id = id;
		this.dayid = dayid;
		this.slot = slot;
		this.slotstatus = status;
		this.doctor = doctor;
	}
	
	public SlotBook() {
		
	}

	public Status getStatus() {
		return slotstatus;
	}

	public void setStatus(Status status) {
		this.slotstatus = status;
	}

	@OneToOne(cascade=CascadeType.MERGE,fetch=FetchType.EAGER)
	private Doctor doctor;

	

	
	

	
	


}
