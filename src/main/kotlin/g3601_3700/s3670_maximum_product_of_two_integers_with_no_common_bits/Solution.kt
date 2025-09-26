package g3601_3700.s3670_maximum_product_of_two_integers_with_no_common_bits

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Weekly_Contest_465
// #2025_09_07_Time_113_ms_(88.89%)_Space_78.00_MB_(100.00%)

class Solution {
    fun maxProduct(nums: IntArray): Long {
        // Find highest value to limit DP size
        var maxVal = 0
        for (v in nums) {
            if (v > maxVal) {
                maxVal = v
            }
        }
        // If all numbers are >=1, maxVal > 0; compute needed bit-width
        // in [1..20]
        val maxBits = 32 - Integer.numberOfLeadingZeros(maxVal)
        val size = 1 shl maxBits
        // ---- store input midway, as required ----
        // dp[mask] = largest number present whose bitmask == mask (later becomes: max over all
        // submasks)
        val dp = IntArray(size)
        for (x in nums) {
            // numbers themselves are their masks
            if (dp[x] < x) {
                dp[x] = x
            }
        }
        // SOS DP: for each bit b, propagate lower-half block maxima to upper-half block
        // (branch-light)
        for (b in 0..<maxBits) {
            val half = 1 shl b
            val step = half shl 1
            var base = 0
            while (base < size) {
                val upper = base + half
                for (m in 0..<half) {
                    val u = upper + m
                    val l = base + m
                    if (dp[u] < dp[l]) {
                        dp[u] = dp[l]
                    }
                }
                base += step
            }
        }
        // Now dp[mask] = max value among all submasks of 'mask'
        var ans: Long = 0
        val full = size - 1
        for (x in nums) {
            // masks with no bits in common with x
            val complement = (x.inv()) and full
            // best partner disjoint with x
            val y = dp[complement]
            if (y > 0) {
                val prod = x.toLong() * y
                if (prod > ans) {
                    ans = prod
                }
            }
        }
        // 0 if no valid pair
        return ans
    }
}
