package org.example.lesson1.lesson1DZ;
//Учитывая входную строку s, измените порядок слов в обратном порядке.
//Слово определяется как последовательность символов, не содержащих пробелов.
//Слова в s будут разделены по крайней мере одним пробелом.
//Возвращает строку слов в обратном порядке, объединенную одним пробелом.
//Обратите внимание, что s может содержать начальные или конечные пробелы или несколько пробелов между двумя словами.
//Возвращаемая строка должна содержать только один пробел, разделяющий слова.
//Не включайте никаких дополнительных пробелов.


//Example 1:
//
//        Input: s = "the sky is blue"
//        Output: "blue is sky the"
//        Example 2:
//
//        Input: s = "  hello world  "
//        Output: "world hello"
//        Explanation: Your reversed string should not contain leading or trailing spaces.
//        Example 3:
//
//        Input: s = "a good   example"
//        Output: "example good a"
//        Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
public class Tack151 {
    public static String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        int j = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                j = i;
            } else if (i == 0 || s.charAt(i - 1) == ' ') {
                if (reversed.length() != 0) {
                    reversed.append(' ');
                }
                reversed.append(s.substring(i, j));
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String str1 = "  hello world  ";
        String str2 = "the sky is blue";
        String str3 = "a good   example";
        System.out.println(reverseWords(str1));
        System.out.println(reverseWords(str2));
        System.out.println(reverseWords(str3));
    }
}

