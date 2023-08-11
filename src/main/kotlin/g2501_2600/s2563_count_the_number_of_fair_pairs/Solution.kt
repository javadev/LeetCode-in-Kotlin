package g2501_2600.s2563_count_the_number_of_fair_pairs

// #Medium #Array #Sorting #Binary_Search #Two_Pointers
// #2023_07_08_Time_553_ms_(100.00%)_Space_58.9_MB_(100.00%)

class Solution {
    fun countFairPairs(nums: IntArray, lower: Int, upper: Int): Long {
        nums.sort()
        return smaller(nums, upper) - smaller(nums, lower - 1)
    }

    private fun smaller(nums: IntArray, value: Int): Long {
        var l = 0
        var r = nums.size - 1
        var result: Long = 0
        while (l < r) {
            val sum = nums[l] + nums[r]
            if (sum <= value) {
                result += (r - l).toLong()
                l++
            } else {
                r--
            }
        }
        return result
    }
}
