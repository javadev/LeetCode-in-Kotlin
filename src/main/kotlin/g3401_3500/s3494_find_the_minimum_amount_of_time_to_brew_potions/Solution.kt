package g3401_3500.s3494_find_the_minimum_amount_of_time_to_brew_potions

// #Medium #2025_03_23_Time_70_ms_(100.00%)_Space_50.98_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun minTime(skill: IntArray, mana: IntArray): Long {
        val endTime = LongArray(skill.size)
        endTime.fill(0)
        for (k in mana) {
            var t: Long = 0
            var maxDiff: Long = 0
            for (j in skill.indices) {
                maxDiff = max(maxDiff, endTime[j] - t)
                t += skill[j].toLong() * k.toLong()
                endTime[j] = t
            }
            for (j in skill.indices) {
                endTime[j] += maxDiff
            }
        }
        return endTime[endTime.size - 1]
    }
}
