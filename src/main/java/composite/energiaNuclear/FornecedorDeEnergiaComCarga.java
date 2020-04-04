package composite.energiaNuclear;

public abstract class FornecedorDeEnergiaComCarga implements FornecedorDeEnergia {
	private double cargaDisponível;
	
	public FornecedorDeEnergiaComCarga(double cargaDisponível) {
		this.cargaDisponível = cargaDisponível;
	}
	
	public double getCargaDisponível() {
		return cargaDisponível;
	}
	
	@Override
	public double fornecer() {
		if (cargaDisponível - 0.1 > 0.0) {
			cargaDisponível -= 0.1;
			return 0.1;
		}
		return 0.0;		
	}

}
