package br.com.zup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.entities.Comentario;


public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

}
