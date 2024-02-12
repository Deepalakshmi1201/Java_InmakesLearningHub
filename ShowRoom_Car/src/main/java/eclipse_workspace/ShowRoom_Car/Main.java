package eclipse_workspace.ShowRoom_Car;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.model.Car;
import com.model.ShowRoom;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Car.class).addAnnotatedClass(ShowRoom.class).configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
//		Car car1 = new Car();
//		car1.setCarname("Toyota Camry");
//		car1.setColor("Silver");
//		Car car2 = new Car();
//		car2.setCarname("Ford Mustang");
//		car2.setColor("Red");
//		Car car3 = new Car();
//		car3.setCarname("BMW X5");
//		car3.setColor("Blue");
		
//		ShowRoom sr1 = new ShowRoom();
//		sr1.setManager("Dhee");
//		sr1.setLocation("AnnaNagar");
		ShowRoom sr2 = new ShowRoom();
		sr2.setManager("Ando");
		sr2.setLocation("Ambattur");
//		ShowRoom sr3 = new ShowRoom();
//		sr3.setManager("Man");
//		sr3.setLocation("Mogappair");
//		
//		car1.getShowroom().add(sr3);
//		car2.getShowroom().add(sr3);
//		car3.getShowroom().add(sr1);
		
		
		
//		session.save(sr1);
		session.save(sr2);
//		session.save(sr3);
		
//		session.save(car1);
//		session.save(car2);
//		session.save(car3);
		
		tx.commit();
		session.close();
	}

}
