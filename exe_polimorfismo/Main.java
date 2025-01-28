package exe_polimorfismo;

public class Main {

	public static void main(String[] args) {
		//exemplo 1
		Funcionario f0 = new Funcionario();
		f0.exibir();
		Ti t0 = new Ti();
		t0.exibir();
		
		//exemplo 2
		Pessoa p0 = new Pessoa();
		p0.idade_pessoa();
		p0.idade_pessoa(10);
	}

}
