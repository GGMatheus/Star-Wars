package BatalhaJedixSith;

import modelagemUniversoStarWars.*;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		
		SabreDeLuz jediS = new SabreDeLuz("Kyber", "espada");
		SabreDeLuz sithS = new SabreDeLuz("Luxum", "lanca");
		Mestre m = new Mestre(80, jediS, 3827, 70);
		Lord l = new Lord(75, sithS, 3457, 75);
		AtaqueMestre am = new AtaqueMestre();
		AtaqueSith as = new AtaqueSith();
		
		Scanner ler = new Scanner(System.in);
		int nm;
		int ns;
		
		while (m.getVida() > 0 && l.getVida() > 0) {
			
			System.out.println("Escolha a acao que o Mestre Jedi ira tomar:" + "\n" +
						"1.Atacar com Sabre de Luz." + "\n" + "2.Atacar com Relampago da Forca" + "\n" +
						"3. Atacar com Julgamento Eletrico" + "\n" + "4.Atacar com Atordoamento da Forca"
						+ "\n" + "5.Esquivar");
			nm = ler.nextInt();
			System.out.println("Escolha a acao que o Lord Sith ira tomar:" + "\n" +
						"1.Atacar com Sabre de Luz." + "\n" + "2.Atacar com Relampago da Forca" + "\n" +
						"3. Atacar com Furia da Forca" + "\n" + "4.Atacar com Estrangulamento da Forca"
						+ "\n" + "5.Esquivar");
			ns = ler.nextInt();
			
			m.esquivaMestre = false;
			l.esquivaLord = false;
			
			if (nm == 5 && ns == 1) {
				am.action(nm, m, l);
				am.description(nm, m, l);
				as.action(ns, m, l);
				as.description(ns, m, l);
			}
			
			if (nm == 1 && ns == 5) {
				as.action(ns, m, l);
				as.description(ns, m, l);
				am.action(nm, m, l);
				am.description(nm, m, l);
			}
			
			if (nm != 5 && ns != 5) {
				am.action(nm, m, l);
				am.description(nm, m, l);
				as.action(ns, m, l);
				as.description(ns, m, l);
			}
			
			if (nm == 1 && ns != 5 && ns != 1) {
				am.action(nm, m, l);
				am.description(nm, m, l);
				as.action(ns, m, l);
				as.description(ns, m, l);
			}
			
			if (ns ==1 && nm != 5 && nm != 1) {
				as.action(ns, m, l);
				as.description(ns, m, l);
				am.action(nm, m, l);
				am.description(nm, m, l);
			}
			
			if (nm == 5 && ns != 5 && ns != 1) {
				am.action(nm, m, l);
				am.description(nm, m, l);
				as.action(ns, m, l);
				as.description(ns, m, l);
			}
			
			if (ns == 5 && nm != 5 && nm != 1) {
				as.action(ns, m, l);
				as.description(ns, m, l);
				am.action(nm, m, l);
				am.description(nm, m, l);
			}
			
		}
		
		if (m.getVida() <= 0) System.out.println("O Lord Sith venceu a batalha!");
		else if (l.getVida() <= 0) System.out.println("O Mestre Jedi venceu a batalha!");
		
		
	}
}
