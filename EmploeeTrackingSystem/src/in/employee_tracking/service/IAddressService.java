package in.employee_tracking.service;
	
import in.employee_tracking.Model.address1;


	public interface IAddressService {

		String findById(Integer Empid);

		String deleteById(Integer Empid);

		String updateById(Integer Empid);

		String save1(address1 address1);

	}
