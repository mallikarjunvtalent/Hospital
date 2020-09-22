package com.details.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.details.Entity.Hospital;
import com.details.Service.HospitalService;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;

	@GetMapping("/details")
	public List<Hospital> findAll(){
		return hospitalService.findAll();
	}
	
	@GetMapping("/details/{hospitalName}")
	public List<Hospital> findByHospitalName(@PathVariable("hospitalName") String hospitalName) {
		List<Hospital> hospitals = hospitalService.findByHospitalName(hospitalName);
		return hospitals;
	}
	
	@PostMapping("/details")
	public Hospital save(@RequestBody Hospital hospital) {
		
		hospital.setId(0);
		return hospitalService.save(hospital);
	}
	
}
