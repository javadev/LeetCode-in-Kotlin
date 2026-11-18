package g3901_4000.s3994_minimum_adjacent_swaps_to_partition_array

// #Medium #Array #Greedy #Staff #Biweekly_Contest_187
// #2026_11_17_Time_6_ms_(80.28%)_Space_101.87_MB_(61.97%)

class Solution {
    fun minAdjacentSwaps(nums: IntArray, a: Int, b: Int): Int {
        var ans: Long = 0
        var c1: Long = 0
        var c2: Long = 0
        for (v in nums) {
            if (v < a) {
                ans += c1 + c2
            } else if (v <= b) {
                c1++
                ans += c2
            } else {
                c2++
            }
        }
        return (ans % 1000000007).toInt()
    }
}
