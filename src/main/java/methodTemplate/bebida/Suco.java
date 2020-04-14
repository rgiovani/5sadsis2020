package methodTemplate.bebida;

public class Suco extends Bebida{

	@Override
	public void dividirBebida() {
		System.out.println("Pegando 2 copos de suco");
	}

	@Override
	public void colocarEmRecipiente() {
		System.out.println("Tirando da jarra e colocando em um copo");
	}

	@Override
	public void alterarTemperatura() {
		System.out.println("Colocando agua na geladeira");
	}

	@Override
	public void inserirAdicionais() {
		System.out.println("Adicionando açucar e gelo");
	}

	@Override
	public void misturar() {
		System.out.println("Preparando o suco");
	}

}
