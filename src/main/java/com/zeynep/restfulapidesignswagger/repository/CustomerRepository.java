package com.zeynep.restfulapidesignswagger.repository;

import com.zeynep.restfulapidesignswagger.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}