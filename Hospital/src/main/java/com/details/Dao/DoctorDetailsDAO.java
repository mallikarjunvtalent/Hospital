package com.details.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.details.Entity.DoctorDetails;

public interface DoctorDetailsDAO extends CrudRepository<DoctorDetails, Integer>{

	List<DoctorDetails> findByType(String type);

	

}
