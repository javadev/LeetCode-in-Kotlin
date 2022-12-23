package g0401_0500.s0440_k_th_smallest_in_lexicographical_order

// #Hard #Trie #2022_12_22_Time_149_ms_(100.00%)_Space_32.5_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun findKthNumber(n: Int, k: Int): Int {
        var k = k
        var curr = 1
        k = k - 1
        while (k > 0) {
            val steps = calSteps(n, curr.toLong(), curr + 1L)
            if (steps <= k) {
                curr += 1
                k -= steps
            } else {
                curr *= 10
                k -= 1
            }
        }
        return curr
    }

    // use long in case of overflow
    private fun calSteps(n: Int, n1: Long, n2: Long): Int {
        var n1 = n1
        var n2 = n2
        var steps: Long = 0
        while (n1 <= n) {
            steps += Math.min(n + 1L, n2) - n1
            n1 *= 10
            n2 *= 10
        }
        return steps.toInt()
    }
}
