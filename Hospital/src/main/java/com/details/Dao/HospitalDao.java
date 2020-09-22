package com.details.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.details.Entity.Hospital;

public interface HospitalDao extends CrudRepository<Hospital, Integer>{

	List<Hospital> findByHospitalName(String hospitalName);

}
