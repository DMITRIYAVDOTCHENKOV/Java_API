package org.example.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        findPatth(1,5,1,2, "");
    }
    private static void findPatth(int src, int target, int addend,int mult, String path){
        if (src > target){
            return;
        }
        if (src == target) {
            System.out.println(path + " = " + target);
            return;
        }

        findPatth(src + addend, target, addend, mult, path + " " + src + " + " + addend);
        findPatth(src * mult, target, addend, mult, path + " " + src + " * " + mult);
    }
}
