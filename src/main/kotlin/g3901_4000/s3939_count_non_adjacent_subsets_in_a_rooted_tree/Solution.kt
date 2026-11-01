package g3901_4000.s3939_count_non_adjacent_subsets_in_a_rooted_tree

// #Hard #Array #Dynamic_Programming #Depth_First_Search #Tree #Senior_Staff #Biweekly_Contest_183
// #2026_09_29_Time_83_ms_(94.12%)_Space_49.60_MB_(29.41%)

class Solution {
    fun countValidSubsets(parent: IntArray, nums: IntArray, k: Int): Int {
        val n = parent.size
        val h = IntArray(n)
        val to = IntArray(n - 1)
        val nx = IntArray(n - 1)
        buildTree(parent, h, to, nx)
        val dp = Array<Array<LongArray>>(n) { Array<LongArray>(2) { LongArray(k) } }
        dfs(0, h, to, nx, nums, k, dp)
        return getResult(dp)
    }

    private fun buildTree(parent: IntArray, h: IntArray, to: IntArray, nx: IntArray) {
        h.fill(-1)
        var idx = 0
        for (i in 1..<parent.size) {
            to[idx] = i
            nx[idx] = h[parent[i]]
            h[parent[i]] = idx++
        }
    }

    private fun dfs(
        u: Int,
        h: IntArray,
        to: IntArray,
        nx: IntArray,
        nums: IntArray,
        k: Int,
        dp: Array<Array<LongArray>>,
    ) {
        initializeDp(u, nums, k, dp)
        var e = h[u]
        while (e != -1) {
            val v = to[e]
            dfs(v, h, to, nx, nums, k, dp)
            mergeChild(dp[u], dp[v], k)
            e = nx[e]
        }
    }

    private fun initializeDp(u: Int, nums: IntArray, k: Int, dp: Array<Array<LongArray>>) {
        dp[u][0][0] = 1
        dp[u][1][nums[u] % k] = 1
    }

    private fun mergeChild(current: Array<LongArray>, child: Array<LongArray>, k: Int) {
        val next = Array<LongArray>(2) { LongArray(k) }
        mergeExcludedState(current[0], child, next[0], k)
        mergeSelectedState(current[1], child[0], next[1], k)
        copyState(next, current, k)
    }

    private fun mergeExcludedState(current: LongArray, child: Array<LongArray>, next: LongArray, k: Int) {
        for (a in 0..<k) {
            if (current[a] != 0L) {
                mergeWithChildStates(current[a], child[0], child[1], next, a, k)
            }
        }
    }

    private fun mergeSelectedState(current: LongArray, childExcluded: LongArray, next: LongArray, k: Int) {
        for (a in 0..<k) {
            if (current[a] != 0L) {
                mergeWithSingleChildState(current[a], childExcluded, next, a, k)
            }
        }
    }

    private fun mergeWithChildStates(
        currentWays: Long,
        childExcluded: LongArray,
        childSelected: LongArray,
        next: LongArray,
        currentMod: Int,
        k: Int,
    ) {
        for (childMod in 0..<k) {
            val childWays: Long = (childExcluded[childMod] + childSelected[childMod]) % MOD
            addWays(next, currentMod, childMod, currentWays, childWays, k)
        }
    }

    private fun mergeWithSingleChildState(
        currentWays: Long,
        child: LongArray,
        next: LongArray,
        currentMod: Int,
        k: Int,
    ) {
        for (childMod in 0..<k) {
            addWays(next, currentMod, childMod, currentWays, child[childMod], k)
        }
    }

    private fun addWays(target: LongArray, currentMod: Int, childMod: Int, currentWays: Long, childWays: Long, k: Int) {
        if (childWays == 0L) {
            return
        }
        val newMod = (currentMod + childMod) % k
        target[newMod] = (target[newMod] + currentWays * childWays) % MOD
    }

    private fun copyState(source: Array<LongArray>, target: Array<LongArray>, k: Int) {
        for (state in 0..1) {
            if (k >= 0) {
                System.arraycopy(source[state], 0, target[state], 0, k)
            }
        }
    }

    private fun getResult(dp: Array<Array<LongArray>>): Int {
        var result = dp[0][0][0] + dp[0][1][0]
        result %= MOD.toLong()
        result = (result - 1 + MOD) % MOD
        return result.toInt()
    }

    companion object {
        private const val MOD = 1000000007
    }
}
