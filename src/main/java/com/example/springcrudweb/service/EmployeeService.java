package com.example.springcrudweb.service;

import com.example.springcrudweb.model.Employee;

import java.util.List;

public interface EmployeeService {

    //creaete method to do with controller
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);

}
