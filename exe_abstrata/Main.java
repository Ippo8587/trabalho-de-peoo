package exe_abstrata;

public class Main {

	public static void main(String[] args) {
		//exemplo 1
		Ave A0 = new Ave("ave", "azul");
		A0.exibir();
		
		Peixe p0 = new Peixe("peixe", 2);
		p0.exibir();
		
		//exemplo 2
		Carro c0 = new Carro("vermelho", 2);
		c0.locomover();
		
		Barco B0 = new Barco("branco");
		B0.locomover();
	}

}
