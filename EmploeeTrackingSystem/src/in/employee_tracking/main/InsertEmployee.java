package in.employee_tracking.main;

import org.hibernate.Session;

import org.hibernate.Transaction;

import in.employee_tracking.Model.Address;
import in.employee_tracking.Model.Employee;
import in.employee_tracking.util.HibernateUtil;

public class InsertEmployee {

	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

	
			session = HibernateUtil.getSession();

			if (session != null)
				transaction = session.beginTransaction();
			
			Address address1=new Address();
			address1.setZip_code("700016");
			address1.setStreet("ParkStreet");
			address1.setCity("Kolkata");
			address1.setState("West Bengal");
			address1.setCountry("India");
			

			Address address2=new Address();
			address2.setZip_code("852643");
			address2.setStreet("Bank Road");
			address2.setCity("Dhanbad");
			address2.setState("Jharknand");
			address2.setCountry("India");
			
			
			Address address3=new Address();
			address3.setZip_code("100016");
			address3.setStreet("DownStreet");
			address3.setCity("Delhi");
			address3.setState("Delhi");
			address3.setCountry("India");
			
			
			
			
			Employee e1=new Employee(103,"Cinderella","AppDevelopment",address1);
			Employee e2=new Employee(104,"Dolla","DevOps",address2);
			Employee e3=new Employee(105,"Eeshan","CyberSecurity",address3);

				session.save(e1);
				session.save(e2);
				session.save(e3);
				flag = true;
				
				if(flag==true)
				transaction.commit();
			else
				transaction.rollback();
			
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

}
