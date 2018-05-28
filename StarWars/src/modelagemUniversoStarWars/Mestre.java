package modelagemUniversoStarWars;

public class Mestre extends Cavaleiro {
	private long campoDeVidencia;
	public boolean imortalidade = false;
	private double vida;
	private int dominioSabre;
	private int dominioForca;
	private double dano;
	public boolean esquivaMestre = false;
	
	public Mestre(double porcentagem, SabreDeLuz sabre, long videncia) {
		super(porcentagem, sabre);
		campoDeVidencia = videncia;
	}
	
	public Mestre(double porcentagem, SabreDeLuz sabre, double vida, int dominioSabre, int dominioForca) {
		super(porcentagem, sabre);
		this.vida = vida;
		this.dominioSabre = dominioSabre;
		this.dominioForca = dominioForca;
	}

	public long getCampoDeVidencia() {
		return campoDeVidencia;
	}

	public void setCampoDeVidencia(long campoDeVidencia) {
		this.campoDeVidencia = campoDeVidencia;
	}
	
	public int getDominioSabre() {
		return dominioSabre;
	}

	public void setDominioSabre(int dominioSabre) {
		this.dominioSabre = dominioSabre;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
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

	public void ehImortal() {
		imortalidade = true;
	}
	
	public void atacarComSabre(Lord l) {
		double damage, vida;
		damage = (500 * (1 + (0.01 * dominioForca)) + 500 * (1 + (0.01 * dominioSabre)));
		dano = damage;
		vida = l.getVida() - damage;
		l.setVida(vida);
	}
	
	public void atacarComRelampagoDaForca(Lord l) {
		double damage, vida;
		damage = (100 * (1 + (0.01 * dominioForca)) + 100 * (1 + (0.01 * dominioSabre)));
		dano = damage;
		vida = l.getVida() - damage;
		l.setVida(vida);
	}
	
	public void atacarComJulgamentoEletrico(Lord l) {
		double damage, vida;
		damage = (200 * (1 + (0.01 * dominioForca)) + 200 * (1 + (0.01 * dominioSabre)));
		dano = damage;
		vida = l.getVida() - damage;
		l.setVida(vida);
	}
	
	public void atacarComAtordoarDaForca(Lord l) {
		double damage, vida;
		damage = (50 * (1 + (0.01 * dominioForca)) + 50 * (1 + (0.01 * dominioSabre)));
		dano = damage;
		vida = l.getVida() - damage;
		l.setVida(vida);
	}
	
	public void esquivar() {
		esquivaMestre = true;
	}
	
}
