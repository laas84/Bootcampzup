package br.com.zup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.services.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import br.com.zup.entities.User;

@RestController
@RequestMapping
@Api(value="Instagram para ZUP Bootcamp")
@CrossOrigin(origins="*")
public class UserController {
	
	@Autowired 
	UserService userService;  
	
	@PostMapping("/user")
	@ApiOperation(value="Adiciona usuário")
	public void  addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value="Deleta usuário")
	public void deletar(@PathVariable Long id) {
	    userService.deleteUser(id);
	  }

}
