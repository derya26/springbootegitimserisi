package com.derya.sbes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.derya.sbes.entity.User;

//@Repository   //yazmamiza gerek yok JpaRepository den ecxtend ettigimiz icin zaten biliyor
public interface UserRepository extends JpaRepository<User,Long>{

	//User findByFirstName(String firstName);
	
	//@Query("select  * from ")
	//User getResults()
	

}
