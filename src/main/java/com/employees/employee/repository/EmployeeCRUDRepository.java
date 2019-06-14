package com.employees.employee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.employees.employee.model.Employee;


public interface EmployeeCRUDRepository extends CrudRepository<Employee, String> {
	
	List<Employee> findByDepartmentId(Long departmentId);
	List<Employee> findByOrganizationId(Long organizationId);
	
}
