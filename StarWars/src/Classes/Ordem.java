package Classes;

public abstract class Ordem {
	private boolean telepatia = false;
	private boolean telecinese = false;
	private boolean persuasao = false;
	
	public boolean isTelepatia() {
		return telepatia;
	}
	public void setTelepatia(boolean telepatia) {
		this.telepatia = telepatia;
	}
	public boolean isTelecinese() {
		return telecinese;
	}
	public void setTelecinese(boolean telecinese) {
		this.telecinese = telecinese;
	}
	public boolean isPersuasao() {
		return persuasao;
	}
	public void setPersuasao(boolean persuasao) {
		this.persuasao = persuasao;
	}
	
	public void temTelepatia() {
		telepatia = true;
	}
	
	public void temTelecinese() {
		telecinese = true;
	}
	
	public void temPersuasao() {
		persuasao = true;
	}
}
