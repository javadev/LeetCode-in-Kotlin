package g3501_3600.s3587_minimum_adjacent_swaps_to_alternate_parity

// #Medium #Array #Greedy #2025_06_23_Time_38_ms_(100.00%)_Space_79.58_MB_(100.00%)

import kotlin.math.abs
import kotlin.math.min

class Solution {
    fun minSwaps(nums: IntArray): Int {
        val evenIndices: MutableList<Int> = ArrayList<Int>()
        val oddIndices: MutableList<Int> = ArrayList<Int>()
        for (i in nums.indices) {
            if (nums[i] % 2 == 0) {
                evenIndices.add(i)
            } else {
                oddIndices.add(i)
            }
        }
        val evenCount = evenIndices.size
        val oddCount = oddIndices.size
        if (abs(evenCount - oddCount) > 1) {
            return -1
        }
        var ans = Int.Companion.MAX_VALUE
        if (evenCount >= oddCount) {
            ans = min(ans, helper(evenIndices))
        }
        if (oddCount >= evenCount) {
            ans = min(ans, helper(oddIndices))
        }
        return ans
    }

    private fun helper(indices: MutableList<Int>): Int {
        var swaps = 0
        for (i in indices.indices) {
            swaps += abs(indices[i] - 2 * i)
        }
        return swaps
    }
}
