package g1001_1100.s1031_maximum_sum_of_two_non_overlapping_subarrays

// #Medium #Array #Dynamic_Programming #Sliding_Window
// #2023_05_24_Time_172_ms_(100.00%)_Space_36.7_MB_(100.00%)

class Solution {
    fun maxSumTwoNoOverlap(nums: IntArray, firstLen: Int, secondLen: Int): Int {
        val firstLenSum = getFirstLenSums(nums, firstLen)
        return getMaxLenSum(nums, secondLen, firstLenSum)
    }

    private fun getMaxLenSum(nums: IntArray, secondLen: Int, firstLenSum: Array<IntArray>): Int {
        var maxSum = 0
        var currentSum = 0
        var onRight: Int
        for (i in 0 until secondLen) {
            currentSum += nums[i]
        }
        onRight = firstLenSum[1][secondLen]
        maxSum = maxSum.coerceAtLeast(currentSum + onRight)
        var i = 1
        var j = secondLen
        while (j < nums.size) {
            currentSum = currentSum - nums[i - 1] + nums[j]
            onRight = if (j < nums.size - 1) firstLenSum[1][j + 1] else 0
            maxSum = maxSum.coerceAtLeast(currentSum + firstLenSum[0][i - 1].coerceAtLeast(onRight))
            i++
            j++
        }
        return maxSum
    }

    private fun getFirstLenSums(nums: IntArray, windowSize: Int): Array<IntArray> {
        // sum[0] - maximum from left to right, sum[1] - max from right to left.
        val sum = Array(2) { IntArray(nums.size) }
        var currentLeftSum = 0
        var currentRightSum = 0
        run {
            var i = 0
            var j = nums.size - 1
            while (i < windowSize) {
                currentLeftSum += nums[i]
                currentRightSum += nums[j]
                i++
                j--
            }
        }
        sum[0][windowSize - 1] = currentLeftSum
        sum[1][nums.size - windowSize] = currentRightSum
        var i = windowSize
        var j = nums.size - windowSize - 1
        while (i < nums.size) {
            currentLeftSum = currentLeftSum - nums[i - windowSize] + nums[i]
            currentRightSum = currentRightSum - nums[j + windowSize] + nums[j]
            sum[0][i] = sum[0][i - 1].coerceAtLeast(currentLeftSum)
            sum[1][j] = sum[1][j + 1].coerceAtLeast(currentRightSum)
            i++
            j--
        }
        return sum
    }
}
