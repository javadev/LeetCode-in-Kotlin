package g1501_1600.s1588_sum_of_all_odd_length_subarrays

// #Easy #Array #Math #Prefix_Sum #Programming_Skills_I_Day_6_Array
// #2023_06_14_Time_157_ms_(64.00%)_Space_33.9_MB_(96.15%)

class Solution {
    fun sumOddLengthSubarrays(arr: IntArray): Int {
        val len = arr.size
        var sum = 0
        for (i in 0..len - 1) {
            sum = sum + ((i + 1) * (len - i) + 1) / 2 * arr[i]
        }
        return sum
    }
}
