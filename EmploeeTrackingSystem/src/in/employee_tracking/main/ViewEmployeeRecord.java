package in.employee_tracking.main;


import java.io.Serializable;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.employee_tracking.Model.Employee;
public class ViewEmployeeRecord {

	public static void main(String[] args) {
		
				Configuration cfg = new Configuration();

				
				cfg.configure();

			
				SessionFactory sessionFactory = cfg.buildSessionFactory();

				Session session = sessionFactory.openSession();

				
				Transaction transaction = session.beginTransaction();

				
				
				
				Serializable object = session.save(Employee.class);
				System.out.println(object);

				
				transaction.commit();

				
				session.close();


	}

}
