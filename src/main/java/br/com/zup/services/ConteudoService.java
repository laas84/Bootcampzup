package br.com.zup.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zup.entities.Conteudo;
import br.com.zup.repository.ConteudoRepository;

@Service
public class ConteudoService <conteudoRepository> {
 
	@Autowired
	ConteudoRepository conteudoRepository;
	
	public List<Conteudo> getAllConteudo() { 
		List<Conteudo> conteudoList = new ArrayList<>();
		conteudoRepository.findbyLocalizacao().forEach(conteudoList::add);
		return conteudoList;
	}
		
	public List<Conteudo> getConteudo(String hashtag) {
		List<Conteudo> conteudoList = conteudoRepository.FindByNomeStartingWith(hashtag);
		return conteudoList;
	}
		
	public Conteudo addConteudo(Conteudo conteudo) { 
		return conteudoRepository.save(conteudo);
	}
	
	public void updateConteudo(String id, Conteudo conteudo) {
		conteudoRepository.save(conteudo);
	}
	
	public void deleteConteudo(Long id) {
		conteudoRepository.deleteById(id);
	}

	public List<Conteudo> addConteudo(String hashtag) {
		List<Conteudo> conteudoList = conteudoRepository.save(hashtag);
		return conteudoList;
	}

	
}