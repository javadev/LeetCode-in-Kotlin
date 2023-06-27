package g0701_0800.s0769_max_chunks_to_make_sorted

// #Medium #Array #Sorting #Greedy #Stack #Monotonic_Stack
// #2023_03_09_Time_136_ms_(90.00%)_Space_33.8_MB_(10.00%)

class Solution {
    fun maxChunksToSorted(arr: IntArray): Int {
        var ans = 0
        var max = 0
        for (i in arr.indices) {
            max = max.coerceAtLeast(arr[i])
            if (max == i) {
                ans++
            }
        }
        return ans
    }
}
