package ejerciciosProgOO;

public class Pelicula {
	private String titulo;
	private int anoProd;
	private Director director;

	public Pelicula(String titulo) {
		this.titulo = titulo;
	}

	public Pelicula(Director director) {
		this.director = director;
	}

	public Pelicula() {

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoProd() {
		return anoProd;
	}

	public void setAnoProd(int anoProd) {
		this.anoProd = anoProd;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public void imprimir() {
		System.out.print(this.titulo + ", " + this.anoProd + ", ");
		director.imprimir();
	}
}
