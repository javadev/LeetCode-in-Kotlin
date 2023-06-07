package g1201_1300.s1297_maximum_number_of_occurrences_of_a_substring

// #Medium #String #Hash_Table #Sliding_Window
class Solution {
    fun maxFreq(s: String, max: Int, minSize: Int, maxSize: Int): Int {
        // the map of occurrences
        val sub2Count: MutableMap<String, Int> = HashMap()
        // sliding window indices
        var lo = 0
        var hi = minSize - 1
        var maxCount = 0
        // unique letters counter
        val uniq = CharArray(26)
        var uniqCount = 0
        // initial window calculation - `hi` is excluded here!
        for (ch in s.substring(lo, hi).toCharArray()) {
            uniq[ch.code - 'a'.code] = uniq[ch.code - 'a'.code] + 1.toChar().code
            if (uniq[ch.code - 'a'.code].code == 1) {
                uniqCount++
            }
        }
        while (hi < s.length) {
            // handle increment of hi
            val hiCh = s[hi]
            uniq[hiCh.code - 'a'.code] = uniq[hiCh.code - 'a'.code] + 1.toChar().code
            if (uniq[hiCh.code - 'a'.code].code == 1) {
                uniqCount++
            }
            ++hi
            // add the substring to the map of occurences
            val sub = s.substring(lo, hi)
            if (uniqCount <= max) {
                var count = 1
                if (sub2Count.containsKey(sub)) {
                    count += sub2Count[sub]!!
                }
                sub2Count[sub] = count
                maxCount = Math.max(maxCount, count)
            }
            // handle increment of lo
            val loCh = s[lo]
            uniq[loCh.code - 'a'.code] = uniq[loCh.code - 'a'.code] - 1.toChar().code
            if (uniq[loCh.code - 'a'.code].code == 0) {
                uniqCount--
            }
            ++lo
        }
        return maxCount
    }
}
