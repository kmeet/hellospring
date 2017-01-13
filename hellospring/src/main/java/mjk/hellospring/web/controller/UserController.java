package mjk.hellospring.web.controller;

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
public class UserController {
		
	@RequestMapping(value="/user", method=RequestMethod.GET)
	protected ModelAndView onUserProfileGet(@ModelAttribute("userProfile") User user, Model model) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
}
