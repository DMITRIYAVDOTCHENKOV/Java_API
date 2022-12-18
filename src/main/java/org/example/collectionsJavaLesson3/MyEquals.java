package org.example.collectionsJavaLesson3;

import java.util.ArrayList;

public class MyEquals {
    public static void main(String[] args) {
//
//        System.out.println(arrayList1.equals(arrayList2));
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList1.add(9);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(3);
        arrayList2.add(9);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(4);
        arrayList2.add(3);


        boolean result = equales(arrayList1, arrayList2);
            if (result) {
                System.out.println("Списки одинаковы");
            }else {
                System.out.println("Списки разные");
            }
        }

    private static boolean equales(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
        if (arrayList1 == arrayList2){
            return true;
        }

        if (arrayList1 == null || arrayList2 == null){
            return false;
        }

        if (arrayList1.size() != arrayList2.size()){
            return false;
        }

        for (int i = 0; i < arrayList1.size() ; i++) {
            if (arrayList1.get(i) != arrayList2.get(i)){
                return false;
            }
        }
        return true;
    }
}