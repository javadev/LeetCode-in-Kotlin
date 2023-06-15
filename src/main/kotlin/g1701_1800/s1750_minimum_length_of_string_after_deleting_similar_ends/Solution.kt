package g1701_1800.s1750_minimum_length_of_string_after_deleting_similar_ends

// #Medium #String #Two_Pointers
class Solution {
    fun minimumLength(s: String): Int {
        var i: Int = 0
        var j: Int = s.length - 1
        if (s.get(i) == s.get(j)) {
            while (i < j && s.get(i) == s.get(j)) {
                val c: Char = s.get(i)
                i++
                while (c == s.get(i) && i < j) {
                    i++
                }
                j--
                while (c == s.get(j) && i < j) {
                    j--
                }
            }
        }
        return if (i <= j) s.substring(i, j).length + 1 else 0
    }
}
