package in.employee.Model;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "employee")
	public class Employee{
		@Id
		@Column(name = "eno")
		private Integer empno;

		@Column(name = "ename", length = 20)
		private String empName;

		@Column(name = "eaddress")
		private String empaddress;
		
		@Column(name="esalary")
		private Double esalary;

		static {
			System.out.println("Employee.class is loading...");
		}

		public Employee() {
			System.out.println("Zero parameter consturctor is used by Hibernate....");
		}

		public Integer getEmpId() {
			return empno;
		}

		public void setEmpId(Integer empId) {
			this.empno = empno;
			System.out.println("Employee.setENo()");
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
			System.out.println("Employee.setEmpName()");
		}

		public Double getEmpSal() {
			return esalary;
		}

		public void setEmpSal(Double esalary) {
			this.esalary= esalary;
			System.out.println("Employee.setEmpSal()");
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empno + ", empName=" + empName + "empaddress="+empaddress+", empSal=" + esalary + "]";
		}

	}


