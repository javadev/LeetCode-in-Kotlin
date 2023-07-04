package g2501_2600.s2529_maximum_count_of_positive_integer_and_negative_integer

// #Easy #Array #Binary_Search #Counting #2023_07_04_Time_215_ms_(83.33%)_Space_38.1_MB_(66.67%)

class Solution {
    fun maximumCount(nums: IntArray): Int {
        var plus = 0
        var minus = 0
        for (num in nums) {
            if (num > 0) {
                plus++
            }
            if (num < 0) {
                minus++
            }
        }
        return Math.max(plus, minus)
    }
}
