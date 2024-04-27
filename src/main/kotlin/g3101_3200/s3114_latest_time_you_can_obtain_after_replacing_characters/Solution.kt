package g3101_3200.s3114_latest_time_you_can_obtain_after_replacing_characters

// #Easy #String #Enumeration #2024_04_27_Time_161_ms_(83.58%)_Space_35_MB_(100.00%)

class Solution {
    fun findLatestTime(s: String): String {
        val nm = StringBuilder()
        if (s[0] == '?' && s[1] == '?') {
            nm.append("11")
        } else if (s[0] != '?' && s[1] == '?') {
            nm.append(s[0])
            if (s[0] == '1') {
                nm.append("1")
            } else {
                nm.append("9")
            }
        } else if (s[0] == '?' && s[1] != '?') {
            if (s[1] in '2'..'9') {
                nm.append("0")
            } else {
                nm.append("1")
            }
            nm.append(s[1])
        } else {
            nm.append(s[0])
            nm.append(s[1])
        }
        nm.append(":")
        if (s[3] == '?' && s[4] == '?') {
            nm.append("59")
        } else if (s[3] != '?' && s[4] == '?') {
            nm.append(s[3])
            nm.append("9")
        } else if (s[3] == '?' && s[4] != '?') {
            nm.append("5")
            nm.append(s[4])
        } else {
            nm.append(s[3])
            nm.append(s[4])
        }
        return nm.toString()
    }
}
