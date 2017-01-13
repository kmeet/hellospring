package mjk.hellospring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Model class for Employee. Contains basic bio and employment details. Emails specified here will be used for 
 * password reset.
 * 
 * @author mjkulkarni
 * @version 0.0
 */
@Entity
@Table(name="tbl_user")
public class User {
	
	@Id
	@Column(name="idtbl_users")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userid;
	
	@Column(name="userid")
	private String userName;
	
	@Column(name="userpass")
	private String password;
	
	//TODO Constructor for dev only. Remove in release build.
	public User(){}
	
	/**
	 * 
	 * @param userName
	 * @param password
	 */
	//TODO Constructor for dev only. Remove in release build.
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;	
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}