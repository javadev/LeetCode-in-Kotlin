package g2901_3000.s2957_remove_adjacent_almost_equal_characters

// #Medium #String #Dynamic_Programming #Greedy
// #2024_01_16_Time_158_ms_(56.52%)_Space_34.6_MB_(100.00%)

import kotlin.math.abs

class Solution {
    fun removeAlmostEqualCharacters(word: String): Int {
        var count = 0
        val wordArray = word.toCharArray()
        for (i in 1 until wordArray.size) {
            if (abs((wordArray[i].code - wordArray[i - 1].code).toDouble()) <= 1) {
                count++
                wordArray[i] =
                    if ((i + 1 < wordArray.size
                                && (wordArray[i + 1] != 'a' && wordArray[i + 1] != 'b'))
                    ) 'a'
                    else 'z'
            }
        }
        return count
    }
}
