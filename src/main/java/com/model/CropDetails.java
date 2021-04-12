package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CropDetails {

	@Column(name = "crop_number")
	@Id
	private int cropNum;

	@ManyToOne
	private User user;
	
	@OneToMany (fetch = FetchType.LAZY, mappedBy = "User")
	List<TankDetails> tankList;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		user = user;
	}

	public int getCropNum() {
		return cropNum;
	}

	public void setCropNum(int cropNum) {
		this.cropNum = cropNum;
	}

	public List<TankDetails> getTankList() {
		return tankList;
	}

	public void setTankList(List<TankDetails> tankList) {
		this.tankList = tankList;
	}

}
