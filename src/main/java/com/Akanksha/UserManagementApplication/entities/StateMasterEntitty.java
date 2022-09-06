package com.Akanksha.UserManagementApplication.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "STATE_DETAILS")
public class StateMasterEntitty {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STATE_ID")
	private Integer stateId;
	
	@Column(name= "STATE_NAME")
	private String stateName;
	
	@Column(name = "COUNTRY_ID")
	private Integer countryId;
	
}
