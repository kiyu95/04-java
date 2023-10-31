package main.java.com.ohgiraffers.poketmonEvolution.poketmon;

public class Annibugi extends Kkobugi{
    private String name;
    private String newSkill;

    public Annibugi(String name, String skill) {
        super(name, skill);
        this.name = name;
        this.newSkill = super.getSkill() + skill;
    }

    @Override
    public String getSkill() {
        return newSkill;
    }

    @Override
    public void setSkill(String skill) {
        this.newSkill = skill;
    }

    @Override
    public String toString() {
        return "포켓몬의 이름 : " + name + "\n" +
                "보유한 기술 : " + newSkill;
        // name = "Annibugi";
        // skill = "FrozenBeam";
    }
}
