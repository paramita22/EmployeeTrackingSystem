package in.employee.entities;


//Dependent Object
public class Address {
	
	//instance variables
	Integer zip_code;
	String street;
	String city;
	String state;
	String country;
	
	
	//Constructor injection
	public Address(Integer zip_code, String street, String city, String state, String country) {
		this.zip_code = zip_code;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}


	public Address() {
		// TODO Auto-generated constructor stub
	}


	public Integer getZip_code() {
		return zip_code;
	}


	public String getStreet() {
		return street;
	}


	public String getCity() {
		return city;
	}


	public String getState() {
		return state;
	}


	public String getCountry() {
		return country;
	}


	public void setZip_code(Integer zip_code) {
		this.zip_code = zip_code;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public void setState(String state) {
		this.state = state;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	
		
		
		
	

}