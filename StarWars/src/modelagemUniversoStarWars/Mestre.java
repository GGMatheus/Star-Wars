package modelagemUniversoStarWars;

public class Mestre extends Cavaleiro {
	private long campoDeVidencia;
	public boolean imortalidade = false;
	private long vida;
	private int dominioSabre;
	public boolean esquivaMestre = false;
	
	public Mestre(double porcentagem, SabreDeLuz sabre, long videncia) {
		super(porcentagem, sabre);
		campoDeVidencia = videncia;
	}
	
	public Mestre(double porcentagem, SabreDeLuz sabre, long vida, int dominioSabre) {
		super(porcentagem, sabre);
		this.vida = vida;
		this.dominioSabre = dominioSabre;
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

	public long getVida() {
		return vida;
	}

	public void setVida(long vida) {
		this.vida = vida;
	}

	public void ehImortal() {
		imortalidade = true;
	}
	
	public void atacarComSabre(Lord l) {
		String tipo = "sabre";
		long vida;
		vida = l.getVida() - 1000;
		l.setVida(vida);
	}
	
	public void atacarComRelampagoDaForca(Lord l) {
		String tipo = "forca";
		long vida;
		vida = l.getVida() - 200;
		l.setVida(vida);
	}
	
	public void atacarComJulgamentoEletrico(Lord l) {
		String tipo = "forca";
		long vida;
		vida = l.getVida() - 400;
		l.setVida(vida);
	}
	
	public void atacarComAtordoarDaForca(Lord l) {
		String tipo = "forca";
		long vida;
		vida = l.getVida() - 100;
		l.setVida(vida);
	}
	
	public void esquivar() {
		esquivaMestre = true;
	}
	
}
