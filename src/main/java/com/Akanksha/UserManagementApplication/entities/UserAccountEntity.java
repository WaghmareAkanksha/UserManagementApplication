package com.Akanksha.UserManagementApplication.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ACCOUNT")
public class UserAccountEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Integer userId;
	
	@Column(name = "FIRST_NAME")
	private String fname;
	
	@Column(name = "LAST_NAME")
	private String lname;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "PHONE")
	private Long phno;
	
	@Column(name = "DOB")
	private LocalDate dob;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "CITY")
	private Integer cityId;
	
	@Column(name = "STATE")
	private Integer stateId;
	
	@Column(name = "COUNTRY")
	private Integer countryId;
	
	@Column(name = "")
	private String accStatus;
	
	@Column(name = "CREATED_DATE", updatable = false)
	private LocalDate createDate;
	
	@Column(name = "UPDATED_DATE", insertable = false)
	private LocalDate updateDate;
	
}
