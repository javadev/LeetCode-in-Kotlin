package g3501_3600.s3599_partition_array_to_minimize_xor

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Prefix_Sum
// #2025_06_30_Time_136_ms_(100.00%)_Space_54.66_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun minXor(nums: IntArray, k: Int): Int {
        val n = nums.size
        // Step 1: Prefix XOR array
        val pfix = IntArray(n + 1)
        for (i in 1..n) {
            pfix[i] = pfix[i - 1] xor nums[i - 1]
        }
        // Step 2: DP table
        val dp: Array<IntArray> = Array(n + 1) { IntArray(k + 1) }
        for (row in dp) {
            row.fill(Int.Companion.MAX_VALUE)
        }
        for (i in 0..n) {
            // Base case: 1 partition
            dp[i][1] = pfix[i]
        }
        // Step 3: Fill DP for partitions 2 to k
        for (parts in 2..k) {
            for (end in parts..n) {
                for (split in parts - 1..<end) {
                    val segmentXOR = pfix[end] xor pfix[split]
                    val maxXOR = max(dp[split][parts - 1], segmentXOR)
                    dp[end][parts] = min(dp[end][parts], maxXOR)
                }
            }
        }
        return dp[n][k]
    }
}
