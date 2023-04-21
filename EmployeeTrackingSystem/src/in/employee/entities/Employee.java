package in.employee.entities;


//Target Object
public class Employee {
	
	public Integer empid;
	public String employee_name;
	public String employee_email;
	public Integer employee_phone;
	public String project_name;
	
	//HAS-A variable injection
	private Address address;
	
	
	
	
	//Constructor injection
	public Employee(Integer empid, String employee_name, String employee_email, Integer employee_phone,
			String project_name, Address address) {
		super();
		this.empid = empid;
		this.employee_name = employee_name;
		this.employee_email = employee_email;
		this.employee_phone = employee_phone;
		this.project_name = project_name;
		this.address = address;
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Integer getEmpid() {
		return empid;
	}


	public void setEmpid(Integer empid) {
		this.empid = empid;
	}


	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}


	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}


	public void setEmployee_phone(Integer employee_phone) {
		this.employee_phone = employee_phone;
	}


	public String setProject_name(String project_name) {
		return this.project_name = project_name;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public String getEmployee_name() {
		return employee_name;
	}


	public String getEmployee_email() {
		return employee_email;
	}

	public Integer getEmployee_phone() {
		return employee_phone;
	}

	public String getProject_name() {
		return project_name;
	}

	public Address getAddress() {
		return address;
	}

}

