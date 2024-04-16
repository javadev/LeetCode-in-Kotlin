package g3001_3100.s3075_maximize_happiness_of_selected_children

// #Medium #Array #Sorting #Greedy #2024_04_16_Time_608_ms_(93.24%)_Space_73.6_MB_(66.22%)

import kotlin.math.max

class Solution {
    fun maximumHappinessSum(happiness: IntArray, k: Int): Long {
        happiness.sort()
        var sum: Long = 0
        for (i in happiness.size - 1 downTo happiness.size - k) {
            happiness[i] = max(0, happiness[i] - (happiness.size - 1 - i))
            sum += happiness[i].toLong()
        }
        return sum
    }
}
