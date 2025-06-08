package g3501_3600.s3575_maximum_good_subtree_score

// #Hard #2025_06_08_Time_414_ms_(100.00%)_Space_66.06_MB_(100.00%)

import kotlin.math.abs
import kotlin.math.max

class Solution {
    private var ans: Long = 0
    fun goodSubtreeSum(vals: IntArray, par: IntArray): Int {
        val n = vals.size
        val adj: Array<MutableList<Int>> = Array<MutableList<Int>>(n) { mutableListOf() }
        for (i in 1..<n) {
            adj[par[i]].add(i)
        }
        this.ans = 0
        dfs(0, vals, adj)
        return ((this.ans % MOD + MOD) % MOD).toInt()
    }

    private fun dfs(u: Int, vals: IntArray, adj: Array<MutableList<Int>>): MutableMap<Int, Int> {
        // du: The DP map for the subtree at node u.
        // Key: bitmask of digits. Value: max sum for that combination of digits.
        val du: MutableMap<Int, Int> = HashMap<Int, Int>()
        // Base case: A sum of 0 is possible with an empty set of digits (mask 0).
        du.put(0, 0)
        // Process the current node's value.
        val s = abs(vals[u]).toString()
        if (hasUniqueDigits(s)) {
            var mask = 0
            for (c in s.toCharArray()) {
                mask = mask or (1 shl (c.code - '0'.code))
            }
            du.put(mask, vals[u])
        }
        for (v in adj[u]) {
            val dv = dfs(v, vals, adj)
            val duSnapshot: MutableMap<Int, Int> = HashMap<Int, Int>(du)
            for (entryV in dv.entries) {
                val mv: Int = entryV.key
                val sv: Int = entryV.value
                for (entryU in duSnapshot.entries) {
                    val mu: Int = entryU.key
                    val su: Int = entryU.value
                    // If the digit sets are disjoint (no common bits in masks), we can combine
                    // them.
                    if ((mu and mv) == 0) {
                        val newMask = mu or mv
                        val newSum = su + sv
                        // Update `du` with the best possible sum for the new combined mask.
                        du.put(
                            newMask,
                            max(du.getOrDefault(newMask, Int.Companion.MIN_VALUE), newSum),
                        )
                    }
                }
            }
        }
        // After processing all children, the max value in `du` is the "good" sum for the subtree at
        // u.
        // Initialize with a very small number to correctly find the maximum, even if sums are
        // negative.
        var maxSubtreeSum = Int.Companion.MIN_VALUE
        for (sum in du.values) {
            maxSubtreeSum = max(maxSubtreeSum, sum)
        }
        // Add this subtree's best sum to the total answer.
        // If du is empty (should not happen due to {0:0}), we add 0.
        this.ans += (if (maxSubtreeSum == Int.Companion.MIN_VALUE) 0 else maxSubtreeSum).toLong()
        return du
    }

    private fun hasUniqueDigits(s: String): Boolean {
        val digits: MutableSet<Char> = HashSet<Char>()
        for (c in s.toCharArray()) {
            if (!digits.add(c)) {
                return false
            }
        }
        return true
    }

    companion object {
        private const val MOD = 1000000007
    }
}
