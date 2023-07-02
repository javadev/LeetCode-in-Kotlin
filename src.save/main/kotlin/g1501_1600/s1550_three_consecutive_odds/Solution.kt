package g1501_1600.s1550_three_consecutive_odds

// #Easy #Array #2023_06_12_Time_154_ms_(90.00%)_Space_35.2_MB_(100.00%)

class Solution {
    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        for (i in 0 until arr.size - 2) {
            if (arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1) {
                return true
            }
        }
        return false
    }
}
