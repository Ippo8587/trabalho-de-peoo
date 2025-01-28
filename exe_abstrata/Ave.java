package exe_abstrata;

public class Ave extends Animal{
	private String cor;
	
	public Ave(String tipo, String cor) {
		super(tipo);
		this.cor = cor;
	}
	
	public void exibir() {
		System.out.println("Animal [tipo=" + this.tipo + ", cor="+ this.cor +"]");
	}
}
