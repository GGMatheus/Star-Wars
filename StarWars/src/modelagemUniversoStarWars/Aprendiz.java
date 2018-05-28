package modelagemUniversoStarWars;

public class Aprendiz extends Sith {
	public boolean sabeConstruirSabreDeLuz = false;
	private Lord treinador;
	
	public Aprendiz(double porcentagem, Lord treinador) {
		super(porcentagem);
		this.treinador = treinador;
	}

	public Lord getTreinador() {
		return treinador;
	}

	public void setTreinador(Lord treinador) {
		this.treinador = treinador;
	}	
	
	public void TaSabendo() {
		sabeConstruirSabreDeLuz = true;
	}
}
