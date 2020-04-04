package composite.energiaNuclear;

public class EnergiaAdapter implements GeradorDeEnergiaNuclear{
	private FornecedorDeEnergia fornecedorDeEnergia;
	
	public EnergiaAdapter(FornecedorDeEnergia fornecedorDeEnergia) {
		this.fornecedorDeEnergia = fornecedorDeEnergia;
	}
	
	@Override
	public double energizar() {
		System.out.println("Energia nuclear energizando...");
		return fornecedorDeEnergia.fornecer();
	}
	
	public FornecedorDeEnergia getFornecedorDeEnergia() {
		return fornecedorDeEnergia;
	}
	
}
