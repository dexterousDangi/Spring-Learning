package com.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoursesController {
	
	@RequestMapping("/courses ")
	public String courses() {
		System.out.println("welcome to my cave...");
		return "courses.jsp";
	}
}
