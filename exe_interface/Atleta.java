package exe_interface;

public abstract class Atleta implements Acoes,Feitos{
	protected String tipo;
	
	public Atleta(String tipo) {
		this.tipo = tipo;
	}

	public void correr() {
		System.out.println("Correr.");
	}
	
	public void treinar() {
		System.out.println("Treinando.");
	}
	
	public void dar_entrvista() {
		System.out.println("dar entrevista.");
	}
}
