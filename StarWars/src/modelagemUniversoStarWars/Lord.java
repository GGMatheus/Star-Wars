package modelagemUniversoStarWars;

public class Lord extends Sith {
	private long campoDeVidencia;
	private SabreDeLuz sabre;
	private double vida;
	private int dominioSabre;
	private int dominioForca;
	private double dano;
	public boolean esquivaLord = false;
	
	public Lord(double porcentagem, long campoDeVidencia, SabreDeLuz sabre) {
		super(porcentagem);
		this.campoDeVidencia = campoDeVidencia;
		this.sabre = sabre;
	}
	
	public Lord(double porcentagem, SabreDeLuz sabre, double vida, int dominioSabre, int dominioForca) {
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

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public int getDominioSabre() {
		return dominioSabre;
	}

	public void setDominioSabre(int dominioSabre) {
		this.dominioSabre = dominioSabre;
	}
	
	public int getDominioForca() {
		return dominioForca;
	}

	public void setDominioForca(int dominioForca) {
		this.dominioForca = dominioForca;
	}

	public double getDano() {
		return dano;
	}

	public void setDano(double dano) {
		this.dano = dano;
	}

	public void atacarComSabre(Mestre m) {
		double damage, vida;
		damage = (500 * (1 + (0.01 * dominioForca)) + 500 * (1 + (0.01 * dominioSabre)));
		vida = m.getVida() - damage;
		dano = damage;
		m.setVida(vida);
	}
	
	public void atacarComRelampagoDaForca(Mestre m) {
		double damage, vida;
		damage = (100 * (1 + (0.01 * dominioForca)) + 100 * (1 + (0.01 * dominioSabre)));
		dano = damage;
		vida = m.getVida() - damage;
		m.setVida(vida);
	}
	
	public void atacarComFuriaDaForca(Mestre m) {
		double damage, vida;
		damage = (200 * (1 + (0.01 * dominioForca)) + 200 * (1 + (0.01 * dominioSabre)));
		dano = damage;
		vida = m.getVida() - damage;
		m.setVida(vida);
	}
	
	public void atacarComEstrangulamentoDaForca(Mestre m) {
		double damage, vida;
		damage = (50 * (1 + (0.01 * dominioForca)) + 50 * (1 + (0.01 * dominioSabre)));
		dano = damage;
		vida = m.getVida() - damage;
		m.setVida(vida);
	}
	
	public void esquivar() {
		esquivaLord = true;
	}
}
