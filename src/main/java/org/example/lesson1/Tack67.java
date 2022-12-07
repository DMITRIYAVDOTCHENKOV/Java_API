package org.example.lesson1;
//Example 1:
//        Input: a = "11", b = "1"
//        Output: "100"
//        Example 2:

//        Input: a = "1010", b = "1011"
//        Output: "10101"
//
//        Constraints:
//        1 <= a.length, b.length <= 104
//        a and b consist only of '0' or '1' characters.
//        Each string does not contain leading zeros except for the zero itself.
public class Tack67 {
    public String addBinary(String a, String b) {
        if (a.length() < b.length()){
            String temp = a;
            a = b;
            b = temp;
        }
        int j = b.length() - 1;
        int carry = 0;
        String res = "";
        for (int i = a.length() - 1; i >= 0 ; i--) {
            if (a.charAt(i) == '1'){
                carry += 1;
            }
            if (j >= 0 && b.charAt(j) == '1'){
                carry += 1;
            }
            res = (carry % 2) + res;
            carry = carry / 2;
            j = j -1;
        }
        if (carry == 1){
            res = 1 + res;
        }
        return res;
    }

}
