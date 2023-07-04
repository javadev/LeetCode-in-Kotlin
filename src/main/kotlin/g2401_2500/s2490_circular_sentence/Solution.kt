package g2401_2500.s2490_circular_sentence

// #Easy #String
class Solution {
    fun isCircularSentence(sentence: String): Boolean {
        val letters = sentence.toCharArray()
        val len = letters.size
        for (i in 0 until len - 1) {
            if (letters[i] == ' ' && letters[i - 1] != letters[i + 1]) {
                return false
            }
        }
        return letters[0] == letters[len - 1]
    }
}
