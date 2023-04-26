package in.employee_tracking.Model;

import java.io.Serializable;

import org.hibernate.MappingException;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address implements Serializable{
	
	public Address() throws MappingException{
		//do nothing
	}
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "zip_code")
		protected static int zip_code;
		
		@Column 
		public static Integer empid;
		
		@Column(name="street")
		protected static String street;
		
		@Column(name = "city")
		protected static String city;
		
		@Column(name="state")
		protected static String state;
		
		@Column(name="country")
		protected static String country;

		public static Address employee_address;
		
		static {
			System.out.println("Employee View Begins...");
		}

		public Address(Integer Empid) {
			System.out.println("CRUD operation on employee");
		}

		
		public int getEmpid() {
			return empid;
		}



		public static void setEmpid(int Empid) {
			Employee.empid = empid;
		}

		public int getZip_code() {
			return zip_code;
		}



		public static void setZip_code(int zip_code) {
			Address.zip_code = zip_code;
		}



		public String getStreet() {
			return street;
		}



		public static void setStreet(String street) {
			Address.street = street;
		}



		public String getCity() {
			return city;
		}



		public static void setCity(String city) {
			Address.city = city;
		}



		public String getState() {
			return state;
		}



		public static void setState(String state) {
			Address.state = state;
		}



		public String getCountry() {
			return country;
		}



		public static void setCountry(String country) {
			Address.country = country;
		}



		@Override
		public String toString() {
			return "Address [Empid="+empid+"zip_code=" + zip_code + ", street=" + street + ", city=" +city + ", state=" + state + ", country=" +country+"]";
		}



		

	}

