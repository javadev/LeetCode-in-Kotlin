package g0401_0500.s0401_binary_watch

// #Easy #Bit_Manipulation #Backtracking #2022_11_30_Time_266_ms_(71.43%)_Space_34.9_MB_(100.00%)

import java.util.ArrayList

@Suppress("NAME_SHADOWING")
class Solution {
    fun readBinaryWatch(turnedOn: Int): List<String> {
        val times: MutableList<String> = ArrayList()
        for (hour in 0..11) {
            for (minutes in 0..59) {
                readBinaryWatchHelper(turnedOn, times, hour, minutes)
            }
        }
        return times
    }

    private fun readBinaryWatchHelper(
        turnedOn: Int,
        selectedTimes: MutableList<String>,
        hour: Int,
        minutes: Int,
    ) {
        if (isValidTime(turnedOn, hour, minutes)) {
            selectedTimes.add(getTimeString(hour, minutes))
        }
    }

    private fun getTimeString(hour: Int, minutes: Int): String {
        val time = StringBuilder()
        time.append(hour)
        time.append(':')
        if (minutes < 10) {
            time.append('0')
        }
        time.append(minutes)
        return time.toString()
    }

    private fun isValidTime(turnedOn: Int, hour: Int, minutes: Int): Boolean {
        var hour = hour
        var minutes = minutes
        var counter = 0
        while (hour != 0) {
            if (hour and 1 == 1) {
                counter++
            }
            hour = hour ushr 1
        }
        if (counter > turnedOn) {
            return false
        }
        while (minutes != 0) {
            if (minutes and 1 == 1) {
                counter++
            }
            minutes = minutes ushr 1
        }
        return counter == turnedOn
    }
}
