package composite.energiaNuclear;

import java.util.ArrayList;
import java.util.List;

public class FornecedorComposite implements FornecedorDeEnergia {
	private List<FornecedorDeEnergia> fornecedoresDeEnergia;

	public FornecedorComposite() {
		fornecedoresDeEnergia = new ArrayList<>();
	}
	
	@Override
	public double fornecer() {
		/*
		double cargaParaRetornar = 0.00;
		for (FornecedorDeEnergia fe : fornecedoresDeEnergia) {
			cargaParaRetornar += fe.fornecer();
		}	
		return cargaParaRetornar;
		*/
		
		return fornecedoresDeEnergia.parallelStream()
				.map(fe -> fe.fornecer())
				.reduce((atual, total) -> total + atual).get();		
	}

	public void adicionarFornecedor(FornecedorDeEnergia fornecedor) {
		this.fornecedoresDeEnergia.add(fornecedor);
	}

}
