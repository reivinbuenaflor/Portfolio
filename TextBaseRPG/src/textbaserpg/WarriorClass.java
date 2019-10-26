package textbaserpg;

public class WarriorClass {
    private String className = "Warrior";

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getClassHP() {
        return classHP;
    }

    public void setClassHP(Integer classHP) {
        this.classHP = classHP;
    }

    public Integer getClassDMG() {
        return classDMG;
    }

    public void setClassDMG(Integer classDMG) {
        this.classDMG = classDMG;
    }

    public Integer getClassDEF() {
        return classDEF;
    }

    public void setClassDEF(Integer classDEF) {
        this.classDEF = classDEF;
    }
    private Integer classHP = 50;
    private Integer classDMG = 30;
    private Integer classDEF = 20;
    
}
