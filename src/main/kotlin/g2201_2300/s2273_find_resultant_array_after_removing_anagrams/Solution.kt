package g2201_2300.s2273_find_resultant_array_after_removing_anagrams

// #Easy #Array #String #Hash_Table #Sorting #2023_06_28_Time_200_ms_(93.75%)_Space_37.3_MB_(87.50%)

class Solution {
    fun removeAnagrams(words: Array<String>): List<String> {
        val result: MutableList<String> = ArrayList()
        if (words.isEmpty()) {
            return result
        }
        var uniqueWordIdx = 0
        var currIdx = 1
        result.add(words[uniqueWordIdx])
        while (currIdx < words.size) {
            if (!isAnagram(words[currIdx], words[uniqueWordIdx])) {
                uniqueWordIdx = currIdx
                result.add(words[uniqueWordIdx])
            }
            currIdx++
        }
        return result
    }

    /*
    Utility to check if the 2 words are anagrams or not
     */
    private fun isAnagram(word1: String, word2: String): Boolean {
        val charMap = IntArray(26)
        val word1Arr = word1.toCharArray()
        val word2Arr = word2.toCharArray()
        for (a in word1Arr) {
            charMap[a.code - 'a'.code]++
        }
        for (a in word2Arr) {
            charMap[a.code - 'a'.code]--
        }
        for (a in charMap) {
            if (a != 0) {
                return false
            }
        }
        return true
    }
}
