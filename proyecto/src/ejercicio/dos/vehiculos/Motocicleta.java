package ejercicio.dos.vehiculos;

public class Motocicleta extends Vehiculo{
	private Persona acompañante;

	public Motocicleta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motocicleta(int km, Persona chofer) {
		super(km, chofer);
		// TODO Auto-generated constructor stub
	}
	
	
	public Persona getAcompañante() {
		return acompañante;
	}

	@Override
	public void cambiarChofer(Persona chofer) {
		//TODO
		if(getAcompañante()==null) {
			super.asignarChofer(chofer);
		}		
	}
	public void bajarAcompañante(Persona acompañante) {
		// TODO
			this.acompañante=null;
	}
	
	public void agregarAcompañante(Persona acompañante) {
		// TODO
		if(this.acompañante==null)
			this.acompañante=acompañante;
	}
}
