package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@Column(name="user_id")
	public String userId;
	
	public String userName;
	
	@OneToMany (fetch = FetchType.LAZY, mappedBy = "User")
	List<TankDetails> tankList;
	
	@OneToMany (fetch = FetchType.LAZY, mappedBy = "user")
	List<CropDetails>  cropList;
	
	
	public User(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	
	public User() {
		
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<TankDetails> getTankList() {
		return tankList;
	}

	public void setTankList(List<TankDetails> tankList) {
		this.tankList = tankList;
	}

	public List<CropDetails> getCropList() {
		return cropList;
	}

	public void setCropList(List<CropDetails> cropList) {
		this.cropList = cropList;
	}
	
	

}
