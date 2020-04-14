package methodTemplate.bebida;

public class Whisky  extends Bebida{

	@Override
	public void dividirBebida() {
		System.out.println("Divindo em 2 copos especiais");
	}

	@Override
	public void colocarEmRecipiente() {
		System.out.println("Colocando em um copo especial");
	}

	@Override
	public void alterarTemperatura() {
		System.out.println("Mantendo o whisky na temperatura ambiente");
	}

	@Override
	public void inserirAdicionais() {
		System.out.println("Inserindo gelo");
	}

	@Override
	public void misturar() {
		System.out.println("Preparando o whisky");
	}

}
