package g1901_2000.s1967_number_of_strings_that_appear_as_substrings_in_word

// #Easy #String #2023_06_21_Time_157_ms_(100.00%)_Space_35.7_MB_(91.67%)

class Solution {
    fun numOfStrings(patterns: Array<String>, word: String): Int {
        var res = 0
        for (p in patterns) {
            if (word.contains(p)) {
                res++
            }
        }
        return res
    }
}
