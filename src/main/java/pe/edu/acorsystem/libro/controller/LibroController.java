package pe.edu.acorsystem.libro.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.acorsystem.libro.model.Libro;
import pe.edu.acorsystem.libro.service.LibroService;

@RestController
public class LibroController {
	
	Logger logger = LoggerFactory.getLogger(LibroController.class);
	
	@Autowired
    @Qualifier("libroService")
	LibroService servicio;

	@Autowired
    @Qualifier("libroServiceMexico")
	LibroService servicioMexico;
	
	@RequestMapping("/libros")
	public List<Libro> buscarTodos() {
		logger.info("Inicio el metodo buscarTodos");
		List<Libro> libro = servicio.buscarTodos();
		logger.info("Fin el metodo buscarTodos");
		return libro;
	}

	@RequestMapping("/libros-mexico")
	public List<Libro> buscarTodosLibrosMexido() {
		
		return servicioMexico.buscarTodos();
	}

}