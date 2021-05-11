package net.codejava.spring.controller;

import java.util.ArrayList;
import java.util.Map;

import net.codejava.spring.model.User;

import org.springframework.stereoType.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value ="/register")
public class RegisterController {
	@RequestMapping(method = RequestMethod.GET)
	public String viewRegistration(Map<String, Object> model) {
		User userForm = new User();
		model.put("userForm", userForm);
		return "Registration";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String processRegistration(@ModelAttribute("userForm") User user, Map<String, Object> model) {
		System.out.println("Username :"+user.getUsername());
		System.out.println("Password: "+user.getPassword());
		System.out.println("Email: "+user.getEmail());
		
		return "RegistrationSuccess";
	}

}
