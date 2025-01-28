package exe_interface;

public class  Tv implements Controle, Antena {
	private boolean ligado;

	@Override
	public void ligar() {
		this.ligado = true;
	}

	@Override
	public void ligar_sinal() {
		System.out.println("Sinal ligado.");
	}
	

}
