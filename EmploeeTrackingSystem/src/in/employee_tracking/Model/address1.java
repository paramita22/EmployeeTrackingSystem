package in.employee_tracking.Model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class address1 implements Serializable{
	
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "zip_code")
		protected static int zip_code;
		
		@Column 
		public static Integer Empid;
		
		@Column(name="street")
		protected static String street;
		
		@Column(name = "city")
		protected static String city;
		
		@Column(name="state")
		protected static String state;
		
		@Column(name="country")
		protected static String country;

		public static address1 employee_address;
		
		static {
			System.out.println("Employee View Begins...");
		}

		public address1(Integer Empid) {
			System.out.println("CRUD operation on employee");
		}

		
		public int getEmpid() {
			return Empid;
		}



		public void setEmpid(int Empid) {
			employee1.Empid = Empid;
		}

		public int getZip_code() {
			return zip_code;
		}



		public void setZip_code(int zip_code) {
			address1.zip_code = zip_code;
		}



		public String getStreet() {
			return street;
		}



		public void setStreet(String street) {
			address1.street = street;
		}



		public String getCity() {
			return city;
		}



		public void setCity(String city) {
			address1.city = city;
		}



		public String getState() {
			return state;
		}



		public void setState(String state) {
			address1.state = state;
		}



		public String getCountry() {
			return country;
		}



		public void setCountry(String country) {
			address1.country = country;
		}



		@Override
		public String toString() {
			return "Address [Empid="+Empid+"zip_code=" + zip_code + ", street=" + street + ", city=" +city + ", state=" + state + ", country=" +country+"]";
		}



		

	}

