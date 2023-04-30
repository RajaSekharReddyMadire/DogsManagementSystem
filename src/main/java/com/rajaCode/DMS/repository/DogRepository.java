package com.rajaCode.DMS.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rajaCode.DMS.Models.Dog;

/**
*
* @author RajasekharaReddy Madire
*/

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);
}
