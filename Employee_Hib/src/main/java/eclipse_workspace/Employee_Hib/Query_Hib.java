package eclipse_workspace.Employee_Hib;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.query.NativeQuery;
import org.hibernate.service.ServiceRegistry;
public class Query_Hib {

	public static void main(String[] args) {
//		Query1();
//		Query2();
//		Query3();
		
	}
	public static void Query1() {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		SessionFactory sf = cfg.buildSessionFactory(serviceRegistry);
		Session session = sf.openSession();
		Query query = session.createQuery("select ename from Employee e where e.ename like 'A%'");
		List<String> eNames = (List<String>) query.list();
		session.beginTransaction();
		System.out.println("Employee Name = ");
		for(String ename : eNames) {
			System.out.println(ename);
		}
		session.getTransaction().commit();
	}
	public static void Query2() {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		SessionFactory sf = cfg.buildSessionFactory(serviceRegistry);
		Session session = sf.openSession();
		Query query = session.createQuery(" from Employee e where e.sal >= 5000 and e.sal <= 7000 ");
		session.beginTransaction();
		List<Employee> employee = query.getResultList();
		System.out.println("Empno\t\t Name  \t\t Job  \t\t\t\t Salary  \t\t Deptno  ");
		for(Employee emp : employee) {
			
			System.out.println(emp.getEmpno()+"\t\t"+emp.getEname()+"\t\t"+emp.getJob()+"\t\t"+emp.getSal()+"\t\t"+emp.getDeptno());
		}
		session.getTransaction().commit();
	}
	public static void Query3() {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		SessionFactory sf = cfg.buildSessionFactory(serviceRegistry);
		Session session = sf.openSession();
		session.beginTransaction();
		
		Query query1 = session.createQuery(" select distinct sal from Employee e order by sal desc  ");
		List<Integer> Marks = (List<Integer>) query1.list();
		if(!Marks.isEmpty()) {
			int secondMaxSalary  = Marks.get(1);
			int secondMinSalary  = Marks.get(Marks.size()-2);
			System.out.println("-------------2rd max salary------------");
			System.out.println("secondMaxSalary = "+secondMaxSalary );
			System.out.println("-------------2rd min salary------------");
			System.out.println("secondMinSalary = "+secondMinSalary );
		}
		else {
			System.out.println("Result not found");
		}
		session.getTransaction().commit();
	}
}
