package mjk.hellospring.service;

import java.util.List;

import mjk.hellospring.model.User;

/**
 * Service class for implementing use-cases for model class User.
 * 
 * @author mjkulkarni
 * @version 0.0
 */
public interface UserService {
	
	public List<User> getAllUsers();
	public boolean loginUser(String userName, String password);
	public boolean logoutUser(String userName);
	public boolean logoutUser(User user);
	public boolean resetPassword(String emailId);
	public boolean updatePassword(String emailId, String newPassword, String confirmPassword);
	public User getUserByUserName(String userName);
	public boolean deleteUser(String userName);
	public boolean deleteUserByEmailId(String emailId);
	public boolean deleteUser(User user);
	public boolean signUpUser(String userName, String password, String confirmPassword);
	public boolean checkNewPassword(String password, String confirmPassword);
	public void registerUser(User user);
}