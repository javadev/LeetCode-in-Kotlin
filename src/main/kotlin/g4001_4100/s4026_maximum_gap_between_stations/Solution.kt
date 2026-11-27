package g4001_4100.s4026_maximum_gap_between_stations

// #Medium #String #Greedy #Two_Pointers #Staff #Weekly_Contest_515
// #2026_11_25_Time_28_ms_(100.00%)_Space_47.45_MB_(96.06%)

import kotlin.math.max

class Solution {
    fun maximumGap(skill: String, station: String): Int {
        if (skill.length == 1) {
            return 0
        }
        return maximumGap(skill.toCharArray(), station.toCharArray())
    }

    companion object {
        private fun maximumGap(skill: CharArray, station: CharArray): Int {
            val n = skill.size
            val last = IntArray(n)
            var pos = station.size - 1
            for (i in n - 1 downTo 0) {
                while (station[pos] != skill[i]) {
                    --pos
                }
                last[i] = (pos--)
            }
            var result = 0
            pos = 0
            var i = 0
            val limit = n - 1
            while (i < limit) {
                while (station[pos] != skill[i]) {
                    ++pos
                }
                result = max(result, last[i + 1] - pos)
                ++pos
                ++i
            }
            return result
        }
    }
}
