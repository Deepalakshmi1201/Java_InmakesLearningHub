package eclipse_workspace.Employee_Hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Employee emp = session.get(Employee.class, 4);
		
		emp.setDeptno(1001);
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(emp);
		tx.commit();
		System.out.println("Record Sucessfully Updated....");
		session.close();

	}

}
