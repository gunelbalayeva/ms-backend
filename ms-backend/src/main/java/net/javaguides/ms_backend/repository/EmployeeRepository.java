package net.javaguides.ms_backend.repository;

import net.javaguides.ms_backend.entty.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
