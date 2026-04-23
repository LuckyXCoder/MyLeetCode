package leetcode.problems.lc1790_check_if_one_string_swap_can_make_strings_equal;

class Solution_1 {

    public static void main(String[] args) {
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(areAlmostEqual(s1, s2));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int length = s1.length();
        int count = 0;
        char[] dif = new char[2];
        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (++count == 1) {
                    dif[0] = s1.charAt(i);
                    dif[1] = s2.charAt(i);
                } else if (count == 2) {
                    if (dif[1] != s1.charAt(i) || dif[0] != s2.charAt(i)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return count != 1;
    }
}