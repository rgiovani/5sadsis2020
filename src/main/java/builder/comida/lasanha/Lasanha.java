package builder.comida.lasanha;

import java.util.HashSet;
import java.util.Set;

import observer.cofre.CofreListener;

public class Lasanha {
	private Set<LasanhaListener> listeners;
	
	private int tamanho;
	private boolean frango;
	private boolean presunto;
	private boolean carne;
	private boolean legumes;
	private boolean tomate;
	
	private String infoLasanha;
	
	
	private Lasanha(Builder builder) {
		listeners = builder.listeners;
		frango = builder.frango;
		presunto = builder.presunto;
		carne = builder.carne;
		legumes = builder.legumes;
		tomate = builder.tomate;
		infoLasanha = builder.infoLasanha;
	}
	
	
	
	public String getInfoLasanha() {
		return infoLasanha;
	}
	
	
	public static class Builder {
		private Set<LasanhaListener> listeners = new HashSet<>();
		
		private final int tamanho;
		private boolean frango = false;
		private boolean presunto = false;
		private boolean carne = false;
		private boolean legumes = false;
		private boolean tomate = false;
		private String infoLasanha = "Lasanha";
		
		public Builder(int tamanho) {
			infoLasanha += " tamanho("+ tamanho+"):";
			this.listeners.add(new LasanhaListenerConsole());
			this.tamanho = tamanho;
		}
		
		public Builder frango() {
			infoLasanha += " Frango";
			frango = true;
			for(LasanhaListener listener: this.listeners) {
				listener.foiAdicionadoFrango();
			}
			return this;
		}
		
		public Builder presunto() {
			infoLasanha += " Presunto";
			presunto = true;
			for(LasanhaListener listener: this.listeners) {
				listener.foiAdicionadoPresunto();
			}
			return this;
		}
		
		public Builder carne() {
			infoLasanha += " Carne";
			carne = true;
			for(LasanhaListener listener: this.listeners) {
				listener.foiAdicionadoCarne();
			}
			return this;
		}
		
		public Builder legumes() {
			infoLasanha += " Legumes";
			legumes = true;
			for(LasanhaListener listener: this.listeners) {
				listener.foiAdicionadoLegumes();
			}
			return this;
		}
		
		public Builder tomate() {
			infoLasanha += " Tomate";
			tomate = true;
			for(LasanhaListener listener: this.listeners) {
				listener.foiAdicionadoTomate();
			}
			return this;
		}
		
		public Lasanha build() {
			infoLasanha += ".";
			return new Lasanha(this);
		}
	}
	
}
