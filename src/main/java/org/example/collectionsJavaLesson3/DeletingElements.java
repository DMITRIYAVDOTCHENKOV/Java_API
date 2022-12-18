package org.example.collectionsJavaLesson3;

import java.util.ArrayList;

public class DeletingElements {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(6);
        arrayList1.add(8);
        arrayList1.add(44);
        arrayList1.add(75);
        arrayList1.add(99);

        System.out.println(arrayList1);

        for (int i = 0; i < arrayList1.size(); i++) {
            if (arrayList1.get(i) % 2 == 0){
                arrayList1.remove(i);
                i--;
            }
        }
            System.out.println(arrayList1);

//        for (Iterator<Integer> iterator = arrayList1.iterator(); iterator.hasNext(); ) {
//            Integer array = iterator.next();
//            if (array % 2 == 0) {
//                iterator.remove();
//            }
//        }
//        System.out.println(arrayList1);
//    }
    }
}