package pe.edu.acorsystem.libro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import pe.edu.acorsystem.libro.model.Libro;

@Component
@Qualifier("libroServiceMexico")
public class LibroMexicoServiceImpl implements LibroService {

	@Override
	public List<Libro> buscarTodos() {
		List<Libro> libros = new ArrayList<>();
		libros.add(new Libro(1, "hola mundo", "jorge"));
		return libros;
	}

}