package g2801_2900.s2897_apply_operations_on_array_to_maximize_sum_of_squares

// #Hard #Array #Hash_Table #Greedy #Bit_Manipulation
// #2023_12_21_Time_572_ms_(100.00%)_Space_64.3_MB_(100.00%)

class Solution {
    fun maxSum(nums: List<Int>, k: Int): Int {
        val bits = IntArray(32)
        for (n in nums) {
            for (i in 0..31) {
                bits[i] += (n shr i) and 1
            }
        }
        val mod = 1000000007
        var sum: Long = 0
        for (i in 0 until k) {
            var n: Long = 0
            for (j in 0..31) {
                if (bits[j] > i) {
                    n = n or (1 shl j).toLong()
                }
            }
            sum = (sum + n * n % mod) % mod
        }
        return sum.toInt()
    }
}
