package com.lhs.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lhs.entity.Doctor;
import com.lhs.entity.Slot;
import com.lhs.service.DoctorService;



@RestController
@RequestMapping("/api")
public class DoctorController {
	
	
	@Autowired
	private DoctorService docservice;
	
	
	@PostMapping("/adddoc")
	 public ResponseEntity<String> adddoctor(@RequestBody Doctor doctor)
	 {
		 
		 docservice.addDoctor(doctor);
		 return new ResponseEntity<String>("doctor added successfully",HttpStatus.CREATED);
	 }
	
	
	@GetMapping("/get")
	public  Doctor hhh(@RequestBody Doctor speciality){
	Doctor d=docservice.getBySpeciality(speciality);
	return d;


}
	
	@PostMapping("/AddSlots/{id}")
	public ResponseEntity<String> addslots(@RequestBody Slot slot,@PathVariable("id") Doctor doctor) {
         slot.setDoctor(doctor);
		docservice.addSlot(slot);
		return new ResponseEntity<String>("slot added successfully",HttpStatus.CREATED);
	}
	

}
