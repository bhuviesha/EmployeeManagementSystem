package com.example.Employee.Management.System.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Employee.Management.System.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}