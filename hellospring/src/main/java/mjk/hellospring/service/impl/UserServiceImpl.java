package mjk.hellospring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mjk.hellospring.dao.UserDao;
import mjk.hellospring.model.User;
import mjk.hellospring.service.UserService;

/**
 * Implementation of Service interface for model class User.
 * 
 * @author mjkulkarni
 * @version 0.0
 */
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	/** 
	 * @see mjk.hellospring.service.UserService#getAllUsers()
	 */
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * @see mjk.hellospring.service.UserService#loginUser(java.lang.String, java.lang.String)
	 */
	public boolean loginUser(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @see mjk.hellospring.service.UserService#resetPassword(java.lang.String)
	 */
	public boolean resetPassword(String emailId) {
		// TODO Auto-generated method stub
		return false;
	}

	/** 
	 * @see mjk.hellospring.service.UserService#updatePassword(java.lang.String, java.lang.String, java.lang.String)
	 */
	public boolean updatePassword(String emailId, String newPassword, String confirmPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	/** 
	 * @see mjk.hellospring.service.UserService#getUserByUserName(java.lang.String)
	 */
	public User getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	
	/**
	 * @see mjk.hellospring.service.UserService#logoutUser(java.lang.String)
	 */
	public boolean logoutUser(String userName) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @see mjk.hellospring.service.UserService#logoutUser(mjk.hellospring.model.User)
	 */
	public boolean logoutUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @see mjk.hellospring.service.UserService#deleteUser(java.lang.String)
	 */
	public boolean deleteUser(String userName) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @see mjk.hellospring.service.UserService#deleteUserByEmailId(java.lang.String)
	 */
	public boolean deleteUserByEmailId(String emailId) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @see mjk.hellospring.service.UserService#deleteUser(mjk.hellospring.model.User)
	 * @param user
	 */
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * @see mjk.hellospring.service.UserService#checkNewPassword(java.lang.String, java.lang.String)
	 * @param password
	 * @param confirmPassword 
	 */
	public boolean checkNewPassword(String password, String confirmPassword){
		
		return password.equals(confirmPassword) ? true : false;
		
	}
	
	/**
	 * @see mjk.hellospring.service.UserService#registerUser(mjk.hellospring.model.User)
	 */
	public void registerUser(User user){
		
		userDao.create(user);
		
	}
	
	public boolean signUpUser(String userName, String password, String confirmPassword){
		
		if(this.checkNewPassword(password, confirmPassword)){
			
			User newUser = new User();
			newUser.setUserName(userName);
			newUser.setPassword(confirmPassword);
			this.registerUser(newUser);
			
			return true;
		}
		
		return false;
	}

}