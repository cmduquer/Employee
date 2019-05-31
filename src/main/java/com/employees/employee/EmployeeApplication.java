package com.employees.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.employees.employee.model.Employee;
import com.employees.employee.repository.EmployeeRepository;
import com.employees.employee.repository.EmployeeRepositoryImpl;

import lombok.extern.slf4j.Slf4j;

@EnableDiscoveryClient
@Slf4j
@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
	
	@Bean
	EmployeeRepository repository() {
		
		EmployeeRepository repository = new EmployeeRepositoryImpl();
		repository.add(new Employee(1L, 1L, "John Smith", 34, "Analyst"));
		repository.add(new Employee(1L, 1L, "Darren Hamilton", 37, "Manager"));
		repository.add(new Employee(1L, 1L, "Tom Scott", 26, "Developer"));
		repository.add(new Employee(1L, 2L, "Anna London", 39, "Analyst"));		
		repository.add(new Employee(1L, 2L, "Patrick Dempsey", 27, "Developer"));
		repository.add(new Employee(2L, 3L, "Kevin Price", 38, "Developer"));		
		repository.add(new Employee(2L, 3L, "Ian Scott", 34, "Developer"));
		repository.add(new Employee(2L, 3L, "Andrew Campton", 30, "Manager"));
		repository.add(new Employee(2L, 4L, "Steve Franklin", 25, "Developer"));
		repository.add(new Employee(2L, 4L, "Elisabeth Smith", 30, "Developer"));
		log.info("Repository: {}", repository);
		return repository;
	}

}
