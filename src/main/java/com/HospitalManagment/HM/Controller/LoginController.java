package com.HospitalManagment.HM.Controller;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
public class LoginController {

	
	@RequestMapping("/")  
	public String hello()   
	{  
	return "welcome to hospital managment";  
	} 
}
