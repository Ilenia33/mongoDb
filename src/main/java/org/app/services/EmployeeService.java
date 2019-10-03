package org.app.services;


import org.app.controller.EmployeeDTO;
import org.app.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

@Service
public class EmployeeService {
   @Autowired
   private EmployeeRepository employeeRepository;

   public Employee save(EmployeeDTO employeeDTO) {
       Employee employee = new Employee();
       employee.setCode(employeeDTO.getCode());
       employee.setFullName(employeeDTO.getFullname());
       //Date data = (Date) Date.from(employeeDTO.getStartDate().atStartOfDay(ZoneId.of("Europe/Rome")).toInstant());
       //System.out.println(data);
       //employee.setStartDate(data);
       employeeRepository.insert(employee);
       return employee;

   }

}
