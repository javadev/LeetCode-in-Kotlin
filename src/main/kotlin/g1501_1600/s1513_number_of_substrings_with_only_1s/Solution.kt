package g1501_1600.s1513_number_of_substrings_with_only_1s

// #Medium #String #Math
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
