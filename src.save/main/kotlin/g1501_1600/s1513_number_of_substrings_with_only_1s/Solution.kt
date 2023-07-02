package g1501_1600.s1513_number_of_substrings_with_only_1s

// #Medium #String #Math #2023_06_12_Time_171_ms_(100.00%)_Space_37.4_MB_(100.00%)

class Solution {
    fun numSub(s: String): Int {
        var count: Long = 0
        var res: Long = 0
        for (ch in s.toCharArray()) {
            if (ch == '0') {
                res += count * (count + 1) / 2
                count = 0
            } else {
                count++
            }
        }
        res += count * (count + 1) / 2
        return (res % 1000000007).toInt()
    }
}
