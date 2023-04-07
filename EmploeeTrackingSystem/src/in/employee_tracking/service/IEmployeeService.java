package in.employee_tracking.service;

import in.employee_tracking.Model.Employee;

public interface IEmployeeService {

	Employee findById(Integer empid);

	String deleteById(Integer empid);

	String updateById(Employee employee);

	String save(Employee employee);

}
