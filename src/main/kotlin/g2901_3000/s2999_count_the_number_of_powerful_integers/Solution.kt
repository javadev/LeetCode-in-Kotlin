package g2901_3000.s2999_count_the_number_of_powerful_integers

// #Hard #String #Dynamic_Programming #Math #2024_01_19_Time_163_ms_(100.00%)_Space_35.3_MB_(87.50%)

import kotlin.math.max

@Suppress("NAME_SHADOWING")
class Solution {
    fun numberOfPowerfulInt(start: Long, finish: Long, limit: Int, s: String): Long {
        var start = start
        val sn = s.toLong()
        if (finish < sn) {
            return 0
        }
        start = max(start, sn)
        val originalL = s.length.toLong()
        var factor: Long = 1
        for (i in 1..originalL) {
            factor *= 10
        }
        val sx = if ((start - sn) % factor == 0L) (start - sn) / factor else (start - sn) / factor + 1
        val lx = (finish - sn) / factor

        return if (sx == 0L
        ) indexOfLimitIntSmallerThanOrEqual(lx, limit) + 1
        else (
            indexOfLimitIntSmallerThanOrEqual(lx, limit) -
                indexOfLimitIntSmallerThanOrEqual(sx - 1, limit)
            )
    }

    private fun indexOfLimitIntSmallerThanOrEqual(target: Long, limit: Int): Long {
        val s = target.toString()
        var index: Long = 0
        var limitViolated = false
        for (i in 0 until s.length) {
            index *= (limit + 1).toLong()
            if (!limitViolated) {
                if (s[i].code - '0'.code > limit) {
                    limitViolated = true
                    index += limit.toLong()
                } else {
                    index += (s[i].code - '0'.code).toLong()
                }
            } else {
                index += limit.toLong()
            }
        }
        return index
    }
}
