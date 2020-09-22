package com.details.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.details.Dao.HospitalDao;
import com.details.Entity.Hospital;

@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalDao hospitalDao;
	
	@Override
	public List<Hospital> findAll() {
		return (List<Hospital>) hospitalDao.findAll();
	}

	@Override
	public Hospital save(Hospital hospital) {
		return hospitalDao.save(hospital);
	}

	@Override
	public List<Hospital> findByHospitalName(String hospitalName) {
		return hospitalDao.findByHospitalName(hospitalName);
	}

}
