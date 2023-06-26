package g2101_2200.s2195_append_k_integers_with_minimal_sum

// #Medium #Array #Math #Sorting #Greedy #2023_06_26_Time_542_ms_(100.00%)_Space_60.5_MB_(100.00%)

class Solution {
    fun minimalKSum(nums: IntArray, k: Int): Long {
        nums.sort()
        var sum: Long = 0
        var n = 0
        for (i in nums.indices) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                if (nums[i] - n > k) {
                    break
                }
                sum += nums[i].toLong()
                n++
            }
        }
        val t = n + k.toLong()
        return (1 + t) * t / 2 - sum
    }
}
