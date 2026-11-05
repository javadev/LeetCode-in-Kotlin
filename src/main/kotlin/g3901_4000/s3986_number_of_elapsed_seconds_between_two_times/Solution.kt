package g3901_4000.s3986_number_of_elapsed_seconds_between_two_times

// #Easy #String #Math #Mid_Level #Weekly_Contest_510
// #2026_11_03_Time_2_ms_(72.94%)_Space_43.63_MB_(98.57%)

import kotlin.math.pow

class Solution {
    fun secondsBetweenTimes(startTime: String, endTime: String): Int {
        var startSec = 0
        var endSec = 0
        var sSec = 0
        var eSec = 0
        var colon = 2
        for (i in 0..7) {
            if (startTime[i] == ':') {
                startSec = (startSec + sSec * 60.0.pow(colon.toDouble())).toInt()
                endSec = (endSec + eSec * 60.0.pow(colon.toDouble())).toInt()
                colon--
                sSec = 0
                eSec = 0
                continue
            }
            sSec = sSec * 10 + (startTime[i].code - '0'.code)
            eSec = eSec * 10 + (endTime[i].code - '0'.code)
        }
        startSec = (startSec + sSec * 60.0.pow(colon.toDouble())).toInt()
        endSec = (endSec + eSec * 60.0.pow(colon.toDouble())).toInt()
        return endSec - startSec
    }
}
