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
		if (tipoAtaque == 1 && m.esquivaMestre == false) System.out.println("o Lord Sith causou 1000 de dano no Mestre Jedi");
		if (tipoAtaque == 2) System.out.println("o Lord Sith causou 200 de dano no Mestre Jedi");
		if (tipoAtaque == 3) System.out.println("o Lord Sith causou 400 de dano no Mestre Jedi");
		if (tipoAtaque == 4) System.out.println("o Lord Sith causou 100 de dano no Mestre Jedi");
		if(tipoAtaque == 5) System.out.println("O Lord Sith esquivou");
		else if (tipoAtaque == 1 && m.esquivaMestre == true) System.out.println("O Lord Sith nao causou dano");
		
	}

}
