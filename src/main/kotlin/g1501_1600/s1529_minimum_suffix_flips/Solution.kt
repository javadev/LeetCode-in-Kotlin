package g1501_1600.s1529_minimum_suffix_flips

// #Medium #String #Greedy #2023_06_12_Time_200_ms_(100.00%)_Space_36.9_MB_(100.00%)

class Solution {
    fun minFlips(target: String): Int {
        var flipCount = target[0].code - 48
        var prev = target[0]
        for (ch in target.toCharArray()) {
            if (ch != prev) {
                flipCount++
                prev = ch
            }
        }
        return flipCount
    }
}
