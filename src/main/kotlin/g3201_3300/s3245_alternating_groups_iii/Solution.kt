package g3201_3300.s3245_alternating_groups_iii

// #Hard #Array #Binary_Indexed_Tree #2025_03_15_Time_70_ms_(100.00%)_Space_108.25_MB_(_%)

import java.util.BitSet

class Solution {
    fun numberOfAlternatingGroups(colors: IntArray, queries: Array<IntArray>): MutableList<Int?> {
        val n = colors.size
        val set = BitSet()
        val bit = BIT(n)
        for (i in 0..<n) {
            if (colors[i] == colors[getIndex(i + 1, n)]) {
                add(set, bit, n, i)
            }
        }
        val ans: MutableList<Int?> = ArrayList<Int?>()
        for (q in queries) {
            if (q[0] == 1) {
                if (set.isEmpty) {
                    ans.add(n)
                } else {
                    val size = q[1]
                    val res = bit.query(size)
                    ans.add(res[1] - res[0] * (size - 1))
                }
            } else {
                val i = q[1]
                var color = colors[i]
                if (q[2] == color) {
                    continue
                }
                val pre = getIndex(i - 1, n)
                if (colors[pre] == color) {
                    remove(set, bit, n, pre)
                }
                val next = getIndex(i + 1, n)
                if (colors[next] == color) {
                    remove(set, bit, n, i)
                }
                colors[i] = colors[i] xor 1
                color = colors[i]
                if (colors[pre] == color) {
                    add(set, bit, n, pre)
                }
                if (colors[next] == color) {
                    add(set, bit, n, i)
                }
            }
        }
        return ans
    }

    private fun add(set: BitSet, bit: BIT, n: Int, i: Int) {
        if (set.isEmpty) {
            bit.update(n, 1)
        } else {
            update(set, bit, n, i, 1)
        }
        set.set(i)
    }

    private fun remove(set: BitSet, bit: BIT, n: Int, i: Int) {
        set.clear(i)
        if (set.isEmpty) {
            bit.update(n, -1)
        } else {
            update(set, bit, n, i, -1)
        }
    }

    private fun update(set: BitSet, bit: BIT, n: Int, i: Int, v: Int) {
        var pre = set.previousSetBit(i)
        if (pre == -1) {
            pre = set.previousSetBit(n)
        }
        var next = set.nextSetBit(i)
        if (next == -1) {
            next = set.nextSetBit(0)
        }
        bit.update(getIndex(next - pre + n - 1, n) + 1, -v)
        bit.update(getIndex(i - pre, n), v)
        bit.update(getIndex(next - i, n), v)
    }

    private fun getIndex(index: Int, mod: Int): Int {
        val result = if (index >= mod) index - mod else index
        return if (index < 0) index + mod else result
    }

    private class BIT(n: Int) {
        var n: Int = n + 1
        var tree1: IntArray = IntArray(n + 1)
        var tree2: IntArray = IntArray(n + 1)

        fun update(size: Int, v: Int) {
            var i = size
            while (i > 0) {
                tree1[i] += v
                tree2[i] += v * size
                i -= i and -i
            }
        }

        fun query(size: Int): IntArray {
            var count = 0
            var sum = 0
            var i = size
            while (i < n) {
                count += tree1[i]
                sum += tree2[i]
                i += i and -i
            }
            return intArrayOf(count, sum)
        }
    }
}
