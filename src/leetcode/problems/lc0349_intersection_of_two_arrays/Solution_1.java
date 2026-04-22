package leetcode.problems.lc0349_intersection_of_two_arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution_1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return intersection(nums2, nums1);
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums1) {
            hashSet.add(num);
        }
        int[] res = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            if (hashSet.contains(num)) {
                res[index++] = num;
                hashSet.remove(num);
            }
        }
        return Arrays.copyOfRange(res, 0, index);
    }
}