package g2201_2300.s2287_rearrange_characters_to_make_target_string

// #Easy #String #Hash_Table #Counting #2023_06_28_Time_122_ms_(100.00%)_Space_33.3_MB_(100.00%)

class Solution {
    fun rearrangeCharacters(s: String, target: String): Int {
        return getMaxCopies(target, getCharCount(s), getCharCount(target))
    }

    private fun getCharCount(str: String): IntArray {
        val charToCount = IntArray(26)
        for (i in 0 until str.length) {
            charToCount[str[i].code - 'a'.code]++
        }
        return charToCount
    }

    private fun getMaxCopies(target: String, sCount: IntArray, tCount: IntArray): Int {
        var copies = Int.MAX_VALUE
        for (i in 0 until target.length) {
            val ch = target[i].code - 'a'.code
            copies = Math.min(copies, sCount[ch] / tCount[ch])
        }
        return copies
    }
}
