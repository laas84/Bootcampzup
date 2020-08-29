package br.com.zup.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.entities.Conteudo;
import br.com.zup.services.ConteudoService;

public interface ConteudoRepository extends JpaRepository<Conteudo, Long>{

	List<Conteudo> FindByNomeStartingWith(String hashtag);

	List<Conteudo> save(String hashtag);

	ArrayList<Conteudo> findbyLocalizacao();

}
