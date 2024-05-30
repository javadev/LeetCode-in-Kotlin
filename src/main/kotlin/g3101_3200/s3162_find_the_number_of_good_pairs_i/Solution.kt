package g3101_3200.s3162_find_the_number_of_good_pairs_i

// #Easy #Array #Hash_Table #2024_05_30_Time_1_ms_(99.96%)_Space_42.1_MB_(99.36%)

class Solution {
    fun numberOfPairs(nums1: IntArray, nums2: IntArray, k: Int): Int {
        var c = 0
        for (j in nums1) {
            for (value in nums2) {
                if (j % (value * k) == 0) {
                    c++
                }
            }
        }
        return c
    }
}
