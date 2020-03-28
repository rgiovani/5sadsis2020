package composite.base;

import java.util.ArrayList;
import java.util.List;

public class FornecedorComposite implements FornecedorDeEnergia{
	private List<FornecedorDeEnergia> fornecedoresDeEnergia = new ArrayList<>();

	@Override
	public void fornecer() {
	}
	
	public void adicionarEnergia(FornecedorDeEnergia energia) {
		fornecedoresDeEnergia.add(energia);
	}
}
