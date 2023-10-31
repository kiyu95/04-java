package main.java.com.ohgiraffers.poketmonEvolution.poketmon;

public class Kkobugi extends Poketmon{

    private String name;
    private String skill;

    public Kkobugi(String name, String skill) {
        super(name, skill);
        this.name = name;
        this.skill = skill;
    }

    @Override
    public String getSkill() {
        return skill;
    }

    @Override
    public void setSkill(String skill) {
        this.skill = skill;
    }

    //        name = "Kkobugi";
//        skill = "WaterCannon";

}
