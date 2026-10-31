package g3801_3900.s3883_count_non_decreasing_arrays_with_given_digit_sums

// #Hard #Array #Dynamic_Programming #Prefix_Sum #Senior_Staff #Biweekly_Contest_179
// #2026_08_13_Time_157_ms_(100.00%)_Space_46.79_MB_(100.00%)

class Solution {
    private fun s(x: Int): Int {
        var x = x
        var r = 0
        while (x > 0) {
            r += x % 10
            x /= 10
        }
        return r
    }

    fun countArrays(d: IntArray): Int {
        val g = buildGroups()
        if (g[d[0]].isEmpty()) {
            return 0
        }
        var dp = createInitialDp(g[d[0]].size)
        for (i in 1..<d.size) {
            dp = transition(dp, g[d[i - 1]], g[d[i]])
            if (dp.isEmpty()) {
                return 0
            }
        }
        return sum(dp)
    }

    private fun buildGroups(): Array<ArrayList<Int>> {
        val g: Array<ArrayList<Int>> = Array<ArrayList<Int>>(51) { ArrayList() }
        for (i in 0..50) {
            g[i] = ArrayList<Int>()
        }
        for (i in 0..5000) {
            g[s(i)].add(i)
        }
        return g
    }

    private fun createInitialDp(size: Int): LongArray {
        val dp = LongArray(size)
        dp.fill(1)
        return dp
    }

    private fun transition(dp: LongArray, previous: ArrayList<Int>, current: ArrayList<Int>): LongArray {
        if (current.isEmpty()) {
            return LongArray(0)
        }
        val prefix = buildPrefixSums(dp)
        val next = LongArray(current.size)
        var k = 0
        for (j in current.indices) {
            while (k < previous.size && previous[k] <= current[j]) {
                k++
            }
            if (k > 0) {
                next[j] = prefix[k - 1]
            }
        }
        return next
    }

    private fun buildPrefixSums(values: LongArray): LongArray {
        val prefix = LongArray(values.size)
        prefix[0] = values[0]
        for (i in 1..<values.size) {
            prefix[i] = (prefix[i - 1] + values[i]) % M
        }
        return prefix
    }

    private fun sum(values: LongArray): Int {
        var result: Long = 0
        for (value in values) {
            result = (result + value) % M
        }
        return result.toInt()
    }

    companion object {
        private const val M = 1000000007
    }
}
