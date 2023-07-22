package g1801_1900.s1846_maximum_element_after_decreasing_and_rearranging

// #Medium #Array #Sorting #Greedy #2023_06_22_Time_412_ms_(100.00%)_Space_56.8_MB_(100.00%)

class Solution {
    fun maximumElementAfterDecrementingAndRearranging(arr: IntArray): Int {
        val count = IntArray(arr.size + 1)
        for (j in arr) {
            count[j.coerceAtMost(arr.size)]++
        }
        var ans = 1
        for (i in 1 until count.size) {
            ans = i.coerceAtMost(ans + count[i])
        }
        return ans
    }
}
