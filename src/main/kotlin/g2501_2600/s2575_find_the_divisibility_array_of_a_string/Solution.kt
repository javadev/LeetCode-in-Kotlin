package g2501_2600.s2575_find_the_divisibility_array_of_a_string

// #Medium #Array #String #Math #2023_07_10_Time_507_ms_(100.00%)_Space_47.3_MB_(100.00%)

class Solution {
    fun divisibilityArray(word: String, m: Int): IntArray {
        val ans = IntArray(word.length)
        val prevRemainder = StringBuilder()

        for (i in word.indices) {
            val number = prevRemainder.append(word[i]).toString().toLong()
            if (number != 0L && number < m) {
                continue
            }

            val remainder = number % m
            prevRemainder.clear()

            if (remainder == 0L) {
                ans[i] = 1
            } else {
                prevRemainder.append(remainder)
            }
        }

        return ans
    }
}
