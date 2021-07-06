package ru.artamonovks;

public class Loader
{
    public static void main(String[] args)
    {
        System.out.println("Cat");
        Cat cat = new Cat();
        System.out.println(cat.getStatus());
        System.out.println();

        // проверка количества живых кошек
        System.out.println("Живых кошек: " + cat.getCount());
        System.out.println();

        // кормим Cat1 и выводим вес после кормления
        System.out.println("Cat1");
        Cat cat1 = new Cat();
        System.out.println("Вес до: " + cat1.getWeight());
        cat1.feed(1 + Math.random());
        System.out.println("Cat1 скушал еды: " + cat1.eaten());
        System.out.println("Вес после: " + cat1.getWeight());
        System.out.println();

        // кормим Cat2 и выводим вес после кормления
        System.out.println("Cat2");
        Cat cat2 = new Cat();
        System.out.println("Вес до: " + cat2.getWeight());
        cat2.feed(1 + Math.random());
        System.out.println("Cat2 скушал еды: " + cat2.eaten());
        System.out.println("Вес после: " + cat2.getWeight());
        System.out.println();

        // "замяукиваем" Cat3 и выводим вес после Dead
        System.out.println("Cat3");
        Cat cat3 = new Cat();
        System.out.println("Вес до: " + cat3.getWeight());
        while (cat3.getStatus() != "Dead") cat3.meow();
        System.out.println("Вес после: " + cat3.getWeight());
        System.out.println();

        // перекармливаем Cat4 и выводим вес после Exploded
        System.out.println("Cat4");
        Cat cat4 = new Cat();
        System.out.println("Вес до: " + cat4.getWeight());
        while (cat4.getStatus() != "Exploded") cat4.feed(1 + Math.random());
        System.out.println("Cat4 успел скушать еды до взрыва: " + cat4.eaten());
        System.out.println("Вес после: " + cat4.getWeight());
        System.out.println();

        // тестируем метод pee() и метод возврата количества съеденной еды
        System.out.println("Cat5");
        Cat cat5 = new Cat();
        System.out.println("Вес до: " + cat5.getWeight());
        cat5.feed(150.0);
        cat5.pee();
        cat5.pee();
        cat5.pee();
        System.out.println("Cat5 скушал еды: " + cat5.eaten());
        System.out.println("Вес после: " + cat5.getWeight());
        System.out.println();

        // создание кошки чреез второй конструктор с заданным весом
        System.out.println("Cat6");
        Cat cat6 = new Cat(7000.5);
        System.out.println(cat6.getWeight());
        System.out.println();

        // создание котенка
        System.out.println("Kitten");
        Cat kitten = getKitten();
        System.out.println(kitten.getWeight());
        System.out.println();

        System.out.println("Cat7");
        Cat cat7 = new Cat();
        System.out.println(cat7.getWeight());
        System.out.println();

        // проверка количества живых кошек
        System.out.println("Живых кошек: " + cat7.getCount());
        System.out.println();

        // проверка неживой кошки
        System.out.println(cat3.getStatus());
        cat3.feed(1.0);
        cat3.meow();
        cat3.pee();
        cat3.drink(1.0);
        System.out.println();

        // проверка живой кошки
        System.out.println(cat1.getStatus());
        cat1.feed(1.0);
        cat1.meow();
        cat1.pee();
        cat1.drink(1.0);

    }

    // метод генерации котенка
    private static Cat getKitten() {
        return new Cat (1100.0);
    }

}