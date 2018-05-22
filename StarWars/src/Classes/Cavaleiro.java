package Classes;

public class Cavaleiro extends Jedi {
	private SabreDeLuz sabre;
	
	public Cavaleiro(double porcentagem, SabreDeLuz sabre) {
		super(porcentagem);
		this.sabre = sabre;
	}

	public SabreDeLuz getSabre() {
		return sabre;
	}

	public void setSabre(SabreDeLuz sabre) {
		this.sabre = sabre;
	}
}
