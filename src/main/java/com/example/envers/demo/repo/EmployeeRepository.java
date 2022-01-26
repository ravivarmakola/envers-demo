package com.example.envers.demo.repo;

import com.example.envers.demo.dbo.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "employee")
public interface EmployeeRepository extends
        JpaRepository<Employee, Long>, // or CrudRepository<Employee, Long>
        RevisionRepository<Employee, Long, Long> {

}
