package g2601_2700.s2645_minimum_additions_to_make_valid_string

// #Medium #String #Dynamic_Programming #Greedy #Stack
// #2023_07_19_Time_154_ms_(100.00%)_Space_34.9_MB_(85.71%)

class Solution {
    fun addMinimum(word: String): Int {
        var res = 0

        var last = word[0]
        res += word[0] - 'a'
        for (i in 1 until word.length) {
            val curr = word[i]
            if (curr > last) {
                res += curr - last - 1
            } else {
                res += curr - last + 2
            }
            last = curr
        }
        res += 'c' - last
        return res
    }
}
