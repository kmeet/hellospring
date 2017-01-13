package mjk.hellospring.web.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mjk.hellospring.model.User;


/**
 * @author mjkulkarni
 * @since 0.0
 */
@Controller
public class LoginController {

	private ModelAndView mav;
	
	@RequestMapping(path="/login", method = RequestMethod.GET)
	public ModelAndView onLoginRequest(){
		System.out.println("--------------------\n"
				+ "Login page opened."
				+ "\n--------------------");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}

	@RequestMapping(value="/login", method = RequestMethod.POST)
	protected ModelAndView onLogin(@ModelAttribute("loginForm") User user,
			Model model) throws Exception {

		mav = new ModelAndView();
		
		System.out.println("--------------------\n"
				+ "Login attempt:\n"
				+ (new Date(System.currentTimeMillis())).toString()
				+ "\nUsername: " + user.getUserName() + "\nPassword: " + user.getPassword()
				+ "\n--------------------");
		
		mav.setViewName("user");
		mav.addObject(user);
		return mav;
	}

	//	@RequestMapping(value="/signup", method = RequestMethod.POST)
	//	protected ModelAndView onSignUpPost(@ModelAttribute("loginForm") User user,
	//			Model model) throws Exception {
	//
	//		System.out.println("--------------------\n"
	//				+ "Logon attempt:\n"
	//				+ (new Date(System.currentTimeMillis())).toString()
	//				+ "\nUsername: " + user.getUserName() + "\nPassword: " + user.getPassword()
	//				+ "\nPrimary Email: " + user.getPrimaryEmailId()
	//				+ "\n--------------------");
	//
	//		ModelAndView mav = new ModelAndView();
	//		mav.addObject(user);
	//		mav.setViewName("login");
	//		return mav;
	//	}
	//	
	//	@RequestMapping(value="/signup", method = RequestMethod.GET)
	//	protected ModelAndView onSignUpGet(@ModelAttribute("loginForm") User user,
	//			Model model) throws Exception {
	//
	//		System.out.println("--------------------\n"
	//				+ "Logon attempt:\n"
	//				+ (new Date(System.currentTimeMillis())).toString()
	//				+ "\nUsername: " + user.getUserName() + "\nPassword: " + user.getPassword()
	//				+ "\nPrimary Email: " + user.getPrimaryEmailId()
	//				+ "\n--------------------");
	//
	//		ModelAndView mav = new ModelAndView();
	//		//mav.addObject(user);
	//		mav.setViewName("login");
	//		return mav;
	//	}
}