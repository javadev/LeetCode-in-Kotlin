package g1401_1500.s1470_shuffle_the_array

// #Easy #Array #2023_06_13_Time_220_ms_(41.96%)_Space_37.6_MB_(82.52%)

class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val result = IntArray(nums.size)
        var i = 0
        var j = 0
        while (i < n && j < 2 * n) {
            result[j] = nums[i]
            result[++j] = nums[i + n]
            i++
            j++
        }
        return result
    }
}
