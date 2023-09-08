package ejercicio.dos.vehiculos;

public abstract class Vehiculo {
	private int km;
	private Persona chofer;
	
	public Vehiculo(int km, Persona chofer) {
		this.km = km;
		this.chofer= chofer;
	}
	public Vehiculo() {
		km = 0;
	}

	public int getKm() {
		return km;
	}

	public Persona getChofer() {
		return chofer;
	}
	
	public void asignarChofer(Persona chofer) {
		this.chofer = chofer;
	}
	
	public abstract void cambiarChofer(Persona chofer);
	
}
