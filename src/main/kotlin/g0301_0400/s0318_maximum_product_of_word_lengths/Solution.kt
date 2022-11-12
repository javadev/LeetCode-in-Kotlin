package g0301_0400.s0318_maximum_product_of_word_lengths

// #Medium #Array #String #Bit_Manipulation #2022_11_10_Time_477_ms_(100.00%)_Space_53.5_MB_(75.00%)

class Solution {
    fun maxProduct(words: Array<String>): Int {
        val n = words.size
        var res = 0
        val masks = IntArray(n)
        for (i in 0 until n) {
            masks[i] = getMask(words[i])
        }
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                if (masks[i] and masks[j] == 0) {
                    res = Math.max(res, words[i].length * words[j].length)
                }
            }
        }
        return res
    }

    private fun getMask(s: String): Int {
        var mask = 0
        for (i in 0 until s.length) {
            val c = s[i]
            mask = mask or (1 shl c.code - 'a'.code)
        }
        return mask
    }
}