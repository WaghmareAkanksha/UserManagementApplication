package com.Akanksha.UserManagementApplication.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Akanksha.UserManagementApplication.entities.CountryMasterEnttity;

public interface CountryRepository extends JpaRepository<CountryMasterEnttity, Serializable> {

}
