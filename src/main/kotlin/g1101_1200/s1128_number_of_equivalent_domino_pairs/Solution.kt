package g1101_1200.s1128_number_of_equivalent_domino_pairs

// #Easy #Array #Hash_Table #Counting #2023_05_31_Time_289_ms_(80.00%)_Space_61.5_MB_(60.00%)

class Solution {
    fun numEquivDominoPairs(dominoes: Array<IntArray>): Int {
        val map: MutableMap<Int, Int> = HashMap()
        var count = 0
        for (dominoe in dominoes) {
            val smaller = Math.min(dominoe[0], dominoe[1])
            val bigger = Math.max(dominoe[0], dominoe[1])
            val key = smaller * 10 + bigger
            count += map.getOrDefault(key, 0)
            map[key] = map.getOrDefault(key, 0) + 1
        }
        return count
    }
}
