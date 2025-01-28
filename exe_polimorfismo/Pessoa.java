package exe_polimorfismo;

public class Pessoa {
	public int idade;
	
	public void idade_pessoa() {
		System.out.println("Idade indefinida.");
	}
	
	public void idade_pessoa(int i) {
		this.idade = i;
		System.out.println("A idade da pessoa é: " + i);
	}
}
