package com.details.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DoctorDetails {

	@Id
	@GeneratedValue
//	@Column(name = "id")
	private int id;
	
//	@Column(name = "type")
	private String type;
	
//	@Column(name = "name")
	private String name;
	
//	@Column(name = "availableday")
	private String availableday;
	
//	@Column(name = "availableTime")
	private String availableTime;
	
//	@Column(name = "isAvailable")
	private String isAvailable;

	public DoctorDetails() {

	}

	public DoctorDetails(String type, String name, String availableday, String availableTime, String isAvailable) {
		super();
		this.type = type;
		this.name = name;
		this.availableday = availableday;
		this.availableTime = availableTime;
		this.isAvailable = isAvailable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvailableday() {
		return availableday;
	}

	public void setAvailableday(String availableday) {
		this.availableday = availableday;
	}

	public String getAvailableTime() {
		return availableTime;
	}

	public void setAvailableTime(String availableTime) {
		this.availableTime = availableTime;
	}

	public String getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "DoctorDetails [id=" + id + ", type=" + type + ", name=" + name + ", availableday="
				+ availableday + ", availableTime=" + availableTime + ", isAvailable=" + isAvailable
				+ "]";
	}

}
