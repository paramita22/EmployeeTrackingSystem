package in.employee_tracking.controller;

import org.hibernate.service.Service;

import in.employee_tracking.Model.Employee;
import in.employee_tracking.factory.EmployeeServiceFactory;
import in.employee_tracking.service.IEmployeeService;

public class EmployeeControllerImpl implements IEmployeeController{

	IEmployeeService empService;

	@Override
	public String save(Employee employee) {
		empService = EmployeeServiceFactory.getEmployeeService();
		return empService.save(employee);
	}

	@Override
	public Employee findById(Integer Empid) {
		empService = EmployeeServiceFactory.getEmployeeService();
		return empService.findById(Empid);
	}

	@Override
	public String updateById(Employee employee) {
		empService = EmployeeServiceFactory.getEmployeeService();
		return empService.updateById(employee);
	}

	@Override
	public String deleteById(Integer Empid) {
		empService = EmployeeServiceFactory.getEmployeeService();
		return empService.deleteById(Empid);
	}
	
}
