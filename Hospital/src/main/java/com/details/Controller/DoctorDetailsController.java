package com.details.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.details.Entity.DoctorDetails;
import com.details.Service.DoctorDetailsService;

@RestController
@RequestMapping("/doctor")
public class DoctorDetailsController {

	@Autowired
	private DoctorDetailsService doctorDetailsService;

	@GetMapping("/details")
	public List<DoctorDetails> findAllDetails() {
		return doctorDetailsService.findAllDetails();
	}

	@GetMapping("/details/{detailsId}")
	public List<DoctorDetails> findById(@PathVariable String detailsId) {
		List<DoctorDetails> details = doctorDetailsService.findByType(detailsId);
		if (details == null) {
			throw new RuntimeException("Details not founded" + detailsId);
		}
		return details;
	}

	@PostMapping("/details")
	public DoctorDetails addDetails(@RequestBody DoctorDetails doctorDetails) {

		doctorDetails.setId(0);
		doctorDetailsService.save(doctorDetails);

		return doctorDetails;
	}

	@PutMapping("/details")
	public DoctorDetails updateDetails(@RequestBody DoctorDetails doctorDetails) {
		
		doctorDetailsService.save(doctorDetails);

		return doctorDetails;
	}
	
//	@DeleteMapping("/details/{detailsId}")
//	public String deleteDetails(@PathVariable int detailsId) {
//		
//		DoctorDetails details = doctorDetailsService.findById(detailsId);
//		if (details == null) {
//			throw new RuntimeException("Details not founded" + detailsId);
//		}
//		doctorDetailsService.deleteById(detailsId);
//		return "Deleted details :"+detailsId;
//	}
}
