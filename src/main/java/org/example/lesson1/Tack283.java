package org.example.lesson1;

//Учитывая целочисленный массив nums, переместите все 0 в его конец, сохраняя относительный порядок ненулевых элементов.
//Обратите внимание, что вы должны сделать это на месте, не создавая копию массива.
//        Example 1:
//
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//        Example 2:
//
//        Input: nums = [0]
//        Output: [0]
public class Tack283 {
    public void moveZeroes(int[] nums) {
        int copyInd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
            nums[copyInd] = nums[i];
            copyInd += 1;
        }
    }
        while (copyInd < nums.length){
            nums[copyInd] = 0;
            copyInd += 1;
        }

}
}