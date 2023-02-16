package task1;

import java.util.*;

public class Main {
    static Set<String> set = new HashSet<>();

    public static void main(String[] args) {
        getMap(set);
        addNewProduct(set);
        getInfo(set);
    }

    private static void getMap(Set<String> sets) {
        sets.add("orange");
        sets.add("plum");
        sets.add("grape");
        sets.add("apple");
        sets.add("lemon");
    }

    private static void getInfo(Set<String> sets) {
        int num = 1;
        for (String s : sets) {
            System.out.println(num + ". " + s);
            num++;
        }
    }

    private static void addNewProduct(Set<String> sets) {
        sets.add("banana");
    }
}
