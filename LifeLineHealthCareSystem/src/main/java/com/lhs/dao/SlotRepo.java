package com.lhs.dao;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lhs.entity.Slot;
@Repository
public interface SlotRepo extends JpaRepository<Slot, Long> {

	

}