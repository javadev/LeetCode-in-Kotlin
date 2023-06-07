package g1201_1300.s1255_maximum_score_words_formed_by_letters

// #Hard #Array #String #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
class Solution {
    private lateinit var score: IntArray

    private fun updateArr(arr: IntArray, s: String, add: Int): Int {
        var sum = 0
        for (c in s.toCharArray()) {
            val ind = c.code - 'a'.code
            arr[ind] += add
            if (arr[ind] < 0) {
                sum = -1
            }
            if (sum != -1) {
                sum += score[ind]
            }
        }
        return sum
    }

    private fun findMaxScore(words: Array<String>, ind: Int, arr: IntArray): Int {
        if (ind == words.size) {
            return 0
        }
        val excl = findMaxScore(words, ind + 1, arr)
        var incl = 0
        val cscore = updateArr(arr, words[ind], -1)
        if (cscore != -1) {
            incl = cscore + findMaxScore(words, ind + 1, arr)
        }
        updateArr(arr, words[ind], 1)
        return Math.max(incl, excl)
    }

    fun maxScoreWords(words: Array<String>, letters: CharArray, score: IntArray): Int {
        val arr = IntArray(26)
        for (c in letters) {
            arr[c.code - 'a'.code]++
        }
        this.score = score
        return findMaxScore(words, 0, arr)
    }
}
