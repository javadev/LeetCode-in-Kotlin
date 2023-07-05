package g2401_2500.s2406_divide_intervals_into_minimum_number_of_groups

// #Medium #Array #Sorting #Greedy #Two_Pointers #Heap_Priority_Queue #Prefix_Sum
// #2023_07_03_Time_772_ms_(100.00%)_Space_80.4_MB_(100.00%)

class Solution {
    fun minGroups(intervals: Array<IntArray>): Int {
        var maxElement = 0
        for (i in intervals) {
            maxElement = maxElement.coerceAtLeast(i[0])
            maxElement = maxElement.coerceAtLeast(i[1])
        }
        val prefixSum = LongArray(maxElement + 2)
        for (i in intervals) {
            prefixSum[i[0]] = prefixSum[i[0]] + 1
            prefixSum[i[1] + 1] = prefixSum[i[1] + 1] - 1
        }
        var ans: Long = 0
        for (i in 1..maxElement + 1) {
            prefixSum[i] += prefixSum[i - 1]
            ans = ans.coerceAtLeast(prefixSum[i])
        }
        return ans.toInt()
    }
}
