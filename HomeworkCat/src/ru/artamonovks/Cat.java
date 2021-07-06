package ru.artamonovks;

public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    // переменная окраса кошки
    private String color;

    // переменная количества живых кошек
    private static int count = 0;

    // съеденная еда всего
    private double eat = 0;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }

    // конструктор, который позволяет передать вес кошки при создании
    public Cat(Double weight) {
        this.weight = weight;
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }

    private boolean isAlive() {
        if (weight > minWeight & weight < maxWeight) return true;
        else return false;
    }

    public void meow()
    {
        // проверяем живая ли кошка
        if (isAlive()) {
            weight = weight - 1;
            System.out.println("Meow");

            // убираем кошку которая "замяукана"
            if (weight <= minWeight) count--;
        }
        else System.out.println("Кошка уже не живая...она уже не может мяукать");
    }

    // метод который выводит съеденную еду кошки
    public Double eaten() {return eat;}

    // метод "сходить в туалет"
    public void pee() {
        // проверяем живая ли кошка
        if (isAlive()) {
            weight = weight - (5 + Math.random());
            System.out.println("Pfff");

            // убираем кошку которая умерла после туалета
            if (weight <= minWeight) count--;
        }
        else System.out.println("Кошка уже не живая...она больше не ходит в туалет");
    }

    public void feed(Double amount)
    {
        // проверяем живая ли кошка
        if (isAlive()) {
            weight = weight + amount;

            // считаем съеденую еду всего
            eat = eat + amount;

            // убираем кошку, которая взорвалась
            if (weight >= maxWeight) count--;
        }
        else System.out.println("Кошка уже не живая...она больше не кушает");
    }

    public void drink(Double amount)
    {
        // проверяем живая ли кошка
        if (isAlive()) {
            weight = weight + amount;

            // считаем съеденую еду всего
            eat = eat + amount;

            // убираем кошку, которая взорвалась
            if (weight >= maxWeight) count--;

        }
        else System.out.println("Кошка уже не живая...она больше не пьет");
    }

    // метод возвращает количество кошек
    public int getCount() {return count; }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    // геттер и сеттер для окраса
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

