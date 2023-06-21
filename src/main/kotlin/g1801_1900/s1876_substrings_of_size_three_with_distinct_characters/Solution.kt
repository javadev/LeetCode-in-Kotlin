package g1801_1900.s1876_substrings_of_size_three_with_distinct_characters

// #Easy #String #Hash_Table #Counting #Sliding_Window
class Solution {
    fun countGoodSubstrings(s: String): Int {
        var count = 0
        for (i in 0 until s.length - 2) {
            val candidate = s.substring(i, i + 3)
            if (candidate[0] != candidate[1] && candidate[0] != candidate[2] && candidate[1] != candidate[2]) {
                count++
            }
        }
        return count
    }
}
