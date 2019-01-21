package ejerciciosProgOO;

public class Director {

	private String nombre;
	private String paisOr;
	private int anoNac;

	public Director(String nombre, String paisOr, int anoNac) {
		this.nombre = nombre;
		this.paisOr = paisOr;
		this.anoNac = anoNac;
	}

	public void imprimir() {
		System.out.println(this.nombre + ", " + this.paisOr + ", " + this.anoNac);
	}
}
