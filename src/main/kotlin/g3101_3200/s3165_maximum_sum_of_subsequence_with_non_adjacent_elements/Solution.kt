package g3101_3200.s3165_maximum_sum_of_subsequence_with_non_adjacent_elements

// #Hard #Array #Dynamic_Programming #Divide_and_Conquer #Segment_Tree
// #2024_11_09_Time_109_ms_(100.00%)_Space_87.9_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun maximumSumSubsequence(nums: IntArray, queries: Array<IntArray>): Int {
        val tree: Array<LongArray?> = build(nums)
        var result: Long = 0
        for (i in queries.indices) {
            result += set(tree, queries[i][0], queries[i][1])
            result %= MOD.toLong()
        }
        return result.toInt()
    }

    companion object {
        private const val YY = 0
        private const val YN = 1
        private const val NY = 2
        private const val NN = 3
        private const val MOD = 1000000007

        private fun build(nums: IntArray): Array<LongArray?> {
            val len = nums.size
            var size = 1
            while (size < len) {
                size = size shl 1
            }
            val tree = Array<LongArray?>(size * 2) { LongArray(4) }
            for (i in 0 until len) {
                tree[size + i]!![YY] = nums[i].toLong()
            }
            for (i in size - 1 downTo 1) {
                tree[i]!![YY] = max(
                    (tree[2 * i]!![YY] + tree[2 * i + 1]!![NY]),
                    (
                        tree[2 * i]!![YN] + max(
                            tree[2 * i + 1]!![YY],
                            tree[2 * i + 1]!![NY]
                        )
                        )
                )
                tree[i]!![YN] = max(
                    (tree[2 * i]!![YY] + tree[2 * i + 1]!![NN]),
                    (
                        tree[2 * i]!![YN] + max(
                            tree[2 * i + 1]!![YN],
                            tree[2 * i + 1]!![NN]
                        )
                        )
                )
                tree[i]!![NY] = max(
                    (tree[2 * i]!![NY] + tree[2 * i + 1]!![NY]),
                    (
                        tree[2 * i]!![NN] + max(
                            tree[2 * i + 1]!![YY],
                            tree[2 * i + 1]!![NY]
                        )
                        )
                )
                tree[i]!![NN] = max(
                    (tree[2 * i]!![NY] + tree[2 * i + 1]!![NN]),
                    (
                        tree[2 * i]!![NN] + max(
                            tree[2 * i + 1]!![YN],
                            tree[2 * i + 1]!![NN]
                        )
                        )
                )
            }
            return tree
        }

        private fun set(tree: Array<LongArray?>, idx: Int, `val`: Int): Long {
            val size = tree.size / 2
            tree[size + idx]!![YY] = `val`.toLong()
            var i = (size + idx) / 2
            while (i > 0) {
                tree[i]!![YY] = max(
                    (tree[2 * i]!![YY] + tree[2 * i + 1]!![NY]),
                    (
                        tree[2 * i]!![YN] + max(
                            tree[2 * i + 1]!![YY],
                            tree[2 * i + 1]!![NY]
                        )
                        )
                )
                tree[i]!![YN] = max(
                    (tree[2 * i]!![YY] + tree[2 * i + 1]!![NN]),
                    (
                        tree[2 * i]!![YN] + max(
                            tree[2 * i + 1]!![YN],
                            tree[2 * i + 1]!![NN]
                        )
                        )
                )
                tree[i]!![NY] = max(
                    (tree[2 * i]!![NY] + tree[2 * i + 1]!![NY]),
                    (
                        tree[2 * i]!![NN] + max(
                            tree[2 * i + 1]!![YY],
                            tree[2 * i + 1]!![NY]
                        )
                        )
                )
                tree[i]!![NN] = max(
                    (tree[2 * i]!![NY] + tree[2 * i + 1]!![NN]),
                    (
                        tree[2 * i]!![NN] + max(
                            tree[2 * i + 1]!![YN],
                            tree[2 * i + 1]!![NN]
                        )
                        )
                )
                i /= 2
            }
            return max(
                tree[1]!![YY],
                max(tree[1]!![YN], max(tree[1]!![NY], tree[1]!![NN]))
            )
        }
    }
}
