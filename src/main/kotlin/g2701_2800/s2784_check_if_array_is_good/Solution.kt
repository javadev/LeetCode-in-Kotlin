package g2701_2800.s2784_check_if_array_is_good

// #Easy #Array #Hash_Table #Sorting #2023_08_09_Time_177_ms_(88.89%)_Space_36.3_MB_(93.33%)

class Solution {
    fun isGood(nums: IntArray): Boolean {
        var max = Int.MIN_VALUE
        var sum = 0
        for (i in nums) {
            if (i > max) {
                max = i
            }
            sum += i
        }
        if (max != nums.size - 1) {
            return false
        }
        val newSum = max * (max + 1) / 2 + max
        if (sum != newSum) {
            return false
        }
        var count = 0
        for (i in nums) {
            if (i == max) {
                count++
            }
        }
        return count == 2
    }
}
