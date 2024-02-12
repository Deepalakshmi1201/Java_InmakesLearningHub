package eclipse_workspace.Employee_Hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Employee emp = session.get(Employee.class, 1);
		
		System.out.println("Show Employee");
	    System.out.println("-----------------------");
	    System.out.println("EmpNo      = "+emp.getEmpno());
	    System.out.println("EmpName    = "+emp.getEname());
	    System.out.println("EmpJob     = "+emp.getJob());
	    System.out.println("EmpSalary  = "+emp.getSal());
	    System.out.println("DeptNo     = "+emp.getDeptno());
	    
	    session.close();

	}

}
