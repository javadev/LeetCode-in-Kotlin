package g2901_3000.s2960_count_tested_devices_after_test_operations

// #Easy #Array #Simulation #2024_01_16_Time_168_ms_(86.96%)_Space_36.6_MB_(88.41%)

class Solution {
    fun countTestedDevices(batteryPercentages: IntArray): Int {
        var count = 0
        var diff = 0
        for (n in batteryPercentages) {
            if (n - diff > 0) {
                count++
                diff++
            }
        }
        return count
    }
}
