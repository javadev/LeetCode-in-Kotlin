package g2701_2800.s2709_greatest_common_divisor_traversal

// #Hard #Array #Math #Union_Find #Number_Theory
// #2023_07_31_Time_892_ms_(81.82%)_Space_73.7_MB_(81.82%)

@Suppress("NAME_SHADOWING")
class Solution {
    private var map: MutableMap<Int, Int>? = null
    private lateinit var set: IntArray
    private fun findParent(u: Int): Int {
        return if (u == set[u]) u else findParent(set[u]).also { set[u] = it }
    }

    private fun union(a: Int, b: Int) {
        val p1 = findParent(a)
        val p2 = findParent(b)
        if (p1 != p2) {
            set[b] = p1
        }
        set[p2] = p1
    }

    private fun solve(n: Int, index: Int) {
        var n = n
        if (n % 2 == 0) {
            val x = map!!.getOrDefault(2, -1)
            if (x != -1) {
                union(x, index)
            }
            while (n % 2 == 0) n /= 2
            map!!.put(2, index)
        }
        val sqrt = kotlin.math.sqrt(n.toDouble()).toInt()
        for (i in 3..sqrt) {
            if (n % i == 0) {
                val x = map!!.getOrDefault(i, -1)
                if (x != -1) {
                    union(x, index)
                }
                while (n % i == 0) n /= i
                map!!.put(i, index)
            }
        }
        if (n > 2) {
            val x = map!!.getOrDefault(n, -1)
            if (x != -1) {
                union(x, index)
            }
            map!!.put(n, index)
        }
    }

    fun canTraverseAllPairs(nums: IntArray): Boolean {
        set = IntArray(nums.size)
        map = HashMap()
        for (i in nums.indices) set[i] = i
        for (i in nums.indices) solve(nums[i], i)
        val p = findParent(0)
        for (i in nums.indices) if (p != findParent(i)) return false
        return true
    }
}
