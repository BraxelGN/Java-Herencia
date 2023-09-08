package figuras.geometricas;

public class Elipse extends Figura{

	private double radioMayor;
	private double radioMenor;
	public Elipse(double x, double y,double radioMayor, double radioMenor) {
		super(x, y);
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*this.radioMayor*this.radioMenor;
	}
	
}
