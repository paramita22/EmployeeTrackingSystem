package in.employee_tracking.service;

import in.employee_tracking.Model.employee1;
import in.employee_tracking.dao.IEmployeeDao;
import in.employee_tracking.factory.EmployeeDaoFactory;

public class EmployeeServiceImpl implements IEmployeeService {
	
	IEmployeeDao empDao;

	@Override
	public employee1 findById(Integer Empid) {
		empDao = EmployeeDaoFactory.getEmployeeDao();
		return empDao.findById(Empid);	
	}

	@Override
	public String deleteById(Integer Empid) {
		empDao = EmployeeDaoFactory.getEmployeeDao();
		return empDao.deleteById(Empid);	}

	@Override
	public String updateById(employee1 employee) {
		empDao = EmployeeDaoFactory.getEmployeeDao();
		return empDao.updateById(employee);
	}

	@Override
	public String save(employee1 employee) {
		empDao = EmployeeDaoFactory.getEmployeeDao();
		return empDao.save(employee);
	}

}
