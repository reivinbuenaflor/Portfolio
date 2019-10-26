package textbaserpg;

public class MobsStats{
	private String mobName;
	private double mobHP;
	private Integer mobDMG;
	private Integer mobDEF;
	
	
	public String getMobName() {
		return mobName;
	}
	
	public void setMobName(String mobName) {
		this.mobName = mobName;
	}
	
	public double getMobHP() {
		return mobHP;
	}
	
	public void setMobHP(double playerHP) {
		this.mobHP = playerHP;
	}
	
	public Integer getMobDMG() {
		return mobDMG;
	}
	
	public void setMobDMG(Integer playerDMG) {
		this.mobDMG = playerDMG;
	}
	
	public Integer getMobDEF() {
		return mobDEF;
	}
	
	public void setMobDef(Integer block) {
		this.mobDEF = block;
	}
	
	
}