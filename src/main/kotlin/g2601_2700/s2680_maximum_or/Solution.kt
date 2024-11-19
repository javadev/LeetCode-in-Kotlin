package g2601_2700.s2680_maximum_or

// #Medium #Array #Greedy #Bit_Manipulation #Prefix_Sum
// #2023_07_27_Time_592_ms_(90.91%)_Space_63.2_MB_(72.73%)

class Solution {
    fun maximumOr(nums: IntArray, k: Int): Long {
        val suffix = IntArray(nums.size).apply {
            for (i in nums.lastIndex - 1 downTo 0)
                this[i] = this[i + 1] or nums[i + 1]
        }
        var prefix = 0L
        var max = 0L
        for (i in 0..nums.lastIndex) {
            val num = nums[i].toLong()
            max = maxOf(
                max,
                prefix or (num shl k) or suffix[i].toLong(),
            )
            prefix = prefix or num
        }
        return max
    }
}
