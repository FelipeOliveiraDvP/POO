
public class Piloto extends Pessoa {
	String patente;
	int horasVoo;
	String breve;
	
	Piloto(){
		super("nome");
	}
	
	public void pilotar() {
		System.out.println("Pilotando o avião");
		horasVoo += 10;
	}
}
