package g0501_0600.s0581_shortest_unsorted_continuous_subarray

// #Medium #Array #Sorting #Greedy #Two_Pointers #Stack #Monotonic_Stack
// #2023_01_30_Time_246_ms_(100.00%)_Space_39.4_MB_(50.00%)

class Solution {
    fun findUnsortedSubarray(nums: IntArray): Int {
        var end = -2
        var max = Int.MIN_VALUE
        for (i in nums.indices) {
            max = Math.max(max, nums[i])
            if (nums[i] < max) {
                end = i
            }
        }
        var start = -1
        var min = Int.MAX_VALUE
        for (i in nums.indices.reversed()) {
            min = Math.min(min, nums[i])
            if (nums[i] > min) {
                start = i
            }
        }
        return end - start + 1
    }
}
