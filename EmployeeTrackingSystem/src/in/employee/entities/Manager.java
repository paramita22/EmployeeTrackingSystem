package in.employee.entities;

public class Manager extends Employee{
	
	
	public String department_name;
	Integer no_individuals_reporting;
	public String timeSheet_begin;
	public String timeSheet_end;
	
	
	
	//Constructor injection
	public Manager(Integer empid, String employee_name, String employee_email, Integer employee_phone,
			String project_name, Address address, String department_name,
			Integer no_individuals_reporting, String timeSheet_begin, String timeSheet_end) {
		super(empid, employee_name, employee_email, employee_phone,project_name, address);
		this.department_name = department_name;
		this.no_individuals_reporting = no_individuals_reporting;
		this.timeSheet_begin = timeSheet_begin;
		this.timeSheet_end = timeSheet_end;
	}



	public Manager() {
		// TODO Auto-generated constructor stub
	}



	public String getDepartment_name() {
		return department_name;
	}



	public Integer getNo_individuals_reporting() {
		return no_individuals_reporting;
	}



	public String getTimeSheet_begin() {
		return timeSheet_begin;
	}



	public String getTimeSheet_end() {
		return timeSheet_end;
	}



	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}



	public void setNo_individuals_reporting(Integer no_individuals_reporting) {
		this.no_individuals_reporting = no_individuals_reporting;
	}



	public void setTimeSheet_begin(String timeSheet_begin) {
		this.timeSheet_begin = timeSheet_begin;
	}



	public void setTimeSheet_end(String timeSheet_end) {
		this.timeSheet_end = timeSheet_end;
	}
	
	
	
	public void viewManager() {
		System.out.println("########### Manager View Enabled###################");
		System.out.println("Employee ID is :: "+super.getEmpid());
		System.out.println("Employee Name is :: "+super.getEmployee_name());
		System.out.println("Employee Email is :: "+super.getEmployee_email());
		System.out.println("Employee phone is :: "+super.getEmpid());
		System.out.println("Employee address is :: "+super.getAddress().getZip_code()+"\t"+super.getAddress().getStreet()+super.getAddress().getCity()+"\t"+super.getAddress().getState()+"\t"+super.getAddress().getCountry());
		System.out.println("Employee department is ::"+this.department_name);
		System.out.println("Number of Individuals reporting for the project is ::"+this.no_individuals_reporting);
		System.out.println("The start time of the project is ::"+this.timeSheet_begin);
		System.out.println("The scheduled end time for project is :: "+this.timeSheet_end);
		System.out.println();
	}
	

}
