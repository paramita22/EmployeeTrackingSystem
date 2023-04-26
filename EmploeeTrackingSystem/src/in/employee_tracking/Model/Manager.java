package in.employee_tracking.Model;

import java.io.Serializable;

import org.hibernate.MappingException;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@Entity
public class Manager extends Employee implements Serializable{

		public Manager() throws MappingException{
			//o nothing
		}

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



		public Manager(Integer empid,String project_name,String Department_name,Address employee_address){
			super(empid, getEmployee_name(), project_name, employee_address);
			System.out.println("Manager class is Loading...");
		}



		@EmbeddedId
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column
		public static Integer empid;
		
		@Column
		private static String project_name;
		
		@Column
		private String Department_name;
		
		@Column
		private int NoIndReport;
		
		@Column
		private Date Timesheet_begin;
		
		@Column
		private Date Timesheet_end;


		public static int getEmpid() {
			return empid;
		}

		public static void setEmpid(Integer Empid) {
			Employee.empid = empid;
		}


		public static String getProject_name() {
			return project_name;
		}


		public static void setProject_name(String project_name) {
			Employee.project_name=project_name;
		}





		public String getDepartment_name() {
			return Department_name;
		}





		public void setDepartment_name(String Department_name) {
			this.Department_name = Department_name;
		}





		public int getNoIndReport() {
			return NoIndReport;
		}





		public void setNoIndReport(int noIndReport) {
			this.NoIndReport = noIndReport;
		}





		public Date getTimesheet_begin() {
			return Timesheet_begin;
		}





		public void setTimesheet_begin(Date TimeSheet_begin) {
			this.Timesheet_begin = TimeSheet_begin;
		}





		public Date getTimesheet_end() {
			return Timesheet_end;
		}





		public void setTimesheet_end(Date Timesheet_end) {
			this.Timesheet_end = Timesheet_end;
		}





		@Override
		public String toString() {
			return "Manager [Project_name=" + project_name + ", Department_name=" + Department_name + ", NoIndReport=" +NoIndReport + ", Timesheet_begin=" + Timesheet_begin + ", Timesheet_end=" +Timesheet_end+"]";
		}

	}

