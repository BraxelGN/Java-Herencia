package ejercicio.dos.vehiculos;

public class Autobus extends Vehiculo{
	private Persona[] pasajeros;
	int cantidadDePasajeros=0;
	
	public Autobus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Autobus(int km, Persona chofer,int cantidad) {
		super(km, chofer);
		// TODO Auto-generated constructor stub
		this.pasajeros = new Persona[cantidad]; 
	}
	public void asignarPasajeros(int cantidad) {
		this.pasajeros = new Persona[cantidad]; 
	}
	
	public void agregarPasajeros(Persona p) {
		//TODO
		if(cantidadDePasajeros<pasajeros.length) {
			pasajeros[cantidadDePasajeros] = p;
			cantidadDePasajeros++;
		}
			
	}
	public void bajarPasajeros() {
		if(cantidadDePasajeros>0)
			cantidadDePasajeros--;
	}
	
	@Override
	public void cambiarChofer(Persona chofer) {
		if(cantidadDePasajeros==0)
			this.asignarChofer(chofer);
	}
	
}
