package modelagemUniversoStarWars;

public class Padawan extends Jedi {
	public boolean sabeConstruirSabreDeLuz = false;
	private Ser treinador;
	
	public Padawan(double porcentagem, Ser treinador) {
		super(porcentagem);
		this.treinador = treinador;
	}

	public Ser getTreinador() {
		return treinador;
	}

	public void setTreinador(Ser treinador) {
		this.treinador = treinador;
	}
	
	public void taSabendo() {
		sabeConstruirSabreDeLuz = true;
	}
}
