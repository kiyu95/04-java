package main.java.com.ohgiraffers.understand;

public class kiyu {

    private int hp;
    private int money;

    public int getHp() {
        return hp;
    }

    public void setHp(int damage) {
        this.hp += damage;
        if (this.hp > 100){
            this.hp = 100;
        }else if(this.hp < 0){
            System.out.println("119를 불러주세요");
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "kiyu{" +
                "hp=" + hp +
                ", money=" + money +
                '}';
    }
}
