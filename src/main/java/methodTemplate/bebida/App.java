package methodTemplate.bebida;

public class App {
	public static void main(String[] args) {
		Cafe cafe = new Cafe();
		Suco uva = new Suco();
		Whisky whisky = new Whisky();
		
		cafe.preparar();
		//uva.preparar();
		//whisky.preparar();
	}
}
