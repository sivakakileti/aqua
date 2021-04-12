package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@IdClass(UserCropTank.class)
public class UserCropTank implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int compositeKey;
	
@Id

 private Long userId;
 

@Id

 private Long crop_number;

@Id
 
 private Long tank_number;


@Id

private String area_name;
 

	
	

}
