
public class Main {

	public static void main(String[] args) {
		CaixaEletronico cx = new CaixaEletronico();
		Conta ct = cx.autentica("0001", "1234");
		
		if(ct != null) {
			System.out.println("Bem vindo ao banco!"); 	
		}else {
			System.out.println("Usuário ou senha inválido");
		}
	}

}
