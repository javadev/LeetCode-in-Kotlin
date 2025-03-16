package g3401_3500.s3487_maximum_unique_subarray_sum_after_deletion

// #Easy #2025_03_16_Time_4_ms_(100.00%)_Space_43.27_MB_(100.00%)

class Solution {
    fun maxSum(nums: IntArray): Int {
        var sum = 0
        val st = mutableSetOf<Int>()
        var mxNeg = Int.MIN_VALUE
        for (num in nums) {
            if (num > 0) {
                st.add(num)
            } else {
                mxNeg = maxOf(mxNeg, num)
            }
        }
        for (value in st) {
            sum += value
        }
        return if (st.isNotEmpty()) sum else mxNeg
    }
}
