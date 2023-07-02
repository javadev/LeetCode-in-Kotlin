package g2201_2300.s2275_largest_combination_with_bitwise_and_greater_than_zero

// #Medium #Array #Hash_Table #Bit_Manipulation #Counting
// #2023_06_28_Time_426_ms_(100.00%)_Space_54.7_MB_(100.00%)

class Solution {
    fun largestCombination(candidates: IntArray): Int {
        val bits = IntArray(32)
        for (x in candidates) {
            var i = 0
            var localX = x
            while (localX != 0) {
                bits[i] += localX and 1
                i++
                localX = localX shr 1
            }
        }
        var ans = 0
        for (b in bits) {
            ans = Math.max(ans, b)
        }
        return ans
    }
}
