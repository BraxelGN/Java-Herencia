
public class Titular {
	private long cbu;
	private String nom;
	
	public Titular (long cbu, String nom) {
		this.cbu=cbu;
		this.nom=nom;
	}
	
	public long getCbu() {
		return cbu;
	}
	
	public String getNom() {
		return nom;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
}
