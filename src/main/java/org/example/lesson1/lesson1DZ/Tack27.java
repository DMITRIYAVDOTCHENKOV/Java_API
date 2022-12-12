package org.example.lesson1.lesson1DZ;

import java.util.Arrays;

//Учитывая целочисленный массив nums и целое значение val, удалите все вхождения val в nums на месте.
// Относительный порядок элементов может быть изменен.
//        Поскольку в некоторых языках невозможно изменить длину массива, вместо этого вы должны поместить результат
//        в первую часть массива nums. Более формально, если после удаления дубликатов осталось k элементов,
//        то первые k элементов nums должны содержать конечный результат. Не имеет значения, что вы оставляете за
//        пределами первых k элементов.
//        Верните k после размещения конечного результата в первых k слотах nums.
//        Не выделяйте дополнительное пространство для другого массива. Вы должны сделать это, изменив входной массив
//        на месте с помощью O (1) дополнительной памяти.
//
//        Судья по обычаю:
//        Судья протестирует ваше решение с помощью следующего кода:
//        int[] nums = [...]; // Input array
//        int val = ...; // Value to remove
//        int[] expectedNums = [...]; // The expected answer with correct length.
//        // It is sorted with no values equaling val.
//
//        int k = removeElement(nums, val); // Calls your implementation
//
//        assert k == expectedNums.length;
//        sort(nums, 0, k); // Sort the first k elements of nums
//        for (int i = 0; i < actualLength; i++) {
//        assert nums[i] == expectedNums[i];
//        }
//        Example 1:
//        Input: nums = [3,2,2,3], val = 3
//        Output: 2, nums = [2,2,_,_]
//        Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//        It does not matter what you leave beyond the returned k (hence they are underscores).
//        Example 2:
//        Input: nums = [0,1,2,2,3,0,4,2], val = 2
//        Output: 5, nums = [0,1,4,0,3,_,_,_]
//        Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
//        Note that the five elements can be returned in any order.
//        It does not matter what you leave beyond the returned k (hence they are underscores).
public class Tack27 {
    public static int removeElement(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(Arrays.toString(nums));
        System.out.println(removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }
}
