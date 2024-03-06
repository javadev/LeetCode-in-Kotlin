package g3001_3100.s3040_maximum_number_of_operations_with_the_same_score_ii

// #Medium #Array #Dynamic_Programming #Memoization
// #2024_03_06_Time_179_ms_(100.00%)_Space_38.4_MB_(100.00%)

import java.util.Objects
import kotlin.math.max

class Solution {
    private lateinit var nums: IntArray

    private var maxOps = 1

    private val dp: MutableMap<Pos, Int> = HashMap()

    private class Pos(var start: Int, var end: Int, var sum: Int) {
        override fun equals(other: Any?): Boolean {
            if (other == null) {
                return false
            }
            if (other !is Pos) {
                return false
            }
            return start == other.start && end == other.end && sum == other.sum
        }

        override fun hashCode(): Int {
            return Objects.hash(start, end, sum)
        }
    }

    fun maxOperations(nums: IntArray): Int {
        this.nums = nums
        val length = nums.size

        maxOperations(2, length - 1, nums[0] + nums[1], 1)
        maxOperations(0, length - 3, nums[length - 2] + nums[length - 1], 1)
        maxOperations(1, length - 2, nums[0] + nums[length - 1], 1)

        return maxOps
    }

    private fun maxOperations(start: Int, end: Int, sum: Int, nOps: Int) {
        if (start >= end) {
            return
        }

        if ((((end - start) / 2) + nOps) < maxOps) {
            return
        }

        val pos = Pos(start, end, sum)
        val posNops = dp[pos]
        if (posNops != null && posNops >= nOps) {
            return
        }
        dp[pos] = nOps
        if (nums[start] + nums[start + 1] == sum) {
            maxOps = max(maxOps, (nOps + 1))
            maxOperations(start + 2, end, sum, nOps + 1)
        }
        if (nums[end - 1] + nums[end] == sum) {
            maxOps = max(maxOps, (nOps + 1))
            maxOperations(start, end - 2, sum, nOps + 1)
        }
        if (nums[start] + nums[end] == sum) {
            maxOps = max(maxOps, (nOps + 1))
            maxOperations(start + 1, end - 1, sum, nOps + 1)
        }
    }
}
