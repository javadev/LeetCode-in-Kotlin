package g1601_1700.s1604_alert_using_same_key_card_three_or_more_times_in_a_one_hour_period

// #Medium #Array #String #Hash_Table #Sorting
// #2023_06_13_Time_1063_ms_(20.00%)_Space_64.9_MB_(100.00%)

class Solution {
    fun alertNames(keyName: Array<String>, keyTime: Array<String>): List<String> {
        val map = HashMap<String, MutableList<String>>()
        for (i in keyName.indices) {
            map.putIfAbsent(keyName[i], ArrayList())
            map[keyName[i]]!!.add(keyTime[i])
        }
        val soln: MutableList<String> = ArrayList()
        for ((key, timeStamps) in map) {
            timeStamps.sort()
            var i = 0
            while (i + 2 < timeStamps.size) {
                val first = timeStamps[i].split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                val third = timeStamps[i + 2].split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                val hourDiff = third[0].toInt() - first[0].toInt()
                val minDiff = third[1].toInt() - first[1].toInt()
                if (hourDiff == 0 || hourDiff == 1 && minDiff <= 0) {
                    soln.add(key)
                    break
                }
                i++
            }
        }
        soln.sort()
        return soln
    }
}
