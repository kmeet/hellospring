package mjk.hellospring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import mjk.hellospring.model.SimpleSearchCommand;

/**
 * @author mjkulkarni
 * @since 0.0
 */
@Controller
public class SearchController{

	@RequestMapping(value="/search", method = RequestMethod.GET)
	protected ModelAndView onGet() throws Exception {
		System.out.println("onGet()");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("search");
		return mav;
	}
	
	@RequestMapping(value="/search", method = RequestMethod.POST)
	protected ModelAndView onPost(@ModelAttribute("searchForm") SimpleSearchCommand searchCommand,
			Model model) throws Exception {
		if(searchCommand.getSearchText().isEmpty()){
			searchCommand.setSearchText("Search box returned empty text.");
		}
		
		System.out.println("Submit captured!! - " + searchCommand.getSearchText());
		ModelAndView mav = new ModelAndView();
		mav.addObject(searchCommand);
		mav.setViewName("search");
		return mav;
	}
}