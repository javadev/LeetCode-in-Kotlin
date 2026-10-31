package g3801_3900.s3833_count_dominant_indices

// #Easy #Array #Enumeration #Mid_Level #Weekly_Contest_488
// #2026_07_21_Time_1_ms_(100.00%)_Space_46.45_MB_(19.67%)

class Solution {
    fun dominantIndices(a: IntArray): Int {
        val n = a.size
        var sum: Long = 0
        var cnt = 0
        for (i in n - 1 downTo 1) {
            sum += a[i].toLong()
            if (a[i - 1] > sum / (n - i)) {
                cnt++
            }
        }
        return cnt
    }
}
