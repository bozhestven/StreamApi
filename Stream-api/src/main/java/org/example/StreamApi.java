package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StreamApi {
    public static void main(String[] args) {
        //  Task1
        List<String> Stationery = new ArrayList<>();
        Stationery.add("Органайзеры");
        Stationery.add("Карандаши");
        Stationery.add("Ручки");
        Stationery.add("Папки");
        Stationery.add("Клей");
        Stationery.add("Ножницы");
        Stationery.add("Тетради");
        Stationery.add("Ластики");
        Stationery.add("Скрепки");
        Stationery.add("Календари");
        Stationery.add("Конверты");
        Stationery.add("Степлер");
        Stationery.add("Линеры");
        Stationery.stream().filter(a -> a.startsWith("К")).forEach(a -> System.out.print(a + ' '));
        //  Task2
        List<String> bookTitle = new ArrayList<>();
        bookTitle.add("Властелин колец");
        bookTitle.add("Гарри Поттер");
        bookTitle.add("Война и мир");
        bookTitle.add("Мальчик в полосатой пижаме");
        bookTitle.add("Винни Пух");
        bookTitle.add("Скотный двор");
        bookTitle.add("Бог мелочей");
        bookTitle.add("Чародей");
        bookTitle.add("Зелёная Миля");
        bookTitle.add("Вор времени");
        bookTitle.stream().sorted().forEach(System.out::println);
        // Task3
        List<Email> emails = new ArrayList<>();
        emails.add(new Email("Yasir@email.com", "NEW"));
        emails.add(new Email("Argen@email.com", "SEND"));
        emails.add(new Email("Marsen@email.com", "NEW"));
        emails.add(new Email("Danill@email.com", "SEND"));
        emails.stream().filter(x -> x.getSendStatus().equals("NEW")).forEach(System.out::println);
        // Task4
        List<String> book = new ArrayList<>();
        bookTitle.add("Властелин колец");
        bookTitle.add("Гарри Поттер");
        bookTitle.add("Война и мир");
        bookTitle.add("Мальчик в полосатой пижаме");
        bookTitle.add("Винни Пух");
        bookTitle.add("Скотный двор");
        bookTitle.add("Бог мелочей");
        bookTitle.add("Чародей");
        bookTitle.add("Зелёная Миля");
        bookTitle.add("Вор времени");
        // Дубликаты
        book.add("Зелёная Миля");
        book.add("Чародей");
        book.add("Война и мир");
        book.add("Гарри Поттер");
        book.stream().distinct().forEach(System.out::println);
        //Task5
        List<String> names = new ArrayList<String>();
        names.add("Арген");
        names.add("Ясыр");
        names.add("Бакыт");
        names.add("Мирбек");
        System.out.println(names.stream().anyMatch(x -> x.equals("Бакыт")));
        //Task6
        List<String> strings = new ArrayList<>(Arrays.asList("строка 1", "строка 2", "строка 3", "строка 4"));
        strings.stream().map(x -> x + "; ").forEach(a -> System.out.print(a + ' '));
        //Task7
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            int number = random.nextInt(101) + 50;
            numbers.add(number);
        }
        numbers.stream().filter(x -> x > 100).forEach(System.out::println);
        //Task8
        List<Double> doubleList = Arrays.asList(1.7, 2.3, 1.19, 6.5, 7.7);
        System.out.println(doubleList.stream().mapToDouble(Double::doubleValue).average().orElse(0));
    }
}
