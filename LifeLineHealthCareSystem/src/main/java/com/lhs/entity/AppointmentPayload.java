//package com.lhs.entity;

//import java.time.LocalTime;
//import java.util.Date;
//
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//
//@Entity
//public class AppointmentPayload {
//	
//	private Date dayid;
//    private LocalTime slot1;
//	@Enumerated(EnumType.STRING)
//	private Status apstatus;
//	
//	public Status getApstatus() {
//		return apstatus;
//	}
//	public void setApstatus(Status apstatus) {
//		this.apstatus = apstatus;
//	}
//	
//	public Date getDayid() {
//		return dayid;
//	}
//	public void setDayid(Date dayid) {
//		this.dayid = dayid;
//	}
//	public LocalTime getSlot1() {
//		return slot1;
//	}
//	public void setSlot1(LocalTime slot1) {
//		this.slot1 = slot1;
//	}
//	public AppointmentPayload() {
//		super();
//	}
//	@Override
//	public String toString() {
//		return "AppointmentPayload [apstatus=" + apstatus + ", dayid=" + dayid + ", slot1=" + slot1 + "]";
//	}
//
//}
