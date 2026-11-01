package g3801_3900.s3894_traffic_signal_color

// #Easy #String #Math #Simulation #Mid_Level #Biweekly_Contest_180
// #2026_08_11_Time_0_ms_(100.00%)_Space_43.42_MB_(50.99%)

class Solution {
    fun trafficSignal(timer: Int): String {
        if (timer in 31..90) {
            return "Red"
        } else if (timer == 0) {
            return "Green"
        } else if (timer == 30) {
            return "Orange"
        }
        return "Invalid"
    }
}
