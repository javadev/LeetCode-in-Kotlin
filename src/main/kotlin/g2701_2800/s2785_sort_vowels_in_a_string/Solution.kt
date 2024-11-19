package g2701_2800.s2785_sort_vowels_in_a_string

// #Medium #String #Sorting #2023_08_08_Time_233_ms_(100.00%)_Space_38.6_MB_(100.00%)

class Solution {
    fun sortVowels(s: String): String {
        val vowelCount = IntArray(11)
        val countIndexMap = IntArray(128)
        val result = s.toCharArray()
        val charMap = "AEIOUaeiou".toCharArray()
        run {
            var i = 0
            while (i < charMap.size) {
                countIndexMap[charMap[i].code] = ++i
            }
        }
        for (c in result) vowelCount[countIndexMap[c.code]]++
        var j = 1
        var i = 0
        while (j < vowelCount.size) {
            if (vowelCount[j] > 0) {
                while (i < result.size) {
                    if (countIndexMap[result[i++].code] == 0) continue
                    vowelCount[j]--
                    result[i - 1] = charMap[j - 1]
                    break
                }
            } else {
                j++
            }
        }
        return String(result)
    }
}
