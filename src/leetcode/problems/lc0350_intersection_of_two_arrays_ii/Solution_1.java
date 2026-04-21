package leetcode.problems.lc0350_intersection_of_two_arrays_ii;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution_1 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        if (l1 > l2) return intersect(nums2, nums1);
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int value : nums1) {
            hashMap.put(value, hashMap.getOrDefault(value, 0) + 1);
        }
//        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] res = new int[l1];
        int index = 0;
        for (int value : nums2) {
            if (hashMap.getOrDefault(value, 0) > 0) {
                int count = hashMap.get(value);
                hashMap.put(value, --count);
                res[index++] = value;
            }
        }
//        return arrayList.stream()
//                .mapToInt(i -> i)
//                .toArray();
        return Arrays.copyOfRange(res, 0, index);
    }
}