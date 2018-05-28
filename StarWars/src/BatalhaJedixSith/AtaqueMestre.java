package BatalhaJedixSith;

import modelagemUniversoStarWars.Lord;
import modelagemUniversoStarWars.Mestre;

public class AtaqueMestre extends Event {
	
	public int tipoAtaque;
	
	public void action(int n, Mestre m, Lord l) {	
		tipoAtaque = n; 
		if (tipoAtaque == 1 && l.esquivaLord == false) {
			m.atacarComSabre(l);
		}
		if (tipoAtaque == 2) {
			m.atacarComRelampagoDaForca(l);
		}
		if (tipoAtaque == 3) {
			m.atacarComJulgamentoEletrico(l);
		}
		if (tipoAtaque == 4) {
			m.atacarComAtordoarDaForca(l);
		}
		if (tipoAtaque == 5) {
			m.esquivar();
		}

	}
	
	public void description(int n, Mestre m, Lord l) {
		
		tipoAtaque = n;
		if (tipoAtaque == 1 && l.esquivaLord == false) {
			System.out.println("o Mestre Jedi causou " + m.getDano() + " de dano no Lord Sith" + "\n" +
							   "a vida atual do Lod Sith eh " + l.getVida());
		
		}
		if (tipoAtaque != 1 && tipoAtaque != 5) {
			System.out.println("o Mestre Jedi causou " + m.getDano() + " de dano no Lord Sith" + "\n" +
					   "a vida atual do Lod Sith eh " + l.getVida());
		}
		if(tipoAtaque == 5) System.out.println("O Mestre Jedi esquivou");
		else if (tipoAtaque == 1 && l.esquivaLord == true) {
			System.out.println("O Mestre Jedi nao causou dano" + "\n" +
							   "a vida atual do Lod Sith eh " + l.getVida());
		}
		
	}
}
