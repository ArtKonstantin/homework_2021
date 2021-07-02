package ru.artamonovks;

public class Main {
    public static void main(String[] args) {

        Director director = new Director("Иванов Иван Иванович", 45, 15.7, 250000.5);
        System.out.println(director.toString());

        Engineer engineer = new Engineer("Петров Петр Петрович", 32, 8.1, 150000);
        System.out.println(engineer.toString());

        Manager manager = new Manager("Сидоров Сидор Сидорович", 28, 5.9, 100000.9);
        System.out.println(manager.toString());
    }
}
