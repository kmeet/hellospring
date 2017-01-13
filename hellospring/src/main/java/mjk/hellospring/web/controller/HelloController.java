package mjk.hellospring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author mjkulkarni
 * @since 0.0
 */
@Controller
public class HelloController {

	/**
	 * 
	 * @param model
	 * @return 
	 */
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		System.out.println("Controller found!");
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";

	}

	/**
	 * 
	 * @param name
	 * @return viewWithObject
	 */
	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) {

		System.out.println("Controller found!");
		ModelAndView model = new ModelAndView();
		model.setViewName("hello");
		model.addObject("msg", name);

		return model;

	}
}