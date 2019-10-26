package textbaserpg;

public class ThiefClass {
    private String className = "Thief";

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
    private Integer classHP = 40;
    private Integer classDMG = 35;
    private Integer classDEF = 20;
}
