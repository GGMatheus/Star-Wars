package BatalhaJedixSith;

import modelagemUniversoStarWars.Lord;
import modelagemUniversoStarWars.Mestre;

public class AtaqueSith extends Event{
	
	public int tipoAtaque;
	
	public void action(int n, Mestre m, Lord l) {	
		tipoAtaque = n; 
		if (tipoAtaque == 1 && m.esquivaMestre == false) {
			l.atacarComSabre(m);
		}
		if (tipoAtaque == 2) {
			l.atacarComRelampagoDaForca(m);
		}
		if (tipoAtaque == 3) {
			l.atacarComFuriaDaForca(m);
		}
		if (tipoAtaque == 4) {
			l.atacarComEstrangulamentoDaForca(m);
		}
		if (tipoAtaque == 5) {
			l.esquivar();
		}
	}
	
	public void description(int n, Mestre m, Lord l) {
		
		tipoAtaque = n;
		if (tipoAtaque == 1 && m.esquivaMestre == false) {
			System.out.println("o Lord Sith causou " + l.getDano() + " de dano no Mestre Jedi" + "\n" +
							   "a vida atual do Mestre Jedi eh " + m.getVida());
		}
		if (tipoAtaque != 1 && tipoAtaque != 5) {
			System.out.println("o Lord Sith causou " + l.getDano() + " de dano no Mestre Jedi" + "\n" +
							   "a vida atual do Mestre Jedi eh " + m.getVida());
		}
		if(tipoAtaque == 5) System.out.println("O Lord Sith esquivou");
		else if (tipoAtaque == 1 && m.esquivaMestre == true) {
			System.out.println("O Lord Sith nao causou dano" + "\n" +
							   "a vida atual do Mestre Jedi eh " + m.getVida());
		}
	}

}
