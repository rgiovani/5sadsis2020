package builder.comida.lasanha;

import java.util.HashSet;
import java.util.Set;

public class Lasanha {
	private Set<LasanhaListener> listeners;
	
	private int tamanho;
	private boolean frango;
	private boolean presunto;
	private boolean legumes;
	
	private String infoLasanha;
	
	
	private Lasanha(Builder builder) {
		listeners = builder.listeners;
		frango = builder.frango;
		presunto = builder.presunto;
		legumes = builder.legumes;
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
		private boolean legumes = false;
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
		
		public Builder legumes() {
			infoLasanha += " Legumes";
			legumes = true;
			for(LasanhaListener listener: this.listeners) {
				listener.foiAdicionadoLegumes();
			}
			return this;
		}
		
		
		public Lasanha build() {
			infoLasanha += ".";
			return new Lasanha(this);
		}
	}
	
}
