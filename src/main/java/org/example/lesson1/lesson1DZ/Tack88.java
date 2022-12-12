package org.example.lesson1.lesson1DZ;
//Вам даны два массива целых чисел nums1 и nums2, отсортированные в порядке неубывания, и два целых числа m и n,
//представляющих количество элементов в nums1 и nums2 соответственно.
//Объедините nums1 и nums2 в единый массив, отсортированный в порядке неубывания.
//Окончательный отсортированный массив не должен быть возвращен функцией, а вместо этого сохранен внутри массива nums 1.
//Чтобы учесть это, nums1 имеет длину m + n, где первые m элементов обозначают элементы,
//которые должныбыть объединены, а последние n элементов имеют значение 0 и должны игнорироваться.
//nums2 имеет длину n.


//Example 1:
//
//        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//        Output: [1,2,2,3,5,6]
//        Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//        The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
//        Example 2:
//
//        Input: nums1 = [1], m = 1, nums2 = [], n = 0
//        Output: [1]
//        Explanation: The arrays we are merging are [1] and [].
//        The result of the merge is [1].
//        Example 3:
//
//        Input: nums1 = [0], m = 0, nums2 = [1], n = 1
//        Output: [1]
//        Explanation: The arrays we are merging are [] and [1].
//        The result of the merge is [1].
//        Note that because m = 0, there are no elements in nums1.
//        The 0 is only there to ensure the merge result can fit in nums1.


import java.util.Arrays;

public class Tack88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = nums1.clone(), i = 0, j = 0, index = 0;
        while (i < m || j < n) {
            if (i < m && j < n) {
                if (temp[i] < nums2[j]) {
                    nums1[index++] = temp[i++];
                } else {
                    nums1[index++] = nums2[j++];
                }
            } else if (i == m) {
                nums1[index++] = nums2[j++];
            } else {
                nums1[index++] = temp[i++];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        int temp[] = nums1.clone(), i = 0, j = 0, index = 0;
        while (i < m || j < n) {
            if (i < m && j < n) {
                if (temp[i] < nums2[j]) {
                    nums1[index++] = temp[i++];
                } else {
                    nums1[index++] = nums2[j++];
                }
            } else if (i == m) {
                nums1[index++] = nums2[j++];
            } else {
                nums1[index++] = temp[i++];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
