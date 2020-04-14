package methodTemplate.bebida;

public abstract class Bebida {
	public final void preparar() {
		alterarTemperatura();
		inserirAdicionais();
		misturar();
		colocarEmRecipiente();
		dividirBebida();
		beber();
	}

	private void beber() {
		System.out.println("Tomando a bebida...");
	}

	public abstract void dividirBebida();

	public abstract void colocarEmRecipiente();

	public abstract void alterarTemperatura();

	public abstract void inserirAdicionais();

	public abstract void misturar();
}
