package methodTemplate.bebida;

public class Cafe  extends Bebida{

	@Override
	public void dividirBebida() {
		System.out.println("Pegando 1 xicará de café");
	}

	@Override
	public void colocarEmRecipiente() {
		System.out.println("Colocando café na garrafa");
	}

	@Override
	public void alterarTemperatura() {
		System.out.println("Fervendo a agua");
	}

	@Override
	public void inserirAdicionais() {
		System.out.println("Adicionando açucar");
	}

	@Override
	public void misturar() {
		System.out.println("Preparando o café");
	}

}
