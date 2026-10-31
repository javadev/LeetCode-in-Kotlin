package g3701_3800.s3752_lexicographically_smallest_negated_permutation_that_sums_to_target

// #Medium #Array #Math #Sorting #Greedy #Two_Pointers #Staff #Biweekly_Contest_170
// #2026_04_26_Time_3_ms_(100.00%)_Space_162.22_MB_(86.17%)

class Solution {
    fun lexSmallestNegatedPerm(n: Int, target: Long): IntArray? {
        var drop = n.toLong() * (n + 1) / 2 - target
        if (drop < 0 || drop % 2 != 0L) {
            return intArrayOf()
        }
        val ans = IntArray(n)
        var l = 0
        var r = n - 1
        for (i in n downTo 1) {
            val `val` = i
            if (2 * `val` <= drop) {
                drop -= (2 * `val`).toLong()
                ans[l++] = -`val`
            } else {
                ans[r--] = `val`
            }
        }
        if (drop != 0L) {
            return intArrayOf()
        }
        return ans
    }
}
