package g1601_1700.s1630_arithmetic_subarrays

// #Medium #Array #Sorting #Programming_Skills_II_Day_9
// #2023_06_17_Time_264_ms_(100.00%)_Space_39.4_MB_(90.91%)

class Solution {
    fun checkArithmeticSubarrays(nums: IntArray, l: IntArray, r: IntArray): List<Boolean> {
        val result: MutableList<Boolean> = ArrayList()
        val n = l.size
        for (i in 0 until n) {
            result.add(check(nums, l[i], r[i]))
        }
        return result
    }

    private fun check(nums: IntArray, l: Int, r: Int): Boolean {
        val n = r - l
        if (n == 0) {
            return true
        }
        var max = Int.MIN_VALUE
        var min = Int.MAX_VALUE
        for (i in l..r) {
            max = max.coerceAtLeast(nums[i])
            min = min.coerceAtMost(nums[i])
        }
        if ((max - min) % n != 0) {
            return false
        }
        val diff = (max - min) / n
        if (diff == 0) {
            return true
        }
        val checked = BooleanArray(max - min + 1)
        for (i in l..r) {
            val currentDiff = nums[i] - min
            if (checked[currentDiff] || currentDiff % diff != 0) {
                return false
            }
            checked[currentDiff] = true
        }
        return true
    }
}
