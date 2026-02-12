package org.jsp.secondStringBootProject.service;

import org.jsp.secondStringBootProject.dao.UserDao;
import org.jsp.secondStringBootProject.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class UserService {
	@Autowired
	private UserDao dao;
	public User saveUser(User user) {
		try {
			User getUser = dao.getUser(user.getId());
			if(getUser!=user) {
				dao.saveUser(user);
			}
			else {
				System.out.println("User already existed...");
			}
			return user;
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
			dao.saveUser(user);
		}
		return null;
	}
	@GetMapping("/find/{id}")
	public User findById(@PathVariable int id) {
		return dao.getUser(id);
	}
}
