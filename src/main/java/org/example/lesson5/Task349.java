package org.example.lesson5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task349 {
    public int[] intersection(int[] nums1, int[] nums2){
        if (nums1.length > nums2.length) {
            return intersection(nums2, nums1);
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        List<Integer> inter = new ArrayList<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                inter.add(num);
                set.remove(num);
            }
        }

        int[] ans = new int[inter.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = inter.get(i);
        }
        return ans;
    }
}
