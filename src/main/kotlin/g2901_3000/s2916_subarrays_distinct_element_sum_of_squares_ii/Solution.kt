package g2901_3000.s2916_subarrays_distinct_element_sum_of_squares_ii

// #Hard #Array #Dynamic_Programming #Segment_Tree #Binary_Indexed_Tree
// #2023_12_31_Time_467_ms_(100.00%)_Space_58_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    private var n = 0
    private lateinit var tree1: LongArray
    private lateinit var tree2: LongArray

    fun sumCounts(nums: IntArray): Int {
        n = nums.size
        tree1 = LongArray(n + 1)
        tree2 = LongArray(n + 1)
        var max = 0
        for (x in nums) {
            if (x > max) {
                max = x
            }
        }
        val last = IntArray(max + 1)
        var ans: Long = 0
        var cur: Long = 0
        for (i in 1..n) {
            val x = nums[i - 1]
            val j = last[x]
            cur += 2 * (query(i) - query(j)) + (i - j)
            ans += cur
            update(j + 1, 1)
            update(i + 1, -1)
            last[x] = i
        }
        return (ans % MOD).toInt()
    }

    private fun lowbit(index: Int): Int {
        return index and (-index)
    }

    private fun update(index: Int, x: Int) {
        var index = index
        val v = index * x
        while (index <= n) {
            tree1[index] += x.toLong()
            tree2[index] += v.toLong()
            index += lowbit(index)
        }
    }

    private fun query(index: Int): Long {
        var index = index
        var res: Long = 0
        val p = index + 1
        while (index > 0) {
            res += p * tree1[index] - tree2[index]
            index -= lowbit(index)
        }
        return res
    }

    companion object {
        private const val MOD = 1e9.toInt() + 7
    }
}
