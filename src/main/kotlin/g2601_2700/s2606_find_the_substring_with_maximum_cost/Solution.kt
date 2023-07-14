package g2601_2700.s2606_find_the_substring_with_maximum_cost

// #Medium #Array #String #Hash_Table #Dynamic_Programming
// #2023_07_14_Time_238_ms_(100.00%)_Space_37.2_MB_(100.00%)

class Solution {
    fun maximumCostSubstring(s: String, chars: String, vals: IntArray): Int {
        val cost = IntArray('z' - 'a' + 1) { i -> i + 1 }
        for (i in chars.indices) {
            cost[chars[i] - 'a'] = vals[i]
        }

        var max = 0
        var currentMax = 0

        for (c in s) {
            currentMax = maxOf(0, currentMax + cost[c - 'a'])
            max = maxOf(max, currentMax)
        }
        return max
    }
}
