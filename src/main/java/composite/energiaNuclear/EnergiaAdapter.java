package composite.energiaNuclear;

public class EnergiaAdapter implements FornecedorDeEnergia{
	private GeradorDeEnergiaNuclear fornecedorDeEnergia;
	
	public EnergiaAdapter(GeradorDeEnergiaNuclear fornecedorDeEnergia) {
		this.fornecedorDeEnergia = fornecedorDeEnergia;
	}

	@Override
	public double fornecer() {	
		return fornecedorDeEnergia.energizar();
	}
	
	
	
}
