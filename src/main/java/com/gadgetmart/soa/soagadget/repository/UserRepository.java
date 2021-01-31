package com.gadgetmart.soa.soagadget.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gadgetmart.soa.soagadget.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "select * from user u where u.name= name and u.password= password", nativeQuery = true)
	List<User> findBynamepassword(@Param("name") String name, @Param("password") String password);

}
