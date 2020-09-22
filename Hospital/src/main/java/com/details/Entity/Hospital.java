package com.details.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hospital {

	@Id
	@GeneratedValue
	private int id;
	private String hospitalName;
	private String location;
	private long phoneNo;
	private int noOfBeds;
	private int hospitalId;

	public Hospital() {
		super();
	}

	public Hospital(String hospitalName, String location, long phoneNo, int noOfBeds, int hospitalId) {
		super();
		this.hospitalName = hospitalName;
		this.location = location;
		this.phoneNo = phoneNo;
		this.noOfBeds = noOfBeds;
		this.hospitalId = hospitalId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getNoOfBeds() {
		return noOfBeds;
	}

	public void setNoOfBeds(int noOfBeds) {
		this.noOfBeds = noOfBeds;
	}

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	

}
