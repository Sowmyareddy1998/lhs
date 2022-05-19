package com.lhs.service;

import org.springframework.stereotype.Service;

import com.lhs.entity.Nurse;

@Service
public interface AddNurse {
	public Nurse  addNurse(Nurse nurse);

}
