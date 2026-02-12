package org.jsp.secondStringBootProject.repository;

import org.jsp.secondStringBootProject.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
