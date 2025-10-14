package g3701_3800.s3715_sum_of_perfect_square_ancestors

// #Hard #Array #Hash_Table #Math #Depth_First_Search #Tree #Counting #Number_Theory
// #Weekly_Contest_471 #2025_10_14_Time_148_ms_(100.00%)_Space_136.25_MB_(80.00%)

class Solution {
    fun sumOfAncestors(n: Int, edges: Array<IntArray>, nums: IntArray): Long {
        // Build adjacency list
        val adj: MutableList<MutableList<Int>> = ArrayList<MutableList<Int>>()
        for (i in 0..<n) {
            adj.add(ArrayList<Int>())
        }
        for (e in edges) {
            adj[e[0]].add(e[1])
            adj[e[1]].add(e[0])
        }
        // Map to count kernel frequencies along DFS path
        // kernel fits in int (<= nums[i])
        val freq: MutableMap<Int, Int> = HashMap<Int, Int>()
        var total = 0L
        total += dfs(0, -1, adj, nums, freq)
        return total
    }

    private fun dfs(
        node: Int, parent: Int, adj: MutableList<MutableList<Int>>, nums: IntArray, freq: MutableMap<Int, Int>
    ): Long {
        // kernel <= nums[node] <= 1e5 fits int
        val key = getKernel(nums[node]).toInt()
        val count: Int = freq.getOrDefault(key, 0)
        var sum = count.toLong()
        freq[key] = count + 1
        for (nei in adj[node]) {
            if (nei != parent) {
                sum += dfs(nei, node, adj, nums, freq)
            }
        }
        if (count == 0) {
            freq.remove(key)
        } else {
            freq[key] = count
        }
        return sum
    }

    // Compute square-free kernel using prime factorization parity
    private fun getKernel(x: Int): Long {
        var x = x
        var key: Long = 1
        while (x > 1) {
            val p: Int = SPF[x]
            var c = 0
            while (x % p == 0) {
                x /= p
                // toggle parity
                c = c xor 1
            }
            if (c == 1) {
                key *= p.toLong()
            }
        }
        return key
    }

    companion object {
        private const val MAX = 100000

        // smallest prime factor
        private val SPF = IntArray(MAX + 1)

        // Precompute smallest prime factors for fast factorization
        init {
            for (i in 2..MAX) {
                if (SPF[i] == 0) {
                    var j = i
                    while (j <= MAX) {
                        if (SPF[j] == 0) {
                            SPF[j] = i
                        }
                        j += i
                    }
                }
            }
        }
    }
}
