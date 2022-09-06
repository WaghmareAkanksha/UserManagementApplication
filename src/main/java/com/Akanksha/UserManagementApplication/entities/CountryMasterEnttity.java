package com.Akanksha.UserManagementApplication.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRY_DETAILS")
public class CountryMasterEnttity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COUNTRY_ID")
	private Integer countryId;
	
	@Column(name= "COUNTRY_NAME")
	private String countryName;
	
}
