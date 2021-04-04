package se.lexicon.mvc_employee_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.mvc_employee_management.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
