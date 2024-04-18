package g3001_3100.s3085_minimum_deletions_to_make_string_k_special

// #Medium #String #Hash_Table #Sorting #Greedy #Counting
// #2024_04_18_Time_221_ms_(93.33%)_Space_38.3_MB_(93.33%)

import kotlin.math.min

class Solution {
    fun minimumDeletions(word: String, k: Int): Int {
        val arr = IntArray(26)
        for (element in word) {
            arr[element.code - 'a'.code]++
        }
        var min = Int.MAX_VALUE
        for (value in arr) {
            if (value != 0) {
                val u = value + k
                var res = 0
                for (i in arr) {
                    if (i < value) {
                        res += i
                    } else if (i > u) {
                        res += (i - u)
                    }
                }
                min = min(res, min)
            }
        }
        return min
    }
}
