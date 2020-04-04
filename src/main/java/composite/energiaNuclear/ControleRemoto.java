package composite.energiaNuclear;

public class ControleRemoto {
	private FornecedorDeEnergia fornecedorDeEnergia;

	public void setFornecedorDeEnergia(FornecedorDeEnergia fe) {
		this.fornecedorDeEnergia = fe;
	}

	public void ligar() {
		if (fornecedorDeEnergia.fornecer() >= 0.1) {
			System.out.println("ControleRemoto: ligar.");
		}
	}

	public void trocarCanal(int canal) {
		if (fornecedorDeEnergia.fornecer() >= 0.1) {
			System.out.println("ControleRemoto: trocarCanal " + canal + ".");
		}
	}

	public void desligar() {
		if (fornecedorDeEnergia.fornecer() >= 0.1) {
			System.out.println("ControleRemoto: desligar.");
		}
	}

}