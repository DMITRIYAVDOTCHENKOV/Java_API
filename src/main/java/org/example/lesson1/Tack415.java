package org.example.lesson1;
//Учитывая два неотрицательных целых числа, num1 и num2, представленных в виде строки, верните сумму num1 и num2
// в виде строки.
// Вы должны решить проблему, не используя какую-либо встроенную библиотеку для обработки больших целых чисел (например,
// BigInteger).
// Вы также не должны преобразовывать входные данные непосредственно в целые числа.
//        Example 1:
//        Input: num1 = "11", num2 = "123"
//        Output: "134"

//        Example 2:
//        Input: num1 = "456", num2 = "77"
//        Output: "533"
//        Example 3:
//
//        Input: num1 = "0", num2 = "0"
//        Output: "0"
public class Tack415 {

    public String addStrings(String num1, String num2) {
        if (num1.length() < num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int j = num2.length() - 1;
        int carry = 0;
        String res = "";
        for (int i = num1.length() - 1; i >= 0; i--) {
            carry += (num2.charAt(i) - '0');

            if (j >= 0) {
            carry += (num2.charAt(j) - '0');

            }
            res = (carry % 10) + res;
            carry = carry / 10;
            j = j - 1;
        }
        if (carry == 1) {
            res = 1 + res;
        }
        return res;
    }
}
