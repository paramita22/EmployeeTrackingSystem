package in.employee_tracking.Model;

import java.io.Serializable;

import org.hibernate.MappingException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable{
	
	public Employee()throws MappingException{
		//do nothing
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	public static int empid;
	
	@Column
	private static String employee_name;
	
	@Column
	protected
	static String project_name;
	
	@Column
	static Address employee_address=new Address(empid);

	static {
		System.out.println("Employee.class is loading...");
	}

	public Employee(Integer empid, String employee_name, String project_name, Address employee_address) {

		System.out.println("Initialising parametrized constructor for HAS-A relationship with Address class");
	}


		public static int getEmpid() {
			return empid;
		}



		public static void setEmpid(int empid) {
			Employee.empid = empid;
		}



		public static String getEmployee_name() {
			return employee_name;
		}



		public static void setEmployee_name(String employee_name) {
			Employee.employee_name = employee_name;
		}



		public static String getProject_name() {
			return project_name;
		}



		public static void setProject_name(String project_name) {
			Employee.project_name = project_name;
		}



		public static Address getEmployee_address() {
			return employee_address;
		}



		public static void setEmployee_address(Address employee_address) {
			Employee.employee_address = employee_address;
		}



		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		
		@Override
		public String toString() {
			return "Employee [EmpId=" + empid + ", empName=" + getEmployee_name() +", project_name="+project_name+ "empaddress="+employee_address+"]";
		}


	

	}


