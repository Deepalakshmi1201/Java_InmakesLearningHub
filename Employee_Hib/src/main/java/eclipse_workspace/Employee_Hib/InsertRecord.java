package eclipse_workspace.Employee_Hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class InsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		SessionFactory sf = cfg.buildSessionFactory(serviceRegistry);
		Session session = sf.openSession();
		
		Employee emp = new Employee();
		emp.setDeptno(1003);
		emp.setEname("Baaka");
		emp.setJob("Computer Science");
		emp.setSal(6500);
		emp.setEmpno(10);
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
		System.out.println("Record Sucessfully Inserted....");
		session.close();


	}

}
