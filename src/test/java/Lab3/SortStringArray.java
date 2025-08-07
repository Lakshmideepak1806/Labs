package Lab3;


import java.util.Arrays;

public class SortStringArray {
    public static void main(String[] args) {
        String[] products = {"BAT", "BOT", "A", "a"};

        System.out.println("Original Product Names:");
        for (String a : products) {
            System.out.println(a);
        }
        Arrays.sort(products);

        System.out.println("Sorted Product Names:");
        for (String pro : products) {
            System.out.println(pro);
        }
    }
}
