package entities;

public class ContaBancaria {

	private final int numeroConta;
	private String nomeTitular;
	private double saldoConta;

	public ContaBancaria(int numeroConta, String nomeTitular) {

		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public ContaBancaria(int numeroConta, String nomeTitular, double inicialDeposito) {

		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(inicialDeposito);
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void deposito(double valor) {
		saldoConta += valor;
	}
	
	public void saque(double valor) {
		saldoConta -= valor;
	}
	
	public String toString() {
		return "Conta Bancaria"
				+ numeroConta
				+ ", Titular da conta: "
				+ nomeTitular
				+ ", Saldo: $ "
				+ String.format("%.2f", saldoConta);
		
		
	}
}
