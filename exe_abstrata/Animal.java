package exe_abstrata;

public abstract class Animal {
	protected String tipo;
	
	public Animal(String tipo) {
		this.tipo = tipo;
	}

	public void exibir() {
		System.out.println("Animal [tipo=" + this.tipo +"]");
	}
	
	
}
