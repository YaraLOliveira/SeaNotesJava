package com.projeto.notesea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.notesea.model.User;
import com.projeto.notesea.respository.UserDao;

@RestController
@RequestMapping("/user")
public class UserController {
	
	// injeção de dependência
	@Autowired
	private UserDao userDao;

	
	@GetMapping
	public List<User> get() {
		return userDao.findAll(); 
	}
	
	@PostMapping
	public void post(@RequestBody User user) {
		userDao.save(user);
	}
	
	@DeleteMapping
	public void delete(@PathVariable("id") Long id) {
		userDao.deleteById(id);
	}

}
