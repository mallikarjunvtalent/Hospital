package com.details.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.details.Dao.DoctorDetailsDAO;
import com.details.Entity.DoctorDetails;

@Service
public class DoctorDetailsServiceImpl implements DoctorDetailsService {

	@Autowired
	private DoctorDetailsDAO doctorDetailsDAO;

	@Override

	public void save(DoctorDetails doctorDetails) {
		doctorDetailsDAO.save(doctorDetails);
	}

	@Override
	public List<DoctorDetails> findAllDetails() {

		return (List<DoctorDetails>) doctorDetailsDAO.findAll();
	}

	@Override

	public List<DoctorDetails> findByType(String type) {

		return doctorDetailsDAO.findByType(type);

	}

	@Override

	public void deleteById(int detailsId) {
		doctorDetailsDAO.deleteById(detailsId);
		;
	}

}
