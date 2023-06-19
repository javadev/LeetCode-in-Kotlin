package g1901_2000.s1906_minimum_absolute_difference_queries

import java.util.BitSet

// #Medium #Array #Hash_Table
class Solution {
    private class SegmentTree internal constructor(nums: IntArray, len: Int) {
        class Node {
            var bits: BitSet? = null
            var minDiff = 0
        }

        var nums: IntArray
        var tree: Array<Node?>

        init {
            this.nums = nums.copyOf(len)
            tree = arrayOfNulls(4 * len)
            buildTree(0, len - 1, 0)
        }

        private fun buildTree(i: Int, j: Int, ti: Int) {
            if (i <= j) {
                if (i == j) {
                    val node = Node()
                    node.bits = BitSet(101)
                    node.bits!!.set(nums[i])
                    node.minDiff = INF
                    tree[ti] = node
                } else {
                    val mid = i + (j - i) / 2
                    buildTree(i, mid, 2 * ti + 1)
                    buildTree(mid + 1, j, 2 * ti + 2)
                    tree[ti] = combineNodes(tree[2 * ti + 1], tree[2 * ti + 2])
                }
            }
        }

        private fun combineNodes(n1: Node?, n2: Node?): Node {
            val node = Node()
            if (n1!!.minDiff == 1 || n2!!.minDiff == 1) {
                node.minDiff = 1
            } else {
                node.bits = BitSet(101)
                node.bits!!.or(n1.bits)
                node.bits!!.or(n2.bits)
                node.minDiff = findMinDiff(node.bits)
            }
            return node
        }

        private fun findMinDiff(bits: BitSet?): Int {
            // minimum value of number is 1.
            var first = bits!!.nextSetBit(1)
            var minDiff = INF
            while (first != -1) {
                val next = bits.nextSetBit(first + 1)
                if (next != -1) {
                    minDiff = Math.min(minDiff, next - first)
                    if (minDiff == 1) {
                        break
                    }
                }
                first = next
            }
            return minDiff
        }

        fun findMinAbsDiff(start: Int, end: Int, i: Int, j: Int, ti: Int): Int {
            val node = findMinAbsDiff2(start, end, i, j, ti)
            return if (node!!.minDiff == INF) -1 else node.minDiff
        }

        private fun findMinAbsDiff2(start: Int, end: Int, i: Int, j: Int, ti: Int): Node? {
            if (i == start && j == end) {
                return tree[ti]
            }
            val mid = i + (j - i) / 2
            return if (end <= mid) {
                findMinAbsDiff2(start, end, i, mid, 2 * ti + 1)
            } else if (start >= mid + 1) {
                findMinAbsDiff2(start, end, mid + 1, j, 2 * ti + 2)
            } else {
                val left = findMinAbsDiff2(start, mid, i, mid, 2 * ti + 1)
                val right = findMinAbsDiff2(mid + 1, end, mid + 1, j, 2 * ti + 2)
                combineNodes(left, right)
            }
        }

        companion object {
            const val INF = 200
        }
    }

    fun minDifference(nums: IntArray, queries: Array<IntArray>): IntArray {
        val len = nums.size
        val qlen = queries.size
        val st = SegmentTree(nums, len)
        val answer = IntArray(qlen)
        for (i in 0 until qlen) {
            answer[i] = st.findMinAbsDiff(queries[i][0], queries[i][1], 0, len - 1, 0)
        }
        return answer
    }
}
