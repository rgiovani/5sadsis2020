package composite.base;

import java.util.ArrayList;
import java.util.List;

public class FornecedorComposite implements FornecedorDeEnergia{
	
	private List<FornecedorDeEnergia> fornecedoresDeEnergia = new ArrayList<>();
	private double energiaTotal = 0.0; 
	
	@Override
	public double fornecer() {
		for (FornecedorDeEnergia fe : fornecedoresDeEnergia) {
			if (fe.fornecer() != 0) {
				energiaTotal += fe.fornecer();
			}else {
				System.out.println("Uma das pilhas ficou sem energia");
				return 0;
			}
		}
		
		if (energiaTotal>0.1) {
			return energiaTotal;
		}
		
		System.out.println("Não tem mais energia");
		return 0;
		
	}
	
	public void adicionarEnergia(FornecedorDeEnergia energia) {
		fornecedoresDeEnergia.add(energia);
	}
}
