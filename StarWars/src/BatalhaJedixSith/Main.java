package BatalhaJedixSith;

import modelagemUniversoStarWars.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		
		SabreDeLuz jediS = new SabreDeLuz("Kyber", "espada");
		SabreDeLuz sithS = new SabreDeLuz("Luxum", "lanca");
		Mestre m = new Mestre(80, jediS, 10827, 72, 78);
		Lord l = new Lord(75, sithS, 10657, 81, 77);
		AtaqueMestre am = new AtaqueMestre();
		AtaqueSith as = new AtaqueSith();
		
		Scanner ler = new Scanner(System.in);
		int nm;
		int ns;
		
		System.out.println("Voce esta prestes a definir o destino de uma luta epica pelo controle do Universo entre um Mestre Jedi e um Lord Sith!" + "\n" +
						   "Escolha a acao que cada um deles tomara e decida quem implantara o proximo regime politico e estabelecera a ordem ou o caos no Universo.");
		
		while (m.getVida() > 0 && l.getVida() > 0) {
			
			System.out.println("Escolha a acao que o Mestre Jedi ira tomar:" + "\n" +
						"1.Atacar com Sabre de Luz." + "\n" + "2.Atacar com Relampago da Forca" + "\n" +
						"3. Atacar com Julgamento Eletrico" + "\n" + "4.Atacar com Atordoamento da Forca"
						+ "\n" + "5.Esquivar");
			
				nm = ler.nextInt();
				if (nm < 1 || nm > 5) {
					InputMismatchException erro = new InputMismatchException();
					throw erro;
				}
			System.out.println("Escolha a acao que o Lord Sith ira tomar:" + "\n" +
						"1.Atacar com Sabre de Luz." + "\n" + "2.Atacar com Relampago da Forca" + "\n" +
						"3. Atacar com Furia da Forca" + "\n" + "4.Atacar com Estrangulamento da Forca"
						+ "\n" + "5.Esquivar");
			ns = ler.nextInt();
			if (ns < 1 || ns > 5) {
				InputMismatchException erro = new InputMismatchException();
				throw erro;
			}
			
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
			
			if (nm != 5 && ns != 5 && nm != 1 && ns != 1) {
				am.action(nm, m, l);
				am.description(nm, m, l);
				as.action(ns, m, l);
				as.description(ns, m, l);
			}
			
			if (nm == 1 && ns == 1) {
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
		
		ler.close();
		
		if (m.getVida() <= 0 && l.getVida() > 0) System.out.println("O Lord Sith venceu a batalha!" + "\n" + "O Imperio Galatico foi instaurado no Universo!");
		if (m.getVida() <= 0 && l.getVida() <= 0) System.out.println("O Mestre Jedi e o Lord Sith mataram-se mutuamente numa batalha epica");
		else if (l.getVida() <= 0 && m.getVida() > 0) System.out.println("O Mestre Jedi venceu a batalha!" + "\n" + "A Republica Galatica foi instaurada no Universo!");
		
		
	}
}
