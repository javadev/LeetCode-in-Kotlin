package g1501_1600.s1523_count_odd_numbers_in_an_interval_range

// #Easy #Math #Programming_Skills_I_Day_1_Basic_Data_Type
// #2023_06_12_Time_114_ms_(97.22%)_Space_32.5_MB_(100.00%)

class Solution {
    fun countOdds(low: Int, high: Int): Int {
        return if (low % 2 != 0 || high % 2 != 0) {
            (high - low) / 2 + 1
        } else {
            (high - low) / 2
        }
    }
}
