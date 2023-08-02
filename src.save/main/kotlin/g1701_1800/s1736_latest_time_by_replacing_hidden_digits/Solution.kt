package g1701_1800.s1736_latest_time_by_replacing_hidden_digits

// #Easy #String #Greedy #2023_06_16_Time_161_ms_(100.00%)_Space_35.5_MB_(100.00%)

class Solution {
    fun maximumTime(time: String): String {
        val sb: StringBuilder = StringBuilder()
        val strs: Array<String> = time.split(":").dropLastWhile({ it.isEmpty() }).toTypedArray()
        val hour: String = strs[0]
        val min: String = strs[1]
        if (hour[0] == '?') {
            if (hour[1] == '?') {
                sb.append("23")
            } else if (hour[1] > '3') {
                sb.append("1")
                sb.append(hour[1])
            } else {
                sb.append("2")
                sb.append(hour[1])
            }
        } else if (hour[0] == '0' || hour[0] == '1') {
            if (hour[1] == '?') {
                sb.append(hour[0])
                sb.append("9")
            } else {
                sb.append(hour)
            }
        } else if (hour[0] == '2') {
            if (hour[1] == '?') {
                sb.append("23")
            } else {
                sb.append(hour)
            }
        }
        sb.append(":")
        if (min[0] == '?') {
            if (min[1] == '?') {
                sb.append("59")
            } else {
                sb.append("5")
                sb.append(min[1])
            }
            return sb.toString()
        }
        sb.append(min[0])
        if (min[1] == '?') {
            sb.append("9")
        } else {
            sb.append(min[1])
        }
        return sb.toString()
    }
}
