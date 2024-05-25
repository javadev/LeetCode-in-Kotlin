package g3101_3200.s3152_special_array_ii

// #Medium #Array #Binary_Search #Prefix_Sum #2024_05_25_Time_707_ms_(93.83%)_Space_93.9_MB_(59.26%)

class Solution {
    fun isArraySpecial(nums: IntArray, queries: Array<IntArray>): BooleanArray {
        val n = nums.size
        val bad = IntArray(n)
        for (i in 1 until n) {
            bad[i] = bad[i - 1] + (((nums[i - 1] xor nums[i]) and 1) xor 1)
        }
        val nq = queries.size
        val res = BooleanArray(nq)
        for (i in 0 until nq) {
            val q = queries[i]
            res[i] = calc(bad, q[0], q[1]) == 0
        }
        return res
    }

    private fun calc(arr: IntArray, st: Int, end: Int): Int {
        return arr[end] - arr[st]
    }
}
