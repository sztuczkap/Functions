package pl.sztuczkap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        runnable("Helo").run();

        List<String> names = new ArrayList<>();
        names.add("Michał");
        names.add("Adam");
        names.add("Zygmunt");

        Comparator<String> comparator = String::compareToIgnoreCase;
        names.sort((reverse(comparator)));
        names.forEach(System.out::println);

    }

    private static Runnable runnable(String text) {
        return () -> System.out.println(text);
    }

    private static Comparator<String> reverse(Comparator<String> comp) {
        return (x, y) -> comp.compare(y, x);
    }
}
