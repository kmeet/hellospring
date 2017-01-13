package mjk.hellospring.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import mjk.hellospring.dao.UserDao;
import mjk.hellospring.model.User;
import mjk.hellospring.util.VariousUtils;

@Repository
public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	public List<User> getAllUsers() {
		
		try
		{
			Session session = this.sessionFactory.getCurrentSession();
			List<User> userList = VariousUtils.castList(User.class, session.createQuery("from User").getResultList());
			//TODO Add appropriate logger statements.
			return userList;
		}
		catch(Exception exc){
			//TODO Add appropriate logger statements.
			exc.printStackTrace();
			return null;
		}
	}

	public boolean create(User user) {

		try
		{
			Session session = this.sessionFactory.getCurrentSession();
			session.persist(user);
			//TODO Add appropriate logger statements.
			return true;
		}
		catch(PersistenceException persistenceExc){
			//TODO Add appropriate logger statements.
			persistenceExc.printStackTrace();
			return false;
		}
	}

	public User get(String userName) {
		
		//TODO Add appropriate logger statements.
		Session session = this.sessionFactory.getCurrentSession();
		
		return VariousUtils.castObject(User.class, session.createQuery("where User.userName = :userName")
				.setParameter(":userName", userName));
	}
	
	public boolean update(User user) {
		
		try
		{
			
			Session session = this.sessionFactory.getCurrentSession();
			session.update(user);
			//TODO Add appropriate logger statements.
			return true;
		}
		catch(PersistenceException persistenceExc){
			//TODO Add appropriate logger statements.
			persistenceExc.printStackTrace();
			return false;
		}
	}

	public boolean delete(User user) {
		
		try
		{
			Session session = this.sessionFactory.getCurrentSession();
			session.delete(user);
			//TODO Add appropriate logger statements.
			return true;
		}
		catch(PersistenceException persistenceExc){
			persistenceExc.printStackTrace();
			return false;
		}
	}

}