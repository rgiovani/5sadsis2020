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
	public void foiAdicionadoLegumes() {
		System.out.println(">> Foi adicionado Legumes na lasanha");
		
	}

}
