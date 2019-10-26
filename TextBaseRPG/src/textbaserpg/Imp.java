package textbaserpg;

public class Imp {
    private String mobName = "Imp";

    public String getMobName() {
        return mobName;
    }

    public void setMobName(String mobName) {
        this.mobName = mobName;
    }

    public Integer getMobHP() {
        return mobHP;
    }

    public void setMobHP(Integer mobHP) {
        this.mobHP = mobHP;
    }

    public Integer getMobDMG() {
        return mobDMG;
    }

    public void setMobDMG(Integer mobDMG) {
        this.mobDMG = mobDMG;
    }

    public Integer getMobDEF() {
        return mobDEF;
    }

    public void setMobDEF(Integer mobDEF) {
        this.mobDEF = mobDEF;
    }
    private Integer mobHP = 25;
    private Integer mobDMG = 25;
    private Integer mobDEF = 10;
}
