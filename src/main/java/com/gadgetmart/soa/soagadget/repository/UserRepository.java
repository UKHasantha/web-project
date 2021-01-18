package com.gadgetmart.soa.soagadget.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gadgetmart.soa.soagadget.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
