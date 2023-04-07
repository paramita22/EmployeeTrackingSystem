package in.employee_tracking.Model;

	import javax.persistence.Column;


	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "employee")
	public class Employee{
		@Id
		@Column(name = "Empid")
		protected static Integer Empid;

		@Column(name = "employee_name")
		protected static String employee_name;
		
		@Column(name="project_name")
		protected static String project_name;

		@Column(name = "employee_address")
		protected static Address employee_address;

		static {
			System.out.println("Employee.class is loading...");
		}

		public Employee(int Empid, String employee_name, String project_name, Address address) {
			System.out.println("Creating Console App with Hibernate");
		}

		public Integer getEmpid() {
			return Empid;
		}

		public void setEmpid(Integer Empid) {
			Employee.Empid = Empid;
			System.out.println("Employee.setEmpid()");
		}

		public String getEmployeeName() {
			return employee_name;
		}

		public void setEmployeeName(String employee_name) {
			Employee.employee_name = employee_name;
			System.out.println("Employee.setEmployeeName()");
		}
		
		public String getProjectName() {
			return project_name;
		}

		public void setProjectName(String project_name) {
			Employee.project_name = project_name;
			System.out.println("Employee.setProjectName()");
		}
		
		public Address getEmployeeAddress() {
			return employee_address;
		}

		public void setEmployeeAddress(Address employee_address) {
			Employee.employee_address= employee_address;
			System.out.println("Employee.setEmpAddress()");
		}

		@Override
		public String toString() {
			return "Employee [empId=" + Empid + ", empName=" + employee_name + "empaddress="+employee_address+"]";
		}

	}


