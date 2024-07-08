package org.example;

import java.util.HashSet;
import java.util.Set;

public class Harsha {

    public static void uniqueNumbers(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr)
            set.add(num);
        set.forEach(System.out::println);

    }

    public static void main(String[] args) {
        int[] array = {1, 6, 10, 6, 7, 8, 9, 1, 7};
        uniqueNumbers(array);


    }
}
