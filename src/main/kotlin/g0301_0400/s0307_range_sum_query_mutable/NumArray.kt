package g0301_0400.s0307_range_sum_query_mutable

// #Medium #Array #Design #Segment_Tree #Binary_Indexed_Tree
// #2022_11_09_Time_1729_ms_(78.79%)_Space_129.2_MB_(69.70%)

class NumArray(private val nums: IntArray) {
    private var sum = 0

    init {
        for (num in nums) {
            sum += num
        }
    }

    fun update(index: Int, `val`: Int) {
        sum -= nums[index] - `val`
        nums[index] = `val`
    }

    fun sumRange(left: Int, right: Int): Int {
        var sumRange = 0
        if (right - left < nums.size / 2) {
            // Array to sum is less than half
            for (i in left..right) {
                sumRange += nums[i]
            }
        } else {
            // Array to sum is more than half
            // Better to take total sum and substract the numbers not in range
            sumRange = sum
            for (i in 0 until left) {
                sumRange -= nums[i]
            }
            for (i in right + 1 until nums.size) {
                sumRange -= nums[i]
            }
        }
        return sumRange
    }
}

/*
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * obj.update(index,`val`)
 * var param_2 = obj.sumRange(left,right)
 */
