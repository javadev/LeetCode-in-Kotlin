package g2201_2300.s2300_successful_pairs_of_spells_and_potions

// #Medium #Array #Sorting #Binary_Search #Two_Pointers
// #2023_06_28_Time_818_ms_(72.22%)_Space_62.9_MB_(44.44%)

class Solution {
    fun successfulPairs(spells: IntArray, potions: IntArray, success: Long): IntArray {
        potions.sort()
        for (i in spells.indices) {
            var l = 0
            var r = potions.size
            while (l < r) {
                val m = l + (r - l) / 2
                if (spells[i].toLong() * potions[m] >= success) {
                    r = m
                } else {
                    l = m + 1
                }
            }
            spells[i] = potions.size - l
        }
        return spells
    }
}
