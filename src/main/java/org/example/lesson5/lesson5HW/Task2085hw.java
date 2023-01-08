package org.example.lesson5.lesson5HW;
//Учитывая два строковых массива word1 и word2, верните количество строк,
//        которые появляются ровно один раз в каждом из двух массивов.

//        Example 1:
//        Input: words1 = ["leetcode","is","amazing","as","is"], words2 = ["amazing","leetcode","is"]
//        Output: 2
//        Explanation:
//        - "leetcode" appears exactly once in each of the two arrays. We count this string.
//        - "amazing" appears exactly once in each of the two arrays. We count this string.
//        - "is" appears in each of the two arrays, but there are 2 occurrences of it in words1. We do not count this string.
//        - "as" appears once in words1, but does not appear in words2. We do not count this string.
//        Thus, there are 2 strings that appear exactly once in each of the two arrays.
//        Example 2:
//
//        Input: words1 = ["b","bb","bbb"], words2 = ["a","aa","aaa"]
//        Output: 0
//        Explanation: There are no strings that appear in each of the two arrays.
//        Example 3:
//
//        Input: words1 = ["a","ab"], words2 = ["a","a","a","ab"]
//        Output: 1
//        Explanation: The only string that appears exactly once in each of the two arrays is "ab".
import java.util.HashMap;

public class Task2085hw {
    public static int countWords(String[] words1, String[] words2) {

        HashMap<String, int[]> common = new HashMap<>();
        int count = 0;

        for(int i = 0; i < words1.length; i++) {
            String word = words1[i];
            int[] counter = common.getOrDefault(word, new int[]{0, 0});
            counter[0]++;
            common.put(word, counter);
        }

        for(int i = 0; i < words2.length; i++) {
            String word = words2[i];
            int[] counter = common.getOrDefault(word, null);
            if(counter != null) {
                if(counter[0] == 1 && counter[1] == 0) {
                    count++;
                } else if(counter[0] == 1 && counter[1] == 1) {
                    count--;
                }
                counter[1]++;
            }
        }

        return count;
    }

    public static void main (String[] args) {
       String[] words1 = {"leetcode","is","amazing","as","is"};
       String[] words2 = {"amazing","leetcode","is"};

        System.out.println(countWords(words1, words2));
    }
}

