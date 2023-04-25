package pe.edu.acorsystem.libro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
	
	private int codigo;
	private String nombre;
	private String autor;

	public Libro(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
}