package br.com.zup.services;

import org.springframework.stereotype.Service;

import br.com.zup.entities.User;
import br.com.zup.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService <userRepository> {
	
	@Autowired
	UserRepository userRepository;
	
	public User addUser(User user) { 
		return userRepository.save(user);
	}
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

	public void updateUser(String id, User user) {
		userRepository.save(user);
	}

}
