package org.example.collectionsJavaLesson3;

import java.util.ArrayList;
import java.util.LinkedList;

// Замерить добавления 10000 эдементов в начало ArrayList и  LinkedList
public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);

        System.out.println("Время выполнения ArrayList: " + duration);


        long startTime1 = System.currentTimeMillis();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        long endTime1 = System.currentTimeMillis();
        long duration1 = (endTime1 - startTime1);

        System.out.println("Время выполнения LinkedList: " + duration1);
    }
}

