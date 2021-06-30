package ru.artamonovks;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        String [] answers = {"Бесспорно", "Предрешено", "Никаких сомнений", "Определённо да", "Можешь быть уверен в этом",
                "Мне кажется — «да»", "Вероятнее всего", "Хорошие перспективы", "Знаки говорят — «да»", "Да",
                "Пока не ясно, попробуй снова", "Спроси позже", "Лучше не рассказывать", "Сейчас нельзя предсказать",
                "Сконцентрируйся и спроси опять", "Даже не думай", "Мой ответ — «нет»", "По моим данным — «нет»",
                "Перспективы не очень хорошие", "Весьма сомнительно"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("О чем ты хочешь спросить?");

        String question = scanner.nextLine();
        Random random = new Random();
        int answer = random.nextInt(answers.length);
        System.out.println(answers[answer]);
    }
}
