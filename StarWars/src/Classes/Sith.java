package Classes;

public class Sith extends Ordem {
	private double raiva; //porcentagem
	
	public Sith(double porcentagem) {
		raiva = porcentagem;
	}

	public double getRaiva() {
		return raiva;
	}

	public void setRaiva(double raiva) {
		this.raiva = raiva;
	}
	
	
}
