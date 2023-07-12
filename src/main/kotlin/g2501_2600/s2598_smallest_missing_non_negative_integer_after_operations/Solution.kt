package g2501_2600.s2598_smallest_missing_non_negative_integer_after_operations

class Solution {
    fun findSmallestInteger(nums: IntArray, value: Int): Int {
        val n = nums.size
        if (value == 1) return n
        val a = IntArray(value)
        for (i in 0 until n) {
            var k = nums[i] % value
            if (k < 0) k = (value + k) % value
            a[k]++
        }
        val mins = mins(a)
        val min = mins[0]
        val minIndex = mins[1]
        return min * value + minIndex
    }

    private fun mins(a: IntArray): IntArray {
        val n = a.size
        var min = 100001
        var minIndex = -1
        for (i in 0 until n) {
            if (a[i] < min) {
                min = a[i]
                minIndex = i
            }
        }
        return intArrayOf(min, minIndex)
    }
}
