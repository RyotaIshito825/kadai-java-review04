package jp.co.kiramex.animal;

public class Human extends Animal implements Thinkable {

    private String hobby;

    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }
    @Override
    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");
    }

}
