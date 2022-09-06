package com.Akanksha.UserManagementApplication.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Akanksha.UserManagementApplication.entities.UserAccountEntity;

public interface UserAccountRepository extends JpaRepository<UserAccountEntity, Serializable> {

}
