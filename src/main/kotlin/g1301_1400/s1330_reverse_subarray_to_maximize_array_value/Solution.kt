package g1301_1400.s1330_reverse_subarray_to_maximize_array_value

// #Hard #Array #Math #Greedy
class Solution {
    private fun getAbsoluteDifference(a: Int, b: Int): Int {
        return Math.abs(a - b)
    }

    fun maxValueAfterReverse(nums: IntArray): Int {
        val n = nums.size
        var result = 0
        for (i in 0 until n - 1) {
            result += getAbsoluteDifference(nums[i], nums[i + 1])
        }
        var minLine = Int.MIN_VALUE
        var maxLine = Int.MAX_VALUE
        for (i in 0 until n - 1) {
            minLine = Math.max(minLine, Math.min(nums[i], nums[i + 1]))
            maxLine = Math.min(maxLine, Math.max(nums[i], nums[i + 1]))
        }
        var diff = Math.max(0, (minLine - maxLine) * 2)
        for (i in 1 until n - 1) {
            diff = Math.max(
                diff,
                getAbsoluteDifference(nums[0], nums[i + 1]) -
                    getAbsoluteDifference(nums[i], nums[i + 1])
            )
        }
        for (i in 0 until n - 1) {
            diff = Math.max(
                diff,
                getAbsoluteDifference(nums[n - 1], nums[i]) -
                    getAbsoluteDifference(nums[i + 1], nums[i])
            )
        }
        return result + diff
    }
}
