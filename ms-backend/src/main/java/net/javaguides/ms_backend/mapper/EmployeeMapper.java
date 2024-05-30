package net.javaguides.ms_backend.mapper;

import net.javaguides.ms_backend.dto.EmployeeDto;
import net.javaguides.ms_backend.entty.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
      return new EmployeeDto(
              employee.getId(),
              employee.getFirst_name(),
              employee.getLast_name(),
              employee.getEmail()
      );
    }
    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(
          employeeDto.getId(),
          employeeDto.getFirstName(),
          employeeDto.getLastName(),
          employeeDto.getEmail()
        );
    }
}
