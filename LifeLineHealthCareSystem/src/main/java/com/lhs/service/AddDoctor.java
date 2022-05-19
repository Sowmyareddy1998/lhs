package com.lhs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lhs.entity.Doctor;
import com.lhs.entity.Slot;


@Service
public interface AddDoctor {
	public void addDoctor(Doctor doctor);
	public Doctor getBySpeciality(Doctor doctor);
	public void addSlot(Slot slot);
	//public List<Doctor> bookingAppoinment(Doctor doctor); 
	
}
