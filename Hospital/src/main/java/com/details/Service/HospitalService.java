package com.details.Service;

import java.util.List;

import com.details.Entity.Hospital;

public interface HospitalService {

	List<Hospital> findAll();

	Hospital save(Hospital hospital);

	List<Hospital> findByHospitalName(String hospitalName);

}
