package g3001_3100.s3026_maximum_good_subarray_sum

// #Medium #Array #Hash_Table #Prefix_Sum #2024_03_03_Time_756_ms_(71.43%)_Space_69.1_MB_(48.57%)

import kotlin.math.max

class Solution {
    fun maximumSubarraySum(input: IntArray, targetDifference: Int): Long {
        val valueToMinPrefixSum: MutableMap<Int, Long> = HashMap()
        var prefixSum: Long = 0
        var maxSubarraySum = Long.MIN_VALUE
        for (value in input) {
            if (valueToMinPrefixSum.containsKey(value + targetDifference)) {
                maxSubarraySum = max(
                    maxSubarraySum,
                    (
                        prefixSum +
                            value -
                            valueToMinPrefixSum[value + targetDifference]!!
                        )
                )
            }
            if (valueToMinPrefixSum.containsKey(value - targetDifference)) {
                maxSubarraySum = max(
                    maxSubarraySum,
                    (
                        prefixSum +
                            value -
                            valueToMinPrefixSum[value - targetDifference]!!
                        )
                )
            }
            if (!valueToMinPrefixSum.containsKey(value) ||
                valueToMinPrefixSum[value]!! > prefixSum
            ) {
                valueToMinPrefixSum[value] = prefixSum
            }
            prefixSum += value.toLong()
        }
        return if (maxSubarraySum != Long.MIN_VALUE) maxSubarraySum else NO_GOOD_SUBARRAYS.toLong()
    }

    companion object {
        private const val NO_GOOD_SUBARRAYS = 0
    }
}
