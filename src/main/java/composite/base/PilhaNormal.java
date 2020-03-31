package composite.base;

public class PilhaNormal implements FornecedorDeEnergia {
	private double energiaPilhaNormal = 0.2;
	
	@Override
	public double fornecer() {
		if (energiaPilhaNormal>= 0.1) {
			energiaPilhaNormal-=0.1;
			System.out.println("PilhaNormal fornecendo energia....");
			return energiaPilhaNormal;
		}else {
			System.out.println("A pilha nao contem energia");
			return 0;
		}
	}
	
	public double getEnergiaPilhaNormal() {
		return energiaPilhaNormal;
	}

}