package in.employee.main;


import java.io.*;

import in.employee.entities.Address;
import in.employee.entities.Manager;

public class TestApp {
	
		static Integer empid,employee_phone = null,zip_code,no_individuals_reporting;
		static	String employee_name,employee_email = null,project_name,street,city,state,country,department_name,timeSheet_begin,timeSheet_end;
	
	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//Creating Dependent Object
		
	
		
		Address address=new Address(zip_code, street,city, state, country);
		Manager m=new Manager(empid, employee_name, employee_email, employee_phone,
				project_name, address, department_name,
				no_individuals_reporting, timeSheet_begin, timeSheet_end);
		
		
		System.out.println("Choose 1 =>TO INSERT EMPLOYEES || 2=> TO SELECT EMPLOYEES || 3=> TO UPDATE EMPLOYEES || 4=> TO DELETE EMPLOYEES");
		System.out.println("Give choice::");
		int option=Integer.parseInt(br.readLine());
		
		
		
		switch(option) {
		
					case 1:	System.out.println("Enter project name::");
							project_name=br.readLine();
							
						
							System.out.println("Enter the number of Individuals Reporting for each Project:");
							no_individuals_reporting=Integer.parseInt(br.readLine());
							m.setNo_individuals_reporting(no_individuals_reporting);
							
							//Creating Dependent Object
							System.out.print("Enter the zip_code of Employee:: ");
							zip_code = Integer.parseInt(br.readLine());
							address.setZip_code(zip_code);
					
							System.out.print("Enter the street of Employee:: ");
							street = br.readLine();
							address.setStreet(street);
					
							System.out.print("Enter the city of Employee:: ");
							city = br.readLine();
							address.setCity(city);
					
							System.out.print("Enter the state of Employee:: ");
							state = br.readLine();
							address.setState(state);
					
							System.out.print("Enter the country of Employee:: ");
							country = br.readLine();
							address.setCountry(country);
							
							//Creating Target Object
							System.out.println("Enter employee Credentials for the projects :: ");
							
						
							System.out.print("Enter the id of Employee:: ");
							empid = Integer.parseInt(br.readLine());
							m.setEmpid(empid);
					
							System.out.print("Enter the name of Employee:: ");
							employee_name = br.readLine();
							m.setEmployee_name(employee_name);
							
							System.out.println("Enter the email of employee ::");
							employee_email=br.readLine();
							m.setEmployee_email(employee_email);
							
							System.out.println("Enter the contact no of the employee ::");
							employee_phone=Integer.parseInt(br.readLine());
							m.setEmployee_phone(employee_phone);
					
							project_name = m.setProject_name(project_name);
							System.out.print("The name of project in which the employee is involved:: "+m.getProject_name());
					
							System.out.println();
							
							m.setAddress(address);
							
							System.out.print("Enter the department of Employee:: ");
							department_name = br.readLine();
							m.setDepartment_name(department_name);;
							
							System.out.print("Enter the start time of Project of Employee:: ");
							timeSheet_begin = br.readLine();
							m.setTimeSheet_begin(timeSheet_begin);
							
							System.out.print("Enter the end time of Project of Employee:: ");
							timeSheet_end = br.readLine();
							m.setTimeSheet_end(timeSheet_end);
							
							System.out.println("Inserted Employees ::");
							
								m.viewManager();
							
							break;
							
							
					case 2: System.out.println("Enter the EMPLOYEE ID to VIEW ::");
							empid=Integer.parseInt(br.readLine());
							m.viewManager();
							break;
							
							
					case 3: System.out.println("Enter the updation mode ::");
							
							System.out.println("Update address for employee :: ");
							
						
							System.out.print("Enter the zip_code of Employee:: ");
							zip_code = Integer.parseInt(br.readLine());
							address.setZip_code(zip_code);
					
							System.out.print("Enter the street of Employee:: ");
							street = br.readLine();
							address.setStreet(street);
					
							System.out.print("Enter the city of Employee:: ");
							city = br.readLine();
							address.setCity(city);
					
							System.out.print("Enter the state of Employee:: ");
							state = br.readLine();
							address.setState(state);
					
							System.out.print("Enter the country of Employee:: ");
							country = br.readLine();
							address.setCountry(country);
							
							//Creating Target Object
							System.out.println("Enter employee Credentials for the projects :: ");
							
						
							System.out.print("Enter the id of Employee:: ");
							empid = Integer.parseInt(br.readLine());
							m.setEmpid(empid);
					
							System.out.print("Enter the name of Employee:: ");
							employee_name = br.readLine();
							m.setEmployee_name(employee_name);
							
							System.out.println("Enter the email of employee ::");
							employee_email=br.readLine();
							m.setEmployee_email(employee_email);
							
							System.out.print("Enter the department of Employee:: ");
							department_name = br.readLine();
							m.setDepartment_name(department_name);;
							
							System.out.print("Enter the start time of Project of Employee:: ");
							timeSheet_begin = br.readLine();
							m.setTimeSheet_begin(timeSheet_begin);
							
							System.out.print("Enter the end time of Project of Employee:: ");
							timeSheet_end = br.readLine();
							m.setTimeSheet_end(timeSheet_end);
							m.viewManager();
							break;
							
					case 4: System.out.print("Enter Employee details to remove from Project:: ");
							System.out.println("Enter project name::");
							project_name=br.readLine();
							
							System.out.print("Enter the id of Employee:: ");
							empid = Integer.parseInt(br.readLine());
							m.setEmpid(empid);
					
							System.out.print("Enter the name of Employee:: ");
							employee_name = br.readLine();
							m.setEmployee_name(employee_name);
							
							System.out.println("Enter the email of employee ::");
							employee_email=br.readLine();
							m.setEmployee_email(employee_email);
							
							System.out.println("Enter the contact no of the employee ::");
							employee_phone=Integer.parseInt(br.readLine());
							m.setEmployee_phone(employee_phone);
					
							project_name = m.setProject_name(project_name);
							System.out.print("The name of project in which the employee is involved:: "+m.getProject_name());
							
							System.out.println("Number of individuals reporting previously ::");
							no_individuals_reporting=Integer.parseInt(br.readLine());
							System.out.println("Number of individuals reporting now :: "+(no_individuals_reporting-1));
							m.setNo_individuals_reporting(no_individuals_reporting);
							
							System.out.print("Enter the department of Employee:: ");
							department_name = br.readLine();
							m.setDepartment_name(department_name);;
							
							System.out.print("Enter the start time of Project of Employee:: ");
							timeSheet_begin = br.readLine();
							m.setTimeSheet_begin(timeSheet_begin);
							
							System.out.print("Enter the end time of Project of Employee:: ");
							timeSheet_end = br.readLine();
							m.setTimeSheet_end(timeSheet_end);
							m.viewManager();
							break;
									
				default: System.out.println("Do you want to exit?Type Y/N")	;
						String ans=br.readLine();
						if(ans=="Y"||ans=="y")
							break;
						
							
									
		}
		
		
		
	}


	

}
