package g2801_2900.s2829_determine_the_minimum_sum_of_a_k_avoiding_array

// #Medium #Math #Greedy #2023_12_18_Time_162_ms_(75.00%)_Space_34.7_MB_(75.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun minimumSum(n: Int, k: Int): Int {
        var k = k
        val arr = IntArray(n)
        val a = k / 2
        var sum = 0
        if (a > n) {
            for (i in 0 until n) {
                arr[i] = i + 1
                sum += arr[i]
            }
        } else {
            for (i in 0 until a) {
                arr[i] = i + 1
                sum += arr[i]
            }
            for (j in a until n) {
                arr[j] = k++
                sum += arr[j]
            }
        }
        return sum
    }
}
