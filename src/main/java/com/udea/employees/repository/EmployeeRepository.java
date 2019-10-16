package com.udea.employees.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.udea.employees.model.Employee;



//@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface EmployeeRepository extends MongoRepository<Employee, String> {
    
}
