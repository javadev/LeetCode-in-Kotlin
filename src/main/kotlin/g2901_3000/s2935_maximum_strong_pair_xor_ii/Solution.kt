package g2901_3000.s2935_maximum_strong_pair_xor_ii

// #Hard #Array #Hash_Table #Bit_Manipulation #Sliding_Window #Trie
// #2024_01_03_Time_748_ms_(84.38%)_Space_63.6_MB_(59.38%)

import java.util.BitSet

class Solution {
    private val map = IntArray(1 shl 20)

    fun maximumStrongPairXor(nums: IntArray): Int {
        nums.sort()
        val n = nums.size
        val max = nums[n - 1]
        var ans = 0
        var mask: Int
        var masks = 0
        var highBit = 20
        while (--highBit >= 0) {
            if (((max shr highBit) and 1) == 1) {
                break
            }
        }
        val m = 1 shl highBit + 1
        var seen = BitSet(m)
        for (i in highBit downTo 0) {
            mask = 1 shl i
            masks = masks or mask
            if (check(nums, masks, ans or mask, seen)) {
                ans = ans or mask
            }
            seen = BitSet(m)
        }
        return ans
    }

    private fun check(nums: IntArray, masks: Int, ans: Int, seen: BitSet): Boolean {
        for (x in nums) {
            val mask = x and masks
            if (seen[mask xor ans] && x <= 2 * map[mask xor ans]) {
                return true
            }
            seen.set(mask)
            map[mask] = x
        }
        return false
    }
}
