package ru.artamonovks;

public class Engineer extends Employer {

    private double money;

    public double getMoney() { return money; }
    public void setMoney(double money) { this.money = money; }

    public Engineer (String name, int age, double experience, double money) {
        this.setPosition("Engineer");
        this.setName(name);
        this.setAge(age);
        this.setExperience(experience);
        this.money = money;
    }

    @Override
    public String toString () {
        return this.getName() + " " + this.getAge() + " " + this.getPosition() + " " + this.getExperience() + " " + this.money;
    }
}
