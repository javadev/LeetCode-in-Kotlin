package g1701_1800.s1790_check_if_one_string_swap_can_make_strings_equal

// #Easy #String #Hash_Table #Counting #Programming_Skills_I_Day_4_Loop
class Solution {
    fun areAlmostEqual(s1: String, s2: String): Boolean {
        var i1 = -1
        var i2 = -1
        // We go though the two strings
        for (i in 0 until s1.length) {
            // check if each char is the same.
            if (s1[i] == s2[i]) {
                continue
            }
            // When there are more than 2 char different., we return false;
            if (i2 != -1) {
                return false
            }
            // If there is char that is different, we record the index.
            if (i1 == -1) {
                i1 = i
            } else {
                // If there is char that is different, we record the index.
                i2 = i
            }
        }
        // When three is no different char, we return true;
        if (i1 == i2) {
            return true
        }
        // When there is 1 char different, we return false;
        return if (i2 == -1) {
            false
        } else s1[i1] == s2[i2] && s1[i2] == s2[i1]
        // When there are 2 char different, and swap them can make two string equal, we return true;
    }
}
