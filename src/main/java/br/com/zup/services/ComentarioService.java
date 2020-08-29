package br.com.zup.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zup.entities.Comentario;
import br.com.zup.repository.ComentarioRepository;

@Service
public class ComentarioService <comentarioRepository> {
	
	@Autowired
	ComentarioRepository comentarioRepository;
	
	public Comentario addComentario(Comentario comentario) { 
		return comentarioRepository.save(comentario);
	}
	
	public void deleteComentario(Long id) {
		comentarioRepository.deleteById(id);
	}

}
