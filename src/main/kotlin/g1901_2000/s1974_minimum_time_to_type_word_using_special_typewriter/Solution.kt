package g1901_2000.s1974_minimum_time_to_type_word_using_special_typewriter

// #Easy #String #Greedy
class Solution {
    fun minTimeToType(word: String): Int {
        var min = 0
        var curr = 'a'
        for (i in 0 until word.length) {
            val diff = curr.code - word[i].code
            curr = word[i]
            min += Math.min(diff + 26, Math.min(Math.abs(diff), 26 - diff))
            min++
        }
        return min
    }
}
