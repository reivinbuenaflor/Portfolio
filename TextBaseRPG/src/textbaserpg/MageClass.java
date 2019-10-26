package textbaserpg;

import java.util.ArrayList;

public class MageClass{
	private String className = "Mage";
	private Integer classHP = 40;
	private Integer classDMG = 30;
	private Integer classDEF = 10;
	private ArrayList<String> startingITM = new ArrayList<>();
	
	public String getClassName() {
		return className;
	}
	
	public Integer getStartingHP() {
		return classHP;
	}
	
	public Integer getStartingDMG() {
		return classDMG;
	}
	
	public Integer getStartingDEF() {
		return classDEF;
	}
	
	public void setStartingHP(Integer classHP) {
		this.classHP = classHP;
	}
	
	public void setStartingDMG(Integer classDMG) {
		this.classDMG = classDMG;
	}
	
	public void setStartingDEF(Integer classDEF) {
		this.classDEF = classDEF;
	}
}