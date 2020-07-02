package bg.cholakov.pma.dao;

import bg.cholakov.pma.entities.Employee;
import org.springframework.data.repository.CrudRepository;



public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
