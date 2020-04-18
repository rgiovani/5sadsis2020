package builder.comida.lasanha;


public class LasanhaListenerConsole implements LasanhaListener{

	@Override
	public void foiAdicionadoFrango() {
		System.out.println(">> Foi adicionado Frango na lasanha");
	}

	@Override
	public void foiAdicionadoPresunto() {
		System.out.println(">> Foi adicionado Presunto na lasanha");
	}

	@Override
	public void foiAdicionadoCarne() {
		System.out.println(">> Foi adicionado Carne na lasanha");
	}

	@Override
	public void foiAdicionadoLegumes() {
		System.out.println(">> Foi adicionado Legumes na lasanha");
		
	}

	@Override
	public void foiAdicionadoTomate() {
		System.out.println(">> Foi adicionado Tomate na lasanha");
	}

}
