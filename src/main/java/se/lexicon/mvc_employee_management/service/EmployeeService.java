package se.lexicon.mvc_employee_management.service;

import se.lexicon.mvc_employee_management.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
}
