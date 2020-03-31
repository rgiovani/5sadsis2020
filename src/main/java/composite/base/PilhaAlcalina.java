package composite.base;

public class PilhaAlcalina implements FornecedorDeEnergia {
	private double energiaPilhaAlcalina = 0.4;

	@Override
	public double fornecer() {
		if (energiaPilhaAlcalina>= 0.1) {
			energiaPilhaAlcalina-=0.1;
			System.out.println("PilhaAlcalina fornecendo energia...");
			return energiaPilhaAlcalina;
		}else {
			System.out.println("A pilha nao contem energia");
			return 0;
		}
	}
	
	public double getEnergiaPilhaAlcalina() {
		return energiaPilhaAlcalina;
	}

}