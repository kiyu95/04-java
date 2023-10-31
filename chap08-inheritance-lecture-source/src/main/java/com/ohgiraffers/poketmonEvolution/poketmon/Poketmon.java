package main.java.com.ohgiraffers.poketmonEvolution.poketmon;

public class Poketmon {

    private String name;
    private String skill;

    public Poketmon(String name, String skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "포켓몬의 이름 : " + name + "\n" +
                "보유한 기술 : " + skill;
    }
}
