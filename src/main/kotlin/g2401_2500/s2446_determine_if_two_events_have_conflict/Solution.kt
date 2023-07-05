package g2401_2500.s2446_determine_if_two_events_have_conflict

// #Easy #Array #String
class Solution {
    fun haveConflict(event1: Array<String>, event2: Array<String>): Boolean {
        val aStart = getTimeSerial(event1[0])
        val aEnd = getTimeSerial(event1[1])
        val bStart = getTimeSerial(event2[0])
        val bEnd = getTimeSerial(event2[1])
        return bStart >= aStart && bStart <= aEnd || bStart <= aStart && bEnd >= aStart
    }

    private fun getTimeSerial(timestamp: String): Int {
        var hours = 0
        var minutes = 0
        var isHours = true
        var i = 0
        while (i < timestamp.length) {
            if (timestamp[i] == ':') {
                isHours = false
            } else if (isHours) {
                hours = hours * 10 + Character.getNumericValue(timestamp[i])
            } else {
                minutes = minutes * 10 + Character.getNumericValue(timestamp[i])
            }
            i += 1
        }
        return 60 * hours + minutes
    }
}
