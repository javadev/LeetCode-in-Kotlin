package g3501_3600.s3544_subtree_inversion_sum

// #Hard #2025_05_11_Time_114_ms_(100.00%)_Space_195.14_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    private lateinit var totalSum: LongArray
    private lateinit var nums: IntArray
    private lateinit var nei: MutableList<MutableList<Int>>
    private var k = 0

    private fun getTotalSum(p: Int, cur: Int): Long {
        var res = nums[cur].toLong()
        for (c in nei[cur]) {
            if (c == p) {
                continue
            }
            res += getTotalSum(cur, c)
        }
        totalSum[cur] = res
        return res
    }

    private fun add(a: Array<LongArray>, b: Array<LongArray>) {
        for (i in a.indices) {
            for (j in a[0].indices) {
                a[i][j] += b[i][j]
            }
        }
    }

    private fun getMaxInc(p: Int, cur: Int): Array<LongArray> {
        val ret = Array<LongArray>(3) { LongArray(k) }
        for (c in nei[cur]) {
            if (c == p) {
                continue
            }
            add(ret, getMaxInc(cur, c))
        }
        val maxCandWithoutInv = nums[cur] + ret[2][0]
        val maxCandWithInv = -(totalSum[cur] - ret[0][k - 1]) - ret[1][k - 1]
        val minCandWithoutInv = nums[cur] + ret[1][0]
        val minCandWithInv = -(totalSum[cur] - ret[0][k - 1]) - ret[2][k - 1]
        val res = Array<LongArray>(3) { LongArray(k) }
        for (i in 0..<k - 1) {
            res[0][i + 1] = ret[0][i]
            res[1][i + 1] = ret[1][i]
            res[2][i + 1] = ret[2][i]
        }
        res[0][0] = totalSum[cur]
        res[1][0] = min(
            min(maxCandWithoutInv, maxCandWithInv),
            min(minCandWithoutInv, minCandWithInv),
        )
        res[2][0] = max(
            max(maxCandWithoutInv, maxCandWithInv),
            max(minCandWithoutInv, minCandWithInv),
        )
        return res
    }

    fun subtreeInversionSum(edges: Array<IntArray>, nums: IntArray, k: Int): Long {
        totalSum = LongArray(nums.size)
        this.nums = nums
        nei = ArrayList<MutableList<Int>>()
        this.k = k
        for (i in nums.indices) {
            nei.add(ArrayList<Int>())
        }
        for (e in edges) {
            nei.get(e[0]).add(e[1])
            nei.get(e[1]).add(e[0])
        }
        getTotalSum(-1, 0)
        val res = getMaxInc(-1, 0)
        return res[2][0]
    }
}
