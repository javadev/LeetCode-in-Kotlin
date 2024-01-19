package g2901_3000.s2982_find_longest_special_substring_that_occurs_thrice_ii

// #Medium #String #Hash_Table #Binary_Search #Counting #Sliding_Window
// #2024_01_19_Time_343_ms_(100.00%)_Space_48.4_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun maximumLength(s: String): Int {
        val arr = Array(26) { IntArray(4) }
        var prev = s[0]
        var count = 1
        var max = 0
        for (index in 1 until s.length) {
            if (s[index] != prev) {
                val ints = arr[prev.code - 'a'.code]
                updateArr(count, ints)
                prev = s[index]
                count = 1
            } else {
                count++
            }
        }
        updateArr(count, arr[prev.code - 'a'.code])
        for (values in arr) {
            if (values[0] != 0) {
                max = if (values[1] >= 3) {
                    max(max, values[0])
                } else if (values[1] == 2 || values[2] == values[0] - 1) {
                    max(max, (values[0] - 1))
                } else {
                    max(max, (values[0] - 2))
                }
            }
        }
        return if (max == 0) -1 else max
    }

    private fun updateArr(count: Int, ints: IntArray) {
        if (ints[0] == count) {
            ints[1]++
        } else if (ints[0] < count) {
            ints[3] = ints[1]
            ints[2] = ints[0]
            ints[0] = count
            ints[1] = 1
        } else if (ints[2] < count) {
            ints[2] = count
            ints[3] = 1
        }
    }
}
