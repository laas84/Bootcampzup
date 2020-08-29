package br.com.zup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.entities.Comentario;
import br.com.zup.services.ComentarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping 
@Api(value="Instagram para ZUP Bootcamp")
@CrossOrigin(origins="*")
public class ComentarioController {

	@Autowired 
	ComentarioService comentarioService;  
	
	@PostMapping("/comentario")
	@ApiOperation(value="Adiciona comentário")
	public void  addComentario(@RequestBody Comentario comentario) {
		comentarioService.addComentario(comentario);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value="Deleta usuário")
	public void deletar(@PathVariable Long id) {
	    comentarioService.deleteComentario(id);
	  }
	
}
