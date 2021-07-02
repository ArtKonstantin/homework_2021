package ru.artamonovks;

public class Manager extends Employer {

    private double money;

    public double getMoney() { return money; }
    public void setMoney(double money) { this.money = money; }

    public Manager (String name, int age, double experience, double money) {
        this.setPosition("Manager");
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
