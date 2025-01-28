package exe_abstrata;

public class Peixe extends Animal{
	private int q_barbatanas;

	public Peixe(String tipo, int b) {
		super(tipo);
		this.q_barbatanas = b;
	}
	
	public void exibir() {
		System.out.println("Animal [tipo=" + this.tipo + ", quantidade de barbatanas="+ this.q_barbatanas + "]");
	}
}
