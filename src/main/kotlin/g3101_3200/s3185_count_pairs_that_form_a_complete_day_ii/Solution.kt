package g3101_3200.s3185_count_pairs_that_form_a_complete_day_ii

// #Medium #Array #Hash_Table #Counting #2024_06_22_Time_578_ms_(78.33%)_Space_115_MB_(66.67%)

class Solution {
    fun countCompleteDayPairs(hours: IntArray): Long {
        val hour = LongArray(24)
        for (j in hours) {
            hour[j % 24]++
        }
        var counter = hour[0] * (hour[0] - 1) / 2
        counter += hour[12] * (hour[12] - 1) / 2
        for (i in 1..11) {
            counter += hour[i] * hour[24 - i]
        }
        return counter
    }
}
