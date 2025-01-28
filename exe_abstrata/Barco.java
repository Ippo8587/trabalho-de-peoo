package exe_abstrata;

public class Barco extends Veiculo{

	public Barco(String cor) {
		super(cor);
	}
	
	public void locomover() {
		System.out.println("Barco navegando.");
	}
}
