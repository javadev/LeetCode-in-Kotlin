package g1701_1800.s1736_latest_time_by_replacing_hidden_digits

// #Easy #String #Greedy
class Solution {
    fun maximumTime(time: String): String {
        val sb: StringBuilder = StringBuilder()
        val strs: Array<String> = time.split(":".toRegex()).dropLastWhile({ it.isEmpty() }).toTypedArray()
        val hour: String = strs.get(0)
        val min: String = strs.get(1)
        if (hour.get(0) == '?') {
            if (hour.get(1) == '?') {
                sb.append("23")
            } else if (hour.get(1) > '3') {
                sb.append("1")
                sb.append(hour.get(1))
            } else {
                sb.append("2")
                sb.append(hour.get(1))
            }
        } else if (hour.get(0) == '0' || hour.get(0) == '1') {
            if (hour.get(1) == '?') {
                sb.append(hour.get(0))
                sb.append("9")
            } else {
                sb.append(hour)
            }
        } else if (hour.get(0) == '2') {
            if (hour.get(1) == '?') {
                sb.append("23")
            } else {
                sb.append(hour)
            }
        }
        sb.append(":")
        if (min.get(0) == '?') {
            if (min.get(1) == '?') {
                sb.append("59")
            } else {
                sb.append("5")
                sb.append(min.get(1))
            }
            return sb.toString()
        }
        sb.append(min.get(0))
        if (min.get(1) == '?') {
            sb.append("9")
        } else {
            sb.append(min.get(1))
        }
        return sb.toString()
    }
}
