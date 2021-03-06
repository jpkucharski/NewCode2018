package com.simple.programmer;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Program {
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		PopulateSampleData();		
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.enableFilter("nameFilter").setParameter("name", "j%");
		session.beginTransaction();
		
		//Query query = session.getNamedQuery("AllGoalAlerts");
		//Query query = session.createQuery("select new com.simpleprogrammer.UserTotal(user.name, user.proteinData.total) " +
		//		"from User user");
		
		Query query = session.createQuery("from User");
		//Query query = session.createSQLQuery("SELECT * FROM Users").addEntity(User.class);
		List<User> users = query.list();
		for(User user : users)
		{
			System.out.println(user.getName());
		}
		
		User u = (User) session.load(User.class, 1);
		System.out.println(u.getName());
		
		session.getTransaction().commit();
		session.close();
		
		HibernateUtilities.getSessionFactory().close();
	}

	private static void PopulateSampleData() {
		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		
		User joe = CreateUser("Joe", 500, 50, "Good job", "You made it!");
		session.save(joe);
		
		User bob = CreateUser("Bob", 300, 20, "Taco time!");
		session.save(bob);
		
		User amy = CreateUser("Amy", 250, 200, "Yes!!!");
		session.save(amy);
		session.getTransaction().commit();
		session.close();
	}

	private static User CreateUser(String name, int goal, int total, String ... alerts){
		User user = new User();
		user.setName(name);
		user.getProteinData().setGoal(goal);
		user.addHistory(new UserHistory(new Date(), "Set goal to " + goal));
		user.getProteinData().setTotal(total);
		user.addHistory(new UserHistory(new Date(), "Set total to " + total));
		for(String alert : alerts) {
			user.getGoalAlerts().add(new GoalAlert(alert));
		}
		
		return user;
	}

}
