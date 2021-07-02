package ru.artamonovks;

public class Employer {

    private String name;
    private int age;
    private String position;
    private double experience;

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPosition() { return position; }
    public double getExperience() { return experience; }

    public void setAge(int age) { this.age = age; }
    public void setExperience(double experience) { this.experience = experience; }
    public void setName(String name) { this.name = name; }
    public void setPosition(String position) { this.position = position; }

    @Override
    public String toString () {
        return this.name + " " + this.age + " " + this.position + " " + this.experience;
    }
}
