
public class CaixaEletronico {
	public Conta autentica(String numeroConta, String senha) {
		if( numeroConta.equals("0001") && senha.equals("1234")) {
			return new Conta(numeroConta, senha);
		}
		return null;		
	}
}
