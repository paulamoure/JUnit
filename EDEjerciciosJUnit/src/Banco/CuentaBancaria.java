package Banco;

public class CuentaBancaria {
	private int saldo;
	private String password;

	public CuentaBancaria(int saldoInicial, String password) {
		saldo = saldoInicial;
		this.password = password;
	}

	public int depositar(int cantidad) {
		if (cantidad > 0) {
			saldo += cantidad;
			return saldo;
		} else
			return -1;
			
	}

	public int retirar(int cantidad, String pass) {
		if (passwordCorrecta(pass)) {
			if (saldo >= cantidad) {
				saldo -= cantidad;
				return saldo;
			} else
				return -1;
		} else
			return -2;

	}

	public boolean passwordCorrecta(String pass) {
		return password.equals(pass);
	}
}
