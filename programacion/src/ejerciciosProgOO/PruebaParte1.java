package ejerciciosProgOO;

public class PruebaParte1 {

	public static void main(String[] args) {
		// EXPERIMENTO 1
		Director WoodyAllen = new Director("Woody Allen", "Francia", 1935);
		Pelicula Manhattan = new Pelicula();
		Manhattan.setTitulo("Manhattan");
		Manhattan.setAnoProd(1979);
		Manhattan.setDirector(WoodyAllen);
		Manhattan.imprimir();

		// EXPERIMENTO 2
		Director PeterJackson = new Director("Peter Jackson", "Nueva Zelanda", 1961);
		Pelicula ESDLA = new Pelicula("el señor de los aniños");
		ESDLA.setAnoProd(2001);
		ESDLA.setDirector(PeterJackson);
		ESDLA.imprimir();

		// EXPERIMENTO 3
		Pelicula DiasDeRadio = new Pelicula(WoodyAllen);
		DiasDeRadio.setAnoProd(1987);
		DiasDeRadio.setTitulo("Dias de Radio");
		DiasDeRadio.imprimir();

		// EXPERIMENTO 4

		System.out.println("el lugar de nacimiento del director de " + DiasDeRadio.getTitulo() + " es Estados Unidos");

	}

}
