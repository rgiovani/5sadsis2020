package composite.base;

public class PilhaNormal implements FornecedorDeEnergia {

	@Override
	public void fornecer() {
		System.out.println("PilhaNormal fornecendo energia....");
	}

}