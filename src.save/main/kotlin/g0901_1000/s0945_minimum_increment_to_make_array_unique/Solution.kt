package g0901_1000.s0945_minimum_increment_to_make_array_unique

// #Medium #Array #Sorting #Greedy #Counting
// #2023_04_30_Time_427_ms_(100.00%)_Space_101.5_MB_(7.14%)

class Solution {
    fun minIncrementForUnique(nums: IntArray): Int {
        var max = 0
        for (num in nums) {
            max = Math.max(max, num)
        }
        val counts = IntArray(nums.size + max)
        for (num in nums) {
            counts[num]++
        }
        var minMoves = 0
        for (i in counts.indices) {
            if (counts[i] <= 1) {
                continue
            }
            val remaining = counts[i] - 1
            minMoves += remaining
            counts[i + 1] = counts[i + 1] + remaining
        }
        return minMoves
    }
}
