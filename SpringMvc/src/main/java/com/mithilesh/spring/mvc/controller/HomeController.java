package com.mithilesh.spring.mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is our home url");

		model.addAttribute("name", "mithilesh shah");
		model.addAttribute("id", 18);

		List<String> friends = new ArrayList<String>();
		friends.add("sunil");
		friends.add("sunita");
		friends.add("vivek");
		friends.add("suresh");
		model.addAttribute("f", friends);

		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about url");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help page url");

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("name", "sunita shah");
		modelAndView.addObject("city", "lucknow");
		modelAndView.addObject("rollno", 123);

		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(123);
		list.add(1234);
		list.add(12345);
		
		modelAndView.addObject("marks",list);

		modelAndView.setViewName("help");

		return modelAndView;
	}

}
