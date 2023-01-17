package g0501_0600.s0539_minimum_time_difference

// #Medium #Array #String #Math #Sorting #2023_01_16_Time_183_ms_(100.00%)_Space_36_MB_(96.23%)

import java.util.Arrays

class Solution {
    fun findMinDifference(timePoints: List<String>): Int {
        return if (timePoints.size < 300) {
            smallInputSize(timePoints)
        } else largeInputSize(timePoints)
    }

    private fun largeInputSize(timePoints: List<String>): Int {
        val times = BooleanArray(60 * 24)
        for (time in timePoints) {
            val hours = time.substring(0, 2).toInt()
            val minutes = time.substring(3, 5).toInt()
            if (times[hours * 60 + minutes]) {
                return 0
            }
            times[hours * 60 + minutes] = true
        }
        var prev = -1
        var min = 60 * 24
        for (i in 0 until times.size + times.size / 2) {
            if (i < times.size) {
                if (times[i] && prev == -1) {
                    prev = i
                } else if (times[i]) {
                    min = Math.min(min, i - prev)
                    prev = i
                }
            } else {
                if (times[i - times.size] && prev == -1) {
                    prev = i
                } else if (times[i - times.size]) {
                    min = Math.min(min, i - prev)
                    prev = i
                }
            }
        }
        return min
    }

    private fun smallInputSize(timePoints: List<String>): Int {
        val times = IntArray(timePoints.size)
        var j = 0
        for (time in timePoints) {
            val hours = time.substring(0, 2).toInt()
            val minutes = time.substring(3, 5).toInt()
            times[j++] = hours * 60 + minutes
        }
        Arrays.sort(times)
        var min = 60 * 24
        for (i in 1..times.size) {
            min = if (i == times.size) {
                Math.min(min, times[0] + 60 * 24 - times[times.size - 1])
            } else {
                Math.min(min, times[i] - times[i - 1])
            }
            if (min == 0) {
                return 0
            }
        }
        return min
    }
}
