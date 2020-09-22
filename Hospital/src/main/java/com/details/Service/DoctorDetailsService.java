package com.details.Service;

import java.util.List;

import com.details.Entity.DoctorDetails;

public interface DoctorDetailsService {

	public void save(DoctorDetails doctorDetails);

	public List<DoctorDetails> findAllDetails();

	public List<DoctorDetails> findByType(String id);


	public void deleteById(int detailsId);
	
}
