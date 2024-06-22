package g3101_3200.s3184_count_pairs_that_form_a_complete_day_i

// #Easy #Array #Hash_Table #Counting #2024_06_22_Time_171_ms_(68.42%)_Space_35.1_MB_(91.58%)

class Solution {
    fun countCompleteDayPairs(hours: IntArray): Int {
        val modular = IntArray(26)
        var ans = 0
        for (hour in hours) {
            val mod = hour % 24
            ans += modular[24 - mod]
            if (mod == 0) {
                modular[24]++
            } else {
                modular[mod]++
            }
        }
        return ans
    }
}
