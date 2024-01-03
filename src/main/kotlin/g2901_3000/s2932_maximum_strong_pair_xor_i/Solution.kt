package g2901_3000.s2932_maximum_strong_pair_xor_i

// #Easy #Array #Hash_Table #Bit_Manipulation #Sliding_Window #Trie
// #2024_01_03_Time_192_ms_(43.08%)_Space_36.5_MB_(90.77%)

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maximumStrongPairXor(nums: IntArray): Int {
        var max = 0
        var pair: Int
        for (i in nums.indices) {
            for (j in i until nums.size) {
                if (abs((nums[i] - nums[j])) <= min(nums[i], nums[j])) {
                    pair = nums[i] xor nums[j]
                    max = max(max, pair)
                }
            }
        }
        return max
    }
}
