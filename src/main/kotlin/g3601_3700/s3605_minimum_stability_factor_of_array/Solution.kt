package g3601_3700.s3605_minimum_stability_factor_of_array

// #Hard #Array #Math #Greedy #Binary_Search #Segment_Tree #Number_Theory
// #2025_07_07_Time_95_ms_(100.00%)_Space_77.89_MB_(100.00%)

class Solution {
    fun minStable(nums: IntArray, maxC: Int): Int {
        val n = nums.size
        var cnt = 0
        var idx = 0
        while (idx < n) {
            cnt += if (nums[idx] >= 2) 1 else 0
            idx++
        }
        if (cnt <= maxC) {
            return 0
        }
        val logs = IntArray(n + 1)
        var maxLog = 0
        var temp = n
        while (temp > 0) {
            maxLog++
            temp = temp shr 1
        }
        val table = Array<IntArray>(maxLog + 1) { IntArray(n) }
        buildLogs(logs, n)
        buildTable(table, nums, n, maxLog)
        return binarySearch(nums, maxC, n, logs, table)
    }

    private fun buildLogs(logs: IntArray, n: Int) {
        var i = 2
        while (i <= n) {
            logs[i] = logs[i shr 1] + 1
            i++
        }
    }

    private fun buildTable(table: Array<IntArray>, nums: IntArray, n: Int, maxLog: Int) {
        System.arraycopy(nums, 0, table[0], 0, n)
        var level = 1
        while (level <= maxLog) {
            var start = 0
            while (start + (1 shl level) <= n) {
                table[level][start] =
                    gcd(table[level - 1][start], table[level - 1][start + (1 shl (level - 1))])
                start++
            }
            level++
        }
    }

    private fun binarySearch(nums: IntArray, maxC: Int, n: Int, logs: IntArray, table: Array<IntArray>): Int {
        var left = 1
        var right = n
        var result = n
        while (left <= right) {
            val mid = left + ((right - left) shr 1)
            val valid = isValid(nums, maxC, mid, logs, table)
            result = if (valid) mid else result
            val newLeft = if (valid) left else mid + 1
            val newRight = if (valid) mid - 1 else right
            left = newLeft
            right = newRight
        }
        return result
    }

    private fun isValid(arr: IntArray, limit: Int, segLen: Int, logs: IntArray, table: Array<IntArray>): Boolean {
        val n = arr.size
        val window = segLen + 1
        var cuts = 0
        var prevCut = -1
        var pos = 0
        while (pos + window - 1 < n && cuts <= limit) {
            val rangeGcd = getRangeGcd(pos, pos + window - 1, logs, table)
            if (rangeGcd >= 2) {
                val shouldCut = prevCut < pos
                cuts += if (shouldCut) 1 else 0
                prevCut = if (shouldCut) pos + window - 1 else prevCut
            }
            pos++
        }
        return cuts <= limit
    }

    private fun getRangeGcd(left: Int, right: Int, logs: IntArray, table: Array<IntArray>): Int {
        val k = logs[right - left + 1]
        return gcd(table[k][left], table[k][right - (1 shl k) + 1])
    }

    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}
