package com.lhs.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lhs.entity.Doctor;
@Repository
public interface DoctorRepo extends JpaRepository<Doctor,Long> {
public Doctor findBySpeciality(String speciality);
//public List<Doctor> findByDoctorNameAndSpecialityAndLocationAndAvailableTime(String doctorname, String speciality, String location,  Date availabieDate);
}
