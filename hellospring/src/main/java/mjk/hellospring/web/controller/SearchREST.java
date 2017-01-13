package mjk.hellospring.web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mjk.hellospring.model.User;

/**
 * @author mjkulkarni
 * @since 0.0
 */
@RestController
public class SearchREST {

	@RequestMapping(value = "/search/{userName}:.+", method = RequestMethod.GET)
	public @ResponseBody User onURLSearch(@PathVariable("userName") String userName) {

		System.out.println("URL search for: " + userName);
		User urlUser = new User();
		
		if(userName.contains(" ")){
			urlUser.setUserName(userName.split(" ", 2)[0]);
			urlUser.setPassword(userName.split(" ", 2)[1]);
		}
		else {
			urlUser.setUserName(userName);
		}
		
		return urlUser;

	}
}