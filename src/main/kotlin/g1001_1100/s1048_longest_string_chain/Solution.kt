package g1001_1100.s1048_longest_string_chain

// #Medium #Array #String #Hash_Table #Dynamic_Programming #Two_Pointers
// #2023_05_28_Time_273_ms_(75.00%)_Space_46.5_MB_(50.00%)

class Solution {
    fun longestStrChain(words: Array<String>): Int {
        val lenStr = arrayOfNulls<MutableList<String>>(20)
        for (word in words) {
            val len = word.length
            if (lenStr[len] == null) {
                lenStr[len] = ArrayList()
            }
            lenStr[len]!!.add(word)
        }
        val longest: MutableMap<String?, Int?> = HashMap()
        var max = 0
        for (s in words) {
            max = findLongest(s, lenStr, longest).coerceAtLeast(max)
        }
        return max
    }

    private fun findLongest(
        word: String,
        lenStr: Array<MutableList<String>?>,
        longest: MutableMap<String?, Int?>,
    ): Int {
        if (longest.containsKey(word)) {
            return longest[word]!!
        }
        val len = word.length
        val words: List<String>? = lenStr[len + 1]
        if (words == null) {
            longest[word] = 1
            return 1
        }
        var max = 0
        var i: Int
        var j: Int
        for (w in words) {
            i = 0
            j = 0
            while (i < len && j - i <= 1) {
                if (word[i] == w[j++]) {
                    ++i
                }
            }
            if (j - i <= 1) {
                max = findLongest(w, lenStr, longest).coerceAtLeast(max)
            }
        }
        ++max
        longest[word] = max
        return max
    }
}
