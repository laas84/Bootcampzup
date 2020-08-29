package br.com.zup.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.entities.User;
import br.com.zup.services.UserService;
import br.com.zup.controller.UserController;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByLogin(String login);
	
	User findUsuarioByEmail(String email);

	User save(String user);
}
