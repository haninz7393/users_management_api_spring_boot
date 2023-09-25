package com.sol.crudapidata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sol.crudapidata.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
