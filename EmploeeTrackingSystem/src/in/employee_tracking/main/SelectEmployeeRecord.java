package in.employee_tracking.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.employee_tracking.util.HibernateUtil;

public class SelectEmployeeRecord {

	public static void main(String[] args) {
			
			Session session = null;
			Transaction transaction = null;
			boolean flag = false;

			try {
				session = HibernateUtil.getSession();

				transaction = session.beginTransaction();
						
			}
			finally {
				HibernateUtil.closeSession(session);
				HibernateUtil.closeSessionFactory();
			}

		}

}