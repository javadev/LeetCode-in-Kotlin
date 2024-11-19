package g2301_2400.s2383_minimum_hours_of_training_to_win_a_competition

// #Easy #Array #Greedy #2023_07_02_Time_156_ms_(100.00%)_Space_34.7_MB_(100.00%)

class Solution {
    fun minNumberOfHours(
        initialEnergy: Int,
        initialExperience: Int,
        energy: IntArray,
        experience: IntArray,
    ): Int {
        var totalEnergy = 0
        for (e in energy) {
            totalEnergy += e
        }
        var result = Math.max(0, totalEnergy - initialEnergy + 1)
        var currentExp = initialExperience
        var exp: Int
        for (i in 0 until experience.size - 1) {
            exp = experience[i]
            if (currentExp <= exp) {
                result += exp - currentExp + 1
                currentExp = exp + 1
            }
            currentExp += exp
        }
        val last = experience[experience.size - 1]
        if (currentExp <= last) {
            result += last - currentExp + 1
        }
        return result
    }
}
