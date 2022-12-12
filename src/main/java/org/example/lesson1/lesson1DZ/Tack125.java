package org.example.lesson1.lesson1DZ;

//Фраза является палиндромом, если после преобразования всех прописных букв в строчные и удаления всех
//не алфавитно-цифровых символов она читается одинаково вперед и назад. Буквенно-цифровые символы включают
//в себя буквы и цифры.
//Учитывая строку s, верните значение true, если это палиндром, или false в противном случае.
//
//Example 1:
//
//        Input: s = "A man, a plan, a canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.
//        Example 2:
//
//        Input: s = "race a car"
//        Output: false
//        Explanation: "raceacar" is not a palindrome.
//        Example 3:
//
//        Input: s = " "
//        Output: true
//        Explanation: s is an empty string "" after removing non-alphanumeric characters.
//        Since an empty string reads the same forward and backward, it is a palindrome.
public class Tack125 {
    public static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        String palindrom = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                palindrom += s.charAt(i);
            }
        }
        palindrom = palindrom.toLowerCase();
        int start = 0, end = palindrom.length() - 1;
        while (start < end) {
            if (palindrom.charAt(start) != palindrom.charAt(end)) {
                return false;
            }
            end--;
            start++;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
