package org.example.collectionsJavaLesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sorting {

    public static void main(String args[]) {
        int temp;
        ArrayList<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(3);
        array.add(2);
        array.add(8);
        array.add(1);
        array.add(4);
        array.add(2);
        array.add(8);


        System.out.println(array);


        ArrayList<Integer> sortedArray = new ArrayList<>(array.size());
        for (int j = 0; j < array.size() - 1; j++) {
            for (int x = 0; x < array.size() - 1; x++) {

                while (array.get(x) % 2 == 1 && x < array.size() - 1) {
                    x++;
                }
                int y = x + 1;

                if (y < array.size()) {
                    while (array.get(y) % 2 == 1 && y < array.size() - 1) {
                        y++;
                    }
                    if (array.get(x) > array.get(y) && array.get(y) % 2 == 0 && array.get(x) % 2 == 0) {
                        temp = array.get(x);
                        array.set(x, array.get(y));
                        array.set(y, temp);
                        sortedArray = array;
                    }
                }
            }
        }
        System.out.println(sortedArray);
    }
}
