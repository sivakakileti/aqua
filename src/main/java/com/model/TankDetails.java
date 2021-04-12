package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TankDetails {
	@Id
	@Column(name="tank_number")
	private int tankNum;
	
	private int areaOftank;
	
	private String address;
	
	@ManyToOne
	private User User;
	
	@ManyToOne
	private CropDetails cropDetails;

	public User getUser() {
		return User;
	}

	public void setUser(User user) {
		User = user;
	}

	public int getTankNum() {
		return tankNum;
	}

	public void setTankNum(int tankNum) {
		this.tankNum = tankNum;
	}

	public int getAreaOftank() {
		return areaOftank;
	}

	public void setAreaOftank(int areaOftank) {
		this.areaOftank = areaOftank;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public CropDetails getCropDetails() {
		return cropDetails;
	}

	public void setCropDetails(CropDetails cropDetails) {
		this.cropDetails = cropDetails;
	}
	
	
	

}
