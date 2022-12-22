package org.example.lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task350 {
    public int[] intersect (int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.putIfAbsent(nums1[i], 0);
            map.put(nums1[i], map.get(nums1[i]) + 1);
        }

        List<Integer> inter = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                inter.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] ans = new int[inter.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = inter.get(i);
        }

        return ans;
    }
}