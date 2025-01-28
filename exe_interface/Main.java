package exe_interface;

public class Main {

	public static void main(String[] args) {
		//1 exemplo
 		Corredor c0 = new Corredor("corredor", 1.80);
		c0.correr();
		c0.treinar();
		c0.dar_entrvista();
		
		//2 exemplo
		Tv t0 = new Tv();
		t0.ligar();
		t0.ligar_sinal();
	}

}
