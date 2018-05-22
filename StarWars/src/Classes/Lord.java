package Classes;

public class Lord extends Sith {
	private long campoDeVidencia;
	private SabreDeLuz sabre;
	
	public Lord(double porcentagem, long campoDeVidencia, SabreDeLuz sabre) {
		super(porcentagem);
		this.campoDeVidencia = campoDeVidencia;
		this.sabre = sabre;
	}

	public long getCampoDeVidencia() {
		return campoDeVidencia;
	}

	public void setCampoDeVidencia(long campoDeVidencia) {
		this.campoDeVidencia = campoDeVidencia;
	}

	public SabreDeLuz getSabre() {
		return sabre;
	}

	public void setSabre(SabreDeLuz sabre) {
		this.sabre = sabre;
	}
}
