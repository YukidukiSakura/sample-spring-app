package jp.test.springapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping({"/", "/Index"})
	public ModelAndView show() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("title", "Spring app");
		mav.setViewName("Index");
		return mav;
	}
}
