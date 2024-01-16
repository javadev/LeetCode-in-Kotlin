package g2901_3000.s2926_maximum_balanced_subsequence_sum

// #Hard #Array #Dynamic_Programming #Binary_Search #Segment_Tree #Binary_Indexed_Tree
// #2024_01_16_Time_636_ms_(100.00%)_Space_66.4_MB_(66.67%)

import kotlin.math.max

@Suppress("NAME_SHADOWING")
class Solution {
    fun maxBalancedSubsequenceSum(nums: IntArray): Long {
        val n = nums.size
        var m = 0
        val arr = IntArray(n)
        var max = Int.MIN_VALUE
        for (i in 0 until n) {
            val x = nums[i]
            if (x > 0) {
                arr[m++] = x - i
            } else if (x > max) {
                max = x
            }
        }
        if (m == 0) {
            return max.toLong()
        }
        arr.sort()
        val map: MutableMap<Int, Int> = HashMap(m shl 1)
        var pre = Int.MIN_VALUE
        var index = 1
        for (x in arr) {
            if (x == pre) {
                continue
            }
            map[x] = index++
            pre = x
        }

        val bit = BIT(index)
        var ans: Long = 0
        for (i in 0 until n) {
            if (nums[i] <= 0) {
                continue
            }
            index = map[nums[i] - i]!!
            val cur = bit.query(index) + nums[i]
            bit.update(index, cur)
            ans = max(ans, cur)
        }
        return ans
    }

    private class BIT(var n: Int) {
        var tree: LongArray = LongArray(n + 1)

        fun lowbit(index: Int): Int {
            return index and (-index)
        }

        fun update(index: Int, v: Long) {
            var index = index
            while (index <= n && tree[index] < v) {
                tree[index] = v
                index += lowbit(index)
            }
        }

        fun query(index: Int): Long {
            var index = index
            var result: Long = 0
            while (index > 0) {
                result = max(tree[index].toDouble(), result.toDouble()).toLong()
                index -= lowbit(index)
            }
            return result
        }
    }
}
