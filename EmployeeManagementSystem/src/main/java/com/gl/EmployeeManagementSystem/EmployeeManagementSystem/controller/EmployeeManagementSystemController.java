package com.gl.EmployeeManagementSystem.EmployeeManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class EmployeeManagementSystemController {

	@GetMapping
	public String home()
	{
		return "index";
		
	}
	
	
}
