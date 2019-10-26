package textbaserpg;

public class PlayerStats{
	private String playerName;
	private double playerHP;
	private Integer playerDMG;
	private Integer playerDEF;
	private String playerClass;
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public double getPlayerHP() {
		return (int)playerHP;
	}
	
	public void setPlayerHP(double damageplyrHp) {
		this.playerHP = damageplyrHp;
	}
	
	public Integer getPlayerDMG() {
		return playerDMG;
	}
	
	public void setPlayerDMG(Integer playerDMG) {
		this.playerDMG = playerDMG;
	}
	
	public Integer getPlayerDEF() {
		return playerDEF;
	}
	
	public void setPlayerDef(Integer block) {
		this.playerDEF = block;
	}
	
	public String getPlayerClass() {
		return playerClass;
	}
	
	public void setPlayerClass(String playerClass) {
		this.playerClass = playerClass;
	}
	
}