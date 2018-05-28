package modelagemUniversoStarWars;

public class Youngling extends Jedi {
	private Cla claDeTreinamento;
	public boolean fezColheitaDeCristais = false;
	
	public Youngling(double porcentagem, Cla cla) {
		super(porcentagem);
		claDeTreinamento = cla;
	}
	
	public Cla getClaDeTreinamento() {
		return claDeTreinamento;
	}

	public void setClaDeTreinamento(Cla claDeTreinamento) {
		this.claDeTreinamento = claDeTreinamento;
	}
	
	public void colheuCristais() {
		fezColheitaDeCristais = true;
	}
}

