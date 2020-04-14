package composite.energiaNuclear;

public class AppCompositeBase {
	
	public static void main(String[] args) {
		PilhaNormal pilhaNormal = new PilhaNormal();
		PilhaAlcalina pilhaAlcalina = new PilhaAlcalina();
		
		ControleRemoto controleDaSala = new ControleRemoto();
		FornecedorComposite composite = new FornecedorComposite();
		
		
		
		composite.adicionarFornecedor(pilhaAlcalina);
		composite.adicionarFornecedor(pilhaNormal);
		composite.adicionarFornecedor(new EnergiaAdapter(new GeradorDeEnergiaNuclear()));
		controleDaSala.setFornecedorDeEnergia(composite);
		controleDaSala.ligar();
		controleDaSala.trocarCanal(72);
		controleDaSala.trocarCanal(25);
		controleDaSala.desligar();
		
	
		System.out.println("Fim.");
	}

}
