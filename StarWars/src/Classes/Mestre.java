package Classes;

public class Mestre extends Cavaleiro {
	private long campoDeVidencia;
	public boolean imortalidade = false;
	
	public Mestre(double porcentagem, SabreDeLuz sabre, long videncia) {
		super(porcentagem, sabre);
		campoDeVidencia = videncia;
	}

	public long getCampoDeVidencia() {
		return campoDeVidencia;
	}

	public void setCampoDeVidencia(long campoDeVidencia) {
		this.campoDeVidencia = campoDeVidencia;
	}
	
	public void ehImortal() {
		imortalidade = true;
	}
}
