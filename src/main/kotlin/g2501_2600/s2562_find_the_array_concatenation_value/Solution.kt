package g2501_2600.s2562_find_the_array_concatenation_value

// #Easy #Array #Two_Pointers #Simulation #2023_07_07_Time_175_ms_(100.00%)_Space_37_MB_(33.33%)

class Solution {
    fun findTheArrayConcVal(nums: IntArray): Long {
        val n = nums.size
        var result = 0L
        for (i in 0..(n - 1) / 2) {
            result += if (i < n - 1 - i) {
                val concat = "" + nums[i] + nums[n - 1 - i]
                concat.toLong()
            } else {
                nums[i].toLong()
            }
        }
        return result
    }
}
