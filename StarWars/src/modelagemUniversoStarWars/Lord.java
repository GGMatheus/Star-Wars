package modelagemUniversoStarWars;

public class Lord extends Sith {
	private long campoDeVidencia;
	private SabreDeLuz sabre;
	private long vida;
	private int dominioSabre;
	public boolean esquivaLord = false;
	
	public Lord(double porcentagem, long campoDeVidencia, SabreDeLuz sabre) {
		super(porcentagem);
		this.campoDeVidencia = campoDeVidencia;
		this.sabre = sabre;
	}
	
	public Lord(double porcentagem, SabreDeLuz sabre, long vida, int dominioSabre) {
		super(porcentagem);
		this.sabre = sabre;
		this.vida = vida;
		this.dominioSabre = dominioSabre;
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

	public long getVida() {
		return vida;
	}

	public void setVida(long vida) {
		this.vida = vida;
	}

	public int getDominioSabre() {
		return dominioSabre;
	}

	public void setDominioSabre(int dominioSabre) {
		this.dominioSabre = dominioSabre;
	}
	
	public void atacarComSabre(Mestre m) {
		String tipo = "sabre";
		long vida;
		vida = m.getVida() - 1000;
		m.setVida(vida);
	}
	
	public void atacarComRelampagoDaForca(Mestre m) {
		String tipo = "forca";
		long vida;
		vida = m.getVida() - 200;
		m.setVida(vida);
	}
	
	public void atacarComFuriaDaForca(Mestre m) {
		String tipo = "forca";
		long vida;
		vida = m.getVida() - 400;
		m.setVida(vida);
	}
	
	public void atacarComEstrangulamentoDaForca(Mestre m) {
		String tipo = "forca";
		long vida;
		vida = m.getVida() - 100;
		m.setVida(vida);
	}
	
	public void esquivar() {
		esquivaLord = true;
	}
}
