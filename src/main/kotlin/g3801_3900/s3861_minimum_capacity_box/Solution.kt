package g3801_3900.s3861_minimum_capacity_box

// #Easy #Array #Mid_Level #Weekly_Contest_492
// #2026_07_27_Time_0_ms_(100.00%)_Space_44.42_MB_(84.62%)

class Solution {
    fun minimumIndex(capacity: IntArray, itemSize: Int): Int {
        var res = Int.MAX_VALUE
        var idx = -1
        for (i in capacity.indices) {
            if (itemSize <= capacity[i] && capacity[i] < res) {
                res = capacity[i]
                idx = i
            }
        }
        return idx
    }
}
