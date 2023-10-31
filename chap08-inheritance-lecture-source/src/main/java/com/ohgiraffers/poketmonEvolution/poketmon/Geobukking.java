package main.java.com.ohgiraffers.poketmonEvolution.poketmon;

public class Geobukking extends Annibugi{

    private String name;
    private String skill3;
    public Geobukking(String name, String skill) {
        super(name, skill);
        this.name = name;
        this.skill3 = skill3;
    }

    public String getSkill() {
        return skill3;
    }

    public void setSkill(String skill3) {
        this.skill3 = skill3;
    }

    @Override
    public String toString() {
        return "포켓몬의 이름 : " + name + "\n" +
                "보유한 기술 : " + super.getSkill() + ", " + skill3;
    }

    // name = "Geobukking";
    // skill = "Blizzard";
}
