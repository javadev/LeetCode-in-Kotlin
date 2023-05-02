package g0901_1000.s0955_delete_columns_to_make_sorted_ii

// #Medium #Array #String #Greedy #2023_05_02_Time_190_ms_(100.00%)_Space_37.7_MB_(100.00%)

class Solution {
    fun minDeletionSize(strs: Array<String>): Int {
        val sorted = BooleanArray(strs.size)
        var res = 0
        for (i in 0 until strs[0].length) {
            var j = 0
            while (j < strs.size - 1) {
                if (!sorted[j] && strs[j][i] > strs[j + 1][i]) {
                    res++
                    break
                }
                j++
            }
            if (j < strs.size - 1) {
                continue
            }
            j = 0
            while (j < strs.size - 1) {
                if (strs[j][i] < strs[j + 1][i]) {
                    sorted[j] = true
                }
                j++
            }
        }
        return res
    }
}
