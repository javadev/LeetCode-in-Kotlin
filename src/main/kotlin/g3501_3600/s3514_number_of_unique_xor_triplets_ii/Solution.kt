package g3501_3600.s3514_number_of_unique_xor_triplets_ii

// #Medium #2025_04_13_Time_778_ms_(100.00%)_Space_61.80_MB_(100.00%)

import java.util.BitSet

class Solution {
    fun uniqueXorTriplets(nums: IntArray): Int {
        val pairs: MutableSet<Int> = HashSet<Int>(mutableListOf<Int>(0))
        var i = 0
        val n = nums.size
        while (i < n) {
            for (j in i + 1..<n) {
                pairs.add(nums[i] xor nums[j])
            }
            ++i
        }
        val triplets = BitSet()
        for (xy in pairs) {
            for (z in nums) {
                triplets.set(xy xor z)
            }
        }
        return triplets.cardinality()
    }
}
