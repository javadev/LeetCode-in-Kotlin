package g3901_4000.s3921_score_validator

// #Easy #Array #String #Simulation #Mid_Level #Biweekly_Contest_182
// #2026_09_16_Time_2_ms_(91.74%)_Space_47.44_MB_(30.84%)

class Solution {
    fun scoreValidator(events: Array<String>): IntArray? {
        var counter = 0
        var score = 0
        for (i in events) {
            if (counter == 10) {
                break
            }
            if (i == "WD") {
                score += 1
            } else if (i == "NB") {
                score += 1
            } else if (i == "W") {
                counter += 1
            } else {
                score += i.toInt()
            }
        }
        return intArrayOf(score, counter)
    }
}
