package g0901_1000.s0944_delete_columns_to_make_sorted

// #Easy #Array #String #2023_04_30_Time_221_ms_(75.00%)_Space_48.7_MB_(6.25%)

class Solution {
    fun minDeletionSize(strs: Array<String>): Int {
        var deleted = 0
        for (i in 0 until strs[0].length) {
            var last = ' '
            for (str in strs) {
                if (str[i] < last) {
                    deleted++
                    break
                }
                last = str[i]
            }
        }
        return deleted
    }
}
