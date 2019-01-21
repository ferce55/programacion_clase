package progOrientadaObjetos;

public class Oliva {
	
	private int kilosOlivas, edadOlivo;
	
	public Oliva() {
		
	}
	
	public Oliva(int kilos, int edad) {
		kilosOlivas = kilos;
		edadOlivo = edad;
	}
	
	public int Beneficio(int precioOliva) {
		int beneficio = precioOliva * kilosOlivas;
		return beneficio;
	}
}
