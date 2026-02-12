package org.jsp.secondStringBootProject.dao;

import org.jsp.secondStringBootProject.dto.User;
import org.jsp.secondStringBootProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	private UserRepository repository;
	public User saveUser(User user) {
		repository.save(user);
		return user;
	}
	public User getUser(int id) {
		
//		Optional<User> user = repository.findById(id);
//		if(user.isPresent()) {
//		return user.get();
//		}else {
//			throw new RuntimeException("No user fountd");
//		}
		
		return repository.findById(id).orElseThrow(()->new RuntimeException("No user found..."));
	}
}
