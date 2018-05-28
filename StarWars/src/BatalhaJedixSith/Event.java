package BatalhaJedixSith;

import modelagemUniversoStarWars.*;

public abstract class Event {
	
	private long evtTime;
	
//	public Event(long eventTime) {
//		evtTime = eventTime;
//	}
	
	public boolean ready() {
		return System.currentTimeMillis() >= evtTime;
	}
	abstract public void action(int n, Mestre m, Lord l);
	abstract public void description(int n, Mestre m, Lord l);
	
}
