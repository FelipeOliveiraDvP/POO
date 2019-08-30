
public class Passageiro extends Pessoa{
	String passaporte;
	int ticket;
	String destino;
	
	public Passageiro() {
		super("nome");
	}

	public void embarcar() {
		System.out.println("Passageiro "+this.nome+"com o ticket "+this.ticket);
	}
}
