package g3501_3600.s3533_concatenated_divisibility

// #Hard #2025_04_27_Time_20_ms_(100.00%)_Space_49.10_MB_(100.00%)

class Solution {
    fun concatenatedDivisibility(nums: IntArray, k: Int): IntArray {
        nums.sort()
        var digits = 0
        val n = nums.size
        val digCnt = IntArray(n)
        for (i in 0..<n) {
            var num = nums[i]
            digits++
            digCnt[i]++
            while (num >= 10) {
                digits++
                digCnt[i]++
                num /= 10
            }
        }
        val pow10 = IntArray(digits + 1)
        pow10[0] = 1
        for (i in 1..digits) {
            pow10[i] = (pow10[i - 1] * 10) % k
        }
        val res = IntArray(n)
        return if (dfs(0, 0, k, digCnt, nums, pow10, Array(1 shl n) { BooleanArray(k) }, 0, res, n)) {
            res
        } else {
            IntArray(0)
        }
    }

    private fun dfs(
        mask: Int,
        residue: Int,
        k: Int,
        digCnt: IntArray,
        nums: IntArray,
        pow10: IntArray,
        visited: Array<BooleanArray?>,
        ansIdx: Int,
        ans: IntArray,
        n: Int,
    ): Boolean {
        if (ansIdx == n) {
            return residue == 0
        }
        if (visited[mask]!![residue]) {
            return false
        }
        var i = 0
        var bit = 1
        while (i < n) {
            if ((mask and bit) == bit) {
                i++
                bit = bit shl 1
                continue
            }
            val newResidue = (residue * pow10[digCnt[i]] + nums[i]) % k
            ans[ansIdx] = nums[i]
            if (dfs(mask or bit, newResidue, k, digCnt, nums, pow10, visited, ansIdx + 1, ans, n)) {
                return true
            }
            i++
            bit = bit shl 1
        }
        visited[mask]!![residue] = true
        return false
    }
}
