package g3201_3300.s3223_minimum_length_of_string_after_operations

// #Medium #String #Hash_Table #Counting #2024_07_23_Time_316_ms_(60.00%)_Space_48.4_MB_(82.22%)

class Solution {
    fun minimumLength(s: String): Int {
        val freq = IntArray(26)
        for (i in 0..25) {
            freq[i] = 0
        }
        for (i in 0 until s.length) {
            freq[s[i].code - 'a'.code]++
        }
        var c = 0
        for (i in freq) {
            if (i != 0) {
                c += if (i % 2 == 0) {
                    2
                } else {
                    1
                }
            }
        }
        return c
    }
}
