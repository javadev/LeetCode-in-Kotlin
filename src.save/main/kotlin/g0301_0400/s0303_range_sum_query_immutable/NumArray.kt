package g0301_0400.s0303_range_sum_query_immutable

// #Easy #Array #Design #Prefix_Sum #Programming_Skills_I_Day_12_Class_and_Object
// #2022_11_07_Time_472_ms_(63.64%)_Space_50.7_MB_(68.83%)

class NumArray(nums: IntArray) {
    private val sums: IntArray

    init {
        sums = IntArray(nums.size)
        for (i in nums.indices) {
            if (i == 0) {
                sums[i] = nums[i]
            } else {
                sums[i] = sums[i - 1] + nums[i]
            }
        }
    }

    fun sumRange(i: Int, j: Int): Int {
        return if (i == 0) {
            sums[j]
        } else sums[j] - sums[i - 1]
    }
}

/*
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */
