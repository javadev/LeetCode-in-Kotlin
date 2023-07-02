package g1501_1600.s1524_number_of_sub_arrays_with_odd_sum

// #Medium #Array #Dynamic_Programming #Math #Prefix_Sum
// #2023_06_12_Time_584_ms_(100.00%)_Space_51.2_MB_(50.00%)

class Solution {
    fun numOfSubarrays(arr: IntArray): Int {
        var number = if (arr[0] % 2 == 0) 0 else 1
        var res = number.toLong()
        for (i in 1 until arr.size) {
            if (arr[i] % 2 != 0) {
                number = i - number + 1
            }
            res += number.toLong()
        }
        val mod: Long = 1000000007
        return (res % mod).toInt()
    }
}
