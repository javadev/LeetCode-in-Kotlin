package g3701_3800.s3784_minimum_deletion_cost_to_make_all_characters_equal

// #Medium #Array #String #Hash_Table #Enumeration #Senior #Weekly_Contest_481
// #2026_05_22_Time_3_ms_(94.77%)_Space_104.58_MB_(97.09%)

class Solution {
    fun minCost(s: String, cost: IntArray): Long {
        val arr = LongArray(26)
        var m = Int.MIN_VALUE.toLong()
        var sum: Long = 0
        for (i in 0..<s.length) {
            arr[s[i].code - 'a'.code] += cost[i].toLong()
        }
        for (i in arr) {
            if (i > m) {
                m = i
            }
            sum += i
        }
        return sum - m
    }
}
