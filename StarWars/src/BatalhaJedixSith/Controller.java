package BatalhaJedixSith;

import modelagemUniversoStarWars.Mestre;
import modelagemUniversoStarWars.SabreDeLuz;
import modelagemUniversoStarWars.Lord;

public class Controller {
	public int n;
	SabreDeLuz jediS = new SabreDeLuz("Kyber", "espada");
	SabreDeLuz sithS = new SabreDeLuz("Luxum", "lanca");
	Mestre m = new Mestre(80, jediS, 10827, 70, 80);
	Lord l = new Lord(75, sithS, 10457, 80, 75);
	
	
	private EventSet es = new EventSet();
	
	public void addEvent(Event c) { 
		es.add(c);
	}
	
	public void run() {
		Event e;
		while((e = es.getNext()) != null) {
			if(e.ready()) {
				e.action(n, m, l);
				e.description(n, m, l);
				es.removeCurrent();
			}
		}
	}
	
}
