package mjk.hellospring.dao;

import java.util.List;

import mjk.hellospring.model.User;

/**
 * Interface for DAO implementation of model class User.
 * 
 * @author mjkulkarni
 * @version 0.0
 */
public interface UserDao {

	public List<User> getAllUsers();
	public User get(String userName);
	public boolean create(User user);
	public boolean delete(User user);
	public boolean update(User user);
}