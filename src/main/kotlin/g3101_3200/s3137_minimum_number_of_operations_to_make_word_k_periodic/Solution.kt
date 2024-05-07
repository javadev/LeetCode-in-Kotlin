package g3101_3200.s3137_minimum_number_of_operations_to_make_word_k_periodic

// #Medium #String #Hash_Table #Counting #2024_05_07_Time_291_ms_(96.30%)_Space_38.8_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun minimumOperationsToMakeKPeriodic(word: String, k: Int): Int {
        val map: MutableMap<Int, Int> = HashMap()
        val n = word.length
        var max = 0
        var i = 0
        while (i < n) {
            var hash = 0
            for (j in i until i + k) {
                val idx = word[j].code - 'a'.code
                hash = hash * 26 + idx
            }
            var count = map.getOrDefault(hash, 0)
            count++
            map[hash] = count
            max = max(max, count)
            i += k
        }
        return n / k - max
    }
}
