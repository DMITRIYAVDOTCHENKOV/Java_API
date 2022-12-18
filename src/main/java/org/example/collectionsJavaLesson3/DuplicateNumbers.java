package org.example.collectionsJavaLesson3;

import java.util.ArrayList;
import java.util.Iterator;

public class DuplicateNumbers {
    static int duplArrayList1;
    static int duplArrayList2;

    public static void main(String[] args) {
        int num = 9;
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList1.add(9);
        arrayList1.add(2);
        arrayList1.add(4);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(3);
        arrayList1.add(4);

        arrayList2.add(9);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(4);
        arrayList2.add(3);



        for (Iterator<Integer> iterator = arrayList1.iterator(); iterator.hasNext(); ) {
            Integer array = iterator.next();
            if (array == num) {
                duplArrayList1++;
            }
        }
        System.out.println("В первом списке, число " + num + " Встерчается " + duplArrayList1 + " раз");


        for (Iterator<Integer> iterator = arrayList2.iterator(); iterator.hasNext(); ) {
            Integer array = iterator.next();
            if (array == num) {
                duplArrayList2++;
            }
        }
        System.out.println("Во втором списке, число " + num + " Встерчается " + duplArrayList2 + " раз");


        if (duplArrayList1 == duplArrayList2){
            System.out.printf("Число %d входит одинаковое кол-во раз в списки", num);
        }else {
            System.out.printf("Число %d входит разное кол-во раз в списки", num);
        }

    }

}