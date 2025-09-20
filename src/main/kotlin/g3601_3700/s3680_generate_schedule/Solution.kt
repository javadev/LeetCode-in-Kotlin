package g3601_3700.s3680_generate_schedule

// #Medium #Biweekly_Contest_165 #2025_09_20_Time_3_ms_(100.00%)_Space_48.94_MB_(100.00%)

class Solution {
    fun generateSchedule(n: Int): Array<IntArray> {
        if (n < 5) {
            return Array<IntArray>(0) { IntArray(0)}
        }
        val res = Array<IntArray>(n * (n - 1)) { IntArray(2)}
        var idx = 0
        for (i in 2..<n - 1) {
            for (j in 0..<n) {
                res[idx++] = intArrayOf(j, (j + i) % n)
            }
        }
        for (i in 0..<n) {
            res[idx++] = intArrayOf(i, (i + 1) % n)
            res[idx++] = intArrayOf((i + 4) % n, (i + 3) % n)
        }
        return res
    }
}
