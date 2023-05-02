package g0901_1000.s0952_largest_component_size_by_common_factor

// #Hard #Array #Math #Union_Find #2023_05_02_Time_538_ms_(100.00%)_Space_95.7_MB_(100.00%)

import kotlin.math.sqrt

class Solution {
    fun largestComponentSize(nums: IntArray): Int {
        var max = 0
        for (a in nums) {
            max = Math.max(max, a)
        }
        val roots = IntArray(max + 1)
        val sizes = IntArray(max + 1)
        for (idx in 1..max) {
            roots[idx] = idx
        }
        for (a in nums) {
            if (a == 1) {
                sizes[a] = 1
                continue
            }
            val sqrt = sqrt(a.toDouble()).toInt()
            val thisRoot = getRoot(roots, a)
            sizes[thisRoot]++
            for (factor in 1..sqrt) {
                if (a % factor == 0) {
                    val otherFactor = a / factor
                    val otherFactorRoot = getRoot(roots, otherFactor)
                    if (factor != 1) {
                        union(roots, thisRoot, factor, sizes)
                    }
                    union(roots, thisRoot, otherFactorRoot, sizes)
                }
            }
        }
        var maxConnection = 0
        for (size in sizes) {
            maxConnection = Math.max(maxConnection, size)
        }
        return maxConnection
    }

    private fun union(roots: IntArray, a: Int, b: Int, sizes: IntArray) {
        val rootA = getRoot(roots, a)
        val rootB = getRoot(roots, b)
        if (rootA != rootB) {
            sizes[rootA] += sizes[rootB]
            roots[rootB] = rootA
        }
    }

    private fun getRoot(roots: IntArray, a: Int): Int {
        if (roots[a] == a) {
            return a
        }
        roots[a] = getRoot(roots, roots[a])
        return roots[a]
    }
}
