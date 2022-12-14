package com.Akanksha.UserManagementApplication.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CITY_DETAILS")
public class CityMasterEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CITY_ID")
	private Integer cityId;
	
	@Column(name = "CITY_NAME")
	private String cityName;
	
	@Column(name= "STATE_ID")
	private Integer stateId;
	
}
