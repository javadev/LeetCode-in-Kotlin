package g1601_1700.s1629_slowest_key

// #Easy #Array #String #2023_06_17_Time_200_ms_(75.00%)_Space_38.3_MB_(87.50%)

class Solution {
    fun slowestKey(releaseTimes: IntArray, keysPressed: String): Char {
        val map: MutableMap<Char, Int> = HashMap()
        for (i in releaseTimes.indices) {
            val c = keysPressed[i]
            val duration: Int = if (i == 0) {
                releaseTimes[i]
            } else {
                releaseTimes[i] - releaseTimes[i - 1]
            }
            if (!map.containsKey(c)) {
                map[c] = duration
            } else {
                val `val` = map[c]!!
                if (duration > `val`) {
                    map[c] = duration
                }
            }
        }
        val map2: MutableMap<Int, MutableList<Char>> = HashMap()
        for ((key, duration) in map) {
            if (!map2.containsKey(duration)) {
                map2[duration] = ArrayList()
            }
            map2[duration]!!.add(key)
        }
        var max = -1
        for ((key, chars) in map2) {
            chars.sort()
            map2[key] = chars
            max = max.coerceAtLeast(key)
        }
        return map2[max]!![map2[max]!!.size - 1]
    }
}
