package g2901_3000.s2953_count_complete_substrings

// #Hard #String #Hash_Table #Sliding_Window
// #2024_01_16_Time_315_ms_(100.00%)_Space_38.7_MB_(100.00%)

import kotlin.math.abs

class Solution {
    fun countCompleteSubstrings(word: String, k: Int): Int {
        val arr = word.toCharArray()
        val n = arr.size
        var result = 0
        var last = 0
        for (i in 1..n) {
            if (i == n || abs((arr[i].code - arr[i - 1].code).toDouble()) > 2) {
                result += getCount(arr, k, last, i - 1)
                last = i
            }
        }
        return result
    }

    private fun getCount(arr: CharArray, k: Int, start: Int, end: Int): Int {
        var result = 0
        var i = 1
        while (i <= 26 && i * k <= end - start + 1) {
            val cnt = IntArray(26)
            var good = 0
            for (j in start..end) {
                val cR = arr[j]
                cnt[cR.code - 'a'.code]++
                if (cnt[cR.code - 'a'.code] == k) {
                    good++
                }
                if (cnt[cR.code - 'a'.code] == k + 1) {
                    good--
                }
                if (j >= start + i * k) {
                    val cL = arr[j - i * k]
                    if (cnt[cL.code - 'a'.code] == k) {
                        good--
                    }
                    if (cnt[cL.code - 'a'.code] == k + 1) {
                        good++
                    }
                    cnt[cL.code - 'a'.code]--
                }
                if (good == i) {
                    result++
                }
            }
            i++
        }
        return result
    }
}
