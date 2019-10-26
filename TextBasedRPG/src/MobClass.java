public class MobClass {
    private String mobName = "";

    public String getMobName() {
        return mobName;
    }

    public void setMobName(String mobName) {
        this.mobName = mobName;
    }

    public String getMobClass() {
        return mobClass;
    }

    public void setMobClass(String mobClass) {
        this.mobClass = mobClass;
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
    private String mobClass ="";
    private Integer mobHP = 0;
    private Integer mobDMG = 0;
    private Integer mobDEF = 0;
}
