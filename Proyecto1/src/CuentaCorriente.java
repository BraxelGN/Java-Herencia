
public class CuentaCorriente extends Banc {

	public CuentaCorriente(long nrodecuenta, double saldo, Titular titular) {
		super(nrodecuenta, saldo, titular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void extraer(double monto) {
		// TODO Auto-generated method stub
		setSaldo(getSaldo()-monto);
	}
	
	
}
