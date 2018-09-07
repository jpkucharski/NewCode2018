package com.simple.programmer;

import java.util.Date;
import java.util.List;
import java.util.Map.Entry;






import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;


public class Program {

	public static void main(String[] args) {

			System.out.println("Hello world");
			PopulateSampleData();
			
			Session session = HibernateUtilities.getSessionFactory().openSession(); 
			session.beginTransaction();
//			Query query = session.createQuery("from User where id = :id and name = :name").setString("name", "Joe").setString("id","1");
//			Query query = session.createQuery("from GoalAlert").setFirstResult(2).setMaxResults(1);
//			Query query = session.createQuery("from User as user where user.proteinData.total > 49");
//			Query query = session.createQuery("select new com.simple.programmer.UserTotal(user.name, user.proteinData.total)" + "from User as user" );
			
			User exampleUser = new User();
			exampleUser.setName("joe");
			Example e = Example.create(exampleUser).ignoreCase();
			
			
			
			Criteria criteria =session.createCriteria(User.class).add(e);

			List<User> users = criteria.list();
			
			for(User user: users){
				System.out.println(user.getName());
			}
			
			
//			List<UserTotal> userTotals = query.list();			
//			for(UserTotal ut: userTotals ){
//				System.out.println(ut.getName()+ " : " +ut.getTotal());
//			}
			
			
//			Query query = session.getNamedQuery("AllGoalAlerts");
//			List<GoalAlert> alerts = query.list();
//			for(GoalAlert alert: alerts ){
//				System.out.println(alert.getMessage());
//			}
			
			
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
