package g1301_1400.s1375_number_of_times_binary_string_is_prefix_aligned

// #Medium #Array
class Solution {
    fun numTimesAllBlue(flips: IntArray): Int {
        var ans = 0
        var max = 0
        for (i in flips.indices) {
            max = Math.max(max, flips[i])
            if (max == i + 1) {
                ++ans
            }
        }
        return ans
    }
}
