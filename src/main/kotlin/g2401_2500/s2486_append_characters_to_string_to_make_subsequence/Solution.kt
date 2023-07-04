package g2401_2500.s2486_append_characters_to_string_to_make_subsequence

// #Medium #String #Greedy #Two_Pointers
class Solution {
    fun appendCharacters(s: String, t: String): Int {
        val lengthOfT = t.length
        var indexOfT = 0
        var indexOfS = 0
        var position: Int
        if (s.contains(t)) {
            return 0
        }
        while (indexOfT < lengthOfT) {
            position = s.indexOf(t[indexOfT], indexOfS)
            if (position < 0) {
                return lengthOfT - indexOfT
            }
            indexOfS = position
            indexOfT++
            indexOfS++
        }
        return lengthOfT - indexOfT
    }
}
