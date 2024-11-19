package g1301_1400.s1320_minimum_distance_to_type_a_word_using_two_fingers

// #Hard #String #Dynamic_Programming #2023_06_05_Time_181_ms_(100.00%)_Space_37.7_MB_(100.00%)

class Solution {
    private var word: String? = null
    private lateinit var dp: Array<Array<Array<Int?>>>

    fun minimumDistance(word: String): Int {
        this.word = word
        dp = Array(27) { Array(27) { arrayOfNulls(word.length) } }
        return find(null, null, 0)
    }

    private fun find(f1: Char?, f2: Char?, index: Int): Int {
        if (index == word!!.length) {
            return 0
        }
        val result = dp[if (f1 == null) 0 else f1.code - 'A'.code + 1][
            if (f2 == null) 0 else f2.code - 'A'.code + 1,
        ][index]
        if (result != null) {
            return result
        }
        val ic = word!![index]
        var move = move(f1, ic) + find(ic, f2, index + 1)
        move = Math.min(move, move(f2, ic) + find(f1, ic, index + 1))
        dp[if (f1 == null) 0 else f1.code - 'A'.code + 1][if (f2 == null) 0 else f2.code - 'A'.code + 1][index] = move
        return move
    }

    private fun move(c1: Char?, c2: Char): Int {
        if (c1 == null) {
            return 0
        }
        val c1x = (c1.code - 'A'.code) % 6
        val c1y = (c1.code - 'A'.code) / 6
        val c2x = (c2.code - 'A'.code) % 6
        val c2y = (c2.code - 'A'.code) / 6
        return Math.abs(c1x - c2x) + Math.abs(c1y - c2y)
    }
}
