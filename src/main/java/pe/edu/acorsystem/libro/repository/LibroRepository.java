package pe.edu.acorsystem.libro.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.edu.acorsystem.libro.model.Libro;

@Repository
public class LibroRepository {
	
	public List<Libro> buscarTodos() { 
		
		List<Libro> lista = new ArrayList<>();
		
		Libro libro1 = new Libro();
		libro1.setCodigo(1);
		libro1.setNombre("Java");
		libro1.setAutor("pedro");
		
		Libro libro2 = new Libro(2, "python", "gema");
		Libro libro3 = new Libro(3, "codigo limpio");

		lista.add(libro1);
		lista.add(libro2);	
		lista.add(libro3);		
		
		return lista; 
		
	} 


}