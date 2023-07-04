package g2501_2600.s2511_maximum_enemy_forts_that_can_be_captured

// #Easy #Array #Two_Pointers #2023_07_04_Time_142_ms_(100.00%)_Space_34.3_MB_(50.00%)

class Solution {
    fun captureForts(forts: IntArray): Int {
        var maxCapture = 0
        val n = forts.size
        var i = 0
        while (i < n) {
            if (forts[i] == 1) {
                var currMax = 0
                i++
                while (i < n && forts[i] == 0) {
                    currMax++
                    i++
                }
                if (i < n && forts[i] == -1) {
                    maxCapture = Math.max(maxCapture, currMax)
                }
                i--
            } else if (forts[i] == -1) {
                var currMax = 0
                i++
                while (i < n && forts[i] == 0) {
                    currMax++
                    i++
                }
                if (i < n && forts[i] == 1) {
                    maxCapture = Math.max(maxCapture, currMax)
                }
                i--
            }
            i++
        }
        return maxCapture
    }
}
