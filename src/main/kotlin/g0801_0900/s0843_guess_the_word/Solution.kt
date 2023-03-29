package g0801_0900.s0843_guess_the_word

// #Hard #Array #String #Math #Game_Theory #Interactive
// #2023_03_29_Time_75_ms_(100.00%)_Space_31.5_MB_(100.00%)

import java.util.Collections

/*
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     fun guess(word: String): Int {}
 * }
 */
class Solution {
    interface Master {
        fun guess(word: String): Int
    }

    private var next = 0

    fun findSecretWord(wordlist: Array<String>, master: Master) {
        val list = listOf(*wordlist)
        Collections.shuffle(list)
        val test = BooleanArray(wordlist.size)
        while (true) {
            val num = master.guess(list[next]!!)
            if (num == 6) {
                break
            }
            updateList(list, test, num)
        }
    }

    private fun updateList(list: List<String?>, test: BooleanArray, num: Int) {
        val index = next
        for (i in index + 1 until test.size) {
            if (test[i]) {
                continue
            }
            val samePart = getSame(list[index], list[i])
            if (samePart != num) {
                test[i] = true
            } else if (next == index) {
                next = i
            }
        }
    }

    private fun getSame(word1: String?, word2: String?): Int {
        var ret = 0
        for (i in 0..5) {
            if (word1!![i] == word2!![i]) {
                ret++
            }
        }
        return ret
    }
}
