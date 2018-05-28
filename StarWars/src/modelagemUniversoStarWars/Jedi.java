package modelagemUniversoStarWars;

public class Jedi extends Ordem{
	private double pazInterna; //porcentagem
	
	public Jedi(double porcentagem) {
		pazInterna = porcentagem;
	}

	public double getPazInterna() {
		return pazInterna;
	}

	public void setPazInterna(double pazInterna) {
		this.pazInterna = pazInterna;
	}
}
