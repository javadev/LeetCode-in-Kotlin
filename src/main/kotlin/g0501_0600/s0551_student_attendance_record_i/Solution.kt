package g0501_0600.s0551_student_attendance_record_i

// #Easy #String #2023_01_17_Time_151_ms_(95.00%)_Space_33.6_MB_(100.00%)

class Solution {
    fun checkRecord(s: String): Boolean {
        var aCount = 0
        var i = 0
        while (i < s.length) {
            if (s[i] == 'A') {
                aCount++
                if (aCount > 1) {
                    return false
                }
            } else if (s[i] == 'L') {
                var continuousLCount = 0
                while (i < s.length && s[i] == 'L') {
                    i++
                    continuousLCount++
                    if (continuousLCount > 2) {
                        return false
                    }
                }
                i--
            }
            i++
        }
        return true
    }
}
