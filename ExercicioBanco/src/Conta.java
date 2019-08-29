import java.util.Date;

public class Conta {
	private String numero;
	private String senha;
	private double saldo;
	private Transacao[] historico;
	
	public Conta(String numeroConta, String senha) {
		this.numero = numeroConta;
		this.senha = senha;
	}
	
	public boolean efetuarSaque(double valor) {
		return false;
	}
	
	public boolean efetuarDeposito(double valor) {
		return false;
	}
	
	public boolean efetuarPagamento(String boleto, double valor) {
		return false;
	}
	
	public Transacao[] extrato(Date inicio, Date _final) {
		return null;
	}

}
