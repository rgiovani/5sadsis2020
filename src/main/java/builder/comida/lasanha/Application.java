package builder.comida.lasanha;

public class Application {
	public static void main(String[] args) {
		Lasanha lasanha = new Lasanha.Builder(5)
				.presunto()
				.frango()
				.legumes()
				.build();
		
		System.out.println(lasanha.getInfoLasanha());
		
	}
	
}
