package composite.base;

public class ControleRemoto {
	private FornecedorDeEnergia fornecedorDeEnergia;

	public void setFornecedorDeEnergia(FornecedorDeEnergia fe) {
		this.fornecedorDeEnergia = fe;
	}

	public void ligar() {
		System.out.println("ControleRemoto: ligar.");
		fornecedorDeEnergia.fornecer();
	}

	public void trocarCanal(int canal) {
		System.out.println("ControleRemoto: trocarCanal " + canal + ".");
		fornecedorDeEnergia.fornecer();
	}

	public void desligar() {
		System.out.println("ControleRemoto: desligar.");
		fornecedorDeEnergia.fornecer();
	}

}