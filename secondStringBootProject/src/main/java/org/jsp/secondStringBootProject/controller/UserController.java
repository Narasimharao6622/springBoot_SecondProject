package org.jsp.secondStringBootProject.controller;

import org.jsp.secondStringBootProject.dto.User;
import org.jsp.secondStringBootProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	
//	@PostMapping("/save")
//	public User saveUsre() {
//		User user = new User();
//		user.setId(101);
//		user.setName("pavanKumar");
//		user.setEmail("pavan@gmail.com");
//		return user;
//	}
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		service.saveUser(user);
		if(user!=null) {
			System.out.println("Add successfully");
		}
		return user;
	}
	
	@GetMapping("/find/{id}")
	public User findById(@PathVariable int id) {
		return service.findById(id);
	}
	
	@GetMapping("/login")
	public void login(@RequestParam String email,String password) {
		System.out.println(email);
		System.out.println(password);
	}
	
	@PutMapping("/update")
	public User updateById(@RequestBody User user) {
		System.out.println("1092");
		return user;
	}
	
}





















