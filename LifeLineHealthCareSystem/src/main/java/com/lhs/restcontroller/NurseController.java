package com.lhs.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lhs.dao.RegistrationRepo;
import com.lhs.entity.Nurse;
import com.lhs.entity.RegistrationEntity;
import com.lhs.service.NurseService;
import com.lhs.service.RegistrationService;

@RestController
public class NurseController {
	
	@Autowired
	private NurseService nurseservice;
	@Autowired
	private RegistrationService  service;
	
	@PostMapping("/predata")
public ResponseEntity<String> addNurse(@RequestBody Nurse nurse)
{
	nurseservice.addNurse(nurse);
	
	 return new ResponseEntity<String>("Added pre consulting data",HttpStatus.CREATED);
	
}
	
	
	@PostMapping("/nurse/{id}")
	public ResponseEntity<String> ad(@RequestBody Nurse nurse,@PathVariable("id")  List<RegistrationEntity> entity)
	{
		
//		 entity.setId(entity.
//		
//		 nurse.setEntity(entity);
		// service.addAccount(register);
		
			
		 nurseservice.addNurse(nurse);
		
		 return new ResponseEntity<String>("Added pre consulting data",HttpStatus.CREATED);
		
	}

}
