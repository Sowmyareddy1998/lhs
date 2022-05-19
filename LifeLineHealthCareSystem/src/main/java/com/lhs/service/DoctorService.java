package com.lhs.service;

import java.util.List;

import javax.print.Doc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhs.dao.DoctorRepo;
import com.lhs.dao.SlotRepo;
import com.lhs.entity.Doctor;
import com.lhs.entity.Slot;
@Service
public class DoctorService implements AddDoctor {
	@Autowired
	private DoctorRepo docrepo; 
	
		@Autowired
	private SlotRepo slotrepo;
	
	Doctor doc;

	@Override
	public void addDoctor(Doctor doctor) {
		this.doc=docrepo.save(doc);
		
	}
	
	@Override
	public Doctor getBySpeciality(Doctor doctor) {
		this.  doc=docrepo.findBySpeciality( doctor.getSpeciality());
		return doc;
		}
	
	@Override
	public void addSlot(Slot slot) {
//		System.out.println(this.doc);
//   	slot.setDoctor(doc);
//	    	System.out.println(doc);
			slotrepo.save(slot);
	    	}

//	@Override
//	public List<Doctor> bookingAppoinment(Doctor doctor) {
//		// TODO Auto-generated method stub
//		return null;
//	}


	

}
