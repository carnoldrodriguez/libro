package pe.edu.acorsystem.libro.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pe.edu.acorsystem.libro.model.Libro;
import pe.edu.acorsystem.libro.repository.LibroRepository;

@Component
@Qualifier("libroService")
public class LibroServiceImpl implements LibroService {

	Logger logger = LoggerFactory.getLogger(LibroServiceImpl.class);
	
	@Autowired
	LibroRepository repositorio;
	
	@Override
	public List<Libro> buscarTodos() {
		
        logger.info("Inicia metodo buscarTodos en el ServiceImpl");
        
        List<Libro> libros = null ;
        
        try {
        	libros = repositorio.buscarTodos();
    		libros.forEach(l -> logger.info("libro nombre {}", l.getNombre()));
		} catch (Exception e) {
	        logger.error("ERROR MESSAGE {}", e.getMessage());
		}
		
		return libros;
		
	}
	
}