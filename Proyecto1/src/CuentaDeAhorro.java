
public class CuentaDeAhorro extends Banc{

	public CuentaDeAhorro(long nrodecuenta, double saldo, Titular titular) {
		super(nrodecuenta, saldo, titular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void extraer(double monto) {
		// TODO Auto-generated method stub
		if(getSaldo()>=monto)
			setSaldo(getSaldo() - monto);
	}
	

}
