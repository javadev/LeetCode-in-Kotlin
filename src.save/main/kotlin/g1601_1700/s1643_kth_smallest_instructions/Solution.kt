package g1601_1700.s1643_kth_smallest_instructions

// #Hard #Array #Dynamic_Programming #Math #Combinatorics
// #2023_06_18_Time_171_ms_(100.00%)_Space_34.8_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun kthSmallestPath(destination: IntArray, k: Int): String {
        var k = k
        val sb = StringBuilder()
        var v = destination[0]
        var n = v + destination[1]
        while (true) {
            val range = choose(--n, v)
            if (k <= range) {
                sb.append('H')
            } else {
                sb.append('V')
                v--
                k -= range
            }
            if (v == 0) {
                for (i in 1..n) {
                    sb.append('H')
                }
                break
            } else if (v == n) {
                for (i in 1..v) {
                    sb.append('V')
                }
                break
            }
        }
        return sb.toString()
    }

    private fun choose(n: Int, k: Int): Int {
        var k = k
        if (n - k < k) {
            k = n - k
        }
        var answer = 1
        for (i in 1..k) {
            answer = answer * (n + 1 - i) / i
        }
        return answer
    }
}
