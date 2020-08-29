package br.com.zup.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.entities.Conteudo;
import br.com.zup.services.ConteudoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import br.com.zup.repository.ConteudoRepository;
import br.com.zup.entities.Conteudo;



@RestController
@RequestMapping
@Api(value="Instagram para ZUP Bootcamp")
@CrossOrigin(origins="*")
public class ConteudoController {
	
	@Autowired 
	ConteudoService conteudoService;  
	
	@RequestMapping("/conteudo")
	@ApiOperation(value="Retorna uma lista de conteúdo baseado na localização")
	public List<Conteudo> porLocalizacao(@RequestParam String localizacao) {
		return conteudoService.getAllConteudo();
	}
		
	@GetMapping("/pesquisarConteudo")
	@ApiOperation(value="Retorna uma lista de conteúdo baseado na hashtag")
	public List<Conteudo> pesquisarConteudos(@RequestParam String hashtag) {
		return conteudoService.getConteudo(hashtag);
	}
	
	@GetMapping("/por-nome-comecando-com")
	@ApiOperation(value="Retorna uma lista de conteúdo com o inicío do nome da hashtag")
	public List<Conteudo> porNomeComecandoCom(@RequestParam String hashtag) {
		return conteudoService.getConteudo(hashtag);
	}
	
	@PostMapping("/conteudo")
	@ApiOperation(value="Adiciona conteúdo e/ou atualiza conteúdo")
	public void  addConteudo(@RequestBody Conteudo conteudo) {
		conteudoService.addConteudo(conteudo);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value="Deleta conteúdo")
	public void deletar(@PathVariable Long id) {
	    conteudoService.deleteConteudo(id);
	  }
}