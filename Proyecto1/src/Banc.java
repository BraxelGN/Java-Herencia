
public abstract class Banc {
	private long nrodecuenta;
	private	double saldo;
	private Titular titular;
	
	public Banc(long nrodecuenta,double saldo, Titular titular) {
		this.nrodecuenta = nrodecuenta;
		this.saldo = saldo;
		this.titular = titular;
	}

	public long getNrodecuenta() {
		return nrodecuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Titular getTitular() {
		return titular;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void depositar(double saldo) {
		setSaldo(getSaldo()+saldo);
	}
	public abstract void extraer(double saldo);

}
