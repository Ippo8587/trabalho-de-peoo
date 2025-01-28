package exe_abstrata;

public class Carro extends Veiculo{
	private int quant_portas;

	public Carro(String cor, int r) {
		super(cor);
		this.quant_portas = r;
	}
	
	public void locomover() {
		System.out.println("Carro rodando.");
	}

}
