package g3101_3200.s3186_maximum_total_damage_with_spell_casting

// #Medium #Array #Hash_Table #Dynamic_Programming #Sorting #Binary_Search #Two_Pointers #Counting
// #2024_06_22_Time_1106_ms_(92.73%)_Space_81.1_MB_(41.82%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maximumTotalDamage(power: IntArray): Long {
        var maxPower = 0
        for (p in power) {
            if (p > maxPower) {
                maxPower = p
            }
        }
        return if ((maxPower <= 1000000)) smallPower(power, maxPower) else bigPower(power)
    }

    private fun smallPower(power: IntArray, maxPower: Int): Long {
        val counts = IntArray(maxPower + 6)
        for (p in power) {
            counts[p]++
        }
        val dp = LongArray(maxPower + 6)
        dp[1] = counts[1].toLong()
        dp[2] = max((counts[2] * 2L).toDouble(), dp[1].toDouble()).toLong()
        for (i in 3..maxPower) {
            dp[i] = max((counts[i] * i + dp[i - 3]).toDouble(), max(dp[i - 1].toDouble(), dp[i - 2].toDouble()))
                .toLong()
        }
        return dp[maxPower]
    }

    private fun bigPower(power: IntArray): Long {
        power.sort()
        val n = power.size
        val prevs = LongArray(4)
        var curPower = power[0]
        var count = 1
        var result: Long = 0
        for (i in 1..n) {
            val p = if ((i == n)) 1000000009 else power[i]
            if (p == curPower) {
                count++
            } else {
                val curVal = max(
                    (curPower.toLong() * count + prevs[3]).toDouble(),
                    max(prevs[1].toDouble(), prevs[2].toDouble())
                )
                    .toLong()
                val diff = min((p - curPower).toDouble(), (prevs.size - 1).toDouble()).toInt()
                val nextCurVal =
                    if ((diff == 1)) 0 else max(prevs[3].toDouble(), max(curVal.toDouble(), prevs[2].toDouble()))
                        .toLong()
                // Shift the values in prevs[].
                var k = prevs.size - 1
                if (diff < prevs.size - 1) {
                    while (k > diff) {
                        prevs[k] = prevs[k-- - diff]
                    }
                    prevs[k--] = curVal
                }
                while (k > 0) {
                    prevs[k--] = nextCurVal
                }
                curPower = p
                count = 1
            }
        }
        for (v in prevs) {
            if (v > result) {
                result = v
            }
        }
        return result
    }
}
