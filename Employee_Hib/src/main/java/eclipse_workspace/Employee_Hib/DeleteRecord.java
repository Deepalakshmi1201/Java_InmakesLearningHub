package eclipse_workspace.Employee_Hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Employee emp = session.get(Employee.class, 1);
		Transaction tx = session.beginTransaction();
		session.delete(emp);
		tx.commit();
		System.out.println("Record Sucessfully Deleted....");
		session.close();
	}

}
