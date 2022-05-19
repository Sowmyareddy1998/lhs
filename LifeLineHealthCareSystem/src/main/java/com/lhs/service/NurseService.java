package com.lhs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lhs.dao.NurseRepo;
import com.lhs.entity.Nurse;
import com.lhs.entity.RegistrationEntity;
import com.lhs.entity.Roles;

@Service
public class NurseService implements AddNurse {
	
	
	@Autowired
	private NurseRepo nurserepo;

	

	@Override
	public Nurse addNurse(Nurse nurse) {
		RegistrationEntity entity=new RegistrationEntity();
		List<RegistrationEntity> entity1=new ArrayList<>();
       
      
		nurse.setEntity(entity1);
		nurse.getEntity().add(entity);
		 Nurse s1= nurserepo.save(nurse);
		 return s1;
		
	}
;
}
