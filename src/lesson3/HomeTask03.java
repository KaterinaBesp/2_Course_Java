package lesson3;

import java.util.HashMap;
import java.util.Map;

public class HomeTask03 {
    public static void main(String[] args) {
        String[] words = {"warlock", "bless", "poison", "bless", "curse", "warlock", "darkness", "light", "sky", "light"};

        // Задание 1. Считаем, сколько раз встречается каждое слово.
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);

        // Выводим уникальные слова (Дубликаты не считаем).
        System.out.println(map.keySet());

        // Задание 2. Телефонный справочник.
        System.out.println();
        PhoneBook pb = new PhoneBook();

        pb.add("Alexeev", "+79858898296");
        pb.add("Bespalov", "+79258896589");
        pb.add("Cigankov", "+79122392564");
        pb.add("Yakovlev", "+79122392222");
        pb.add("Dorohov", "+76546579813");
        pb.add("Pirogov", "+7905346666");
        pb.add("Yakovlev", "+79287613474");

        String lastName = "Yakovlev";
        System.out.println(pb.get(lastName));
    }
}
