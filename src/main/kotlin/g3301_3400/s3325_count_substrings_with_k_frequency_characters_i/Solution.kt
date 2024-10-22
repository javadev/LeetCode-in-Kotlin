package g3301_3400.s3325_count_substrings_with_k_frequency_characters_i

// #Medium #String #Hash_Table #Sliding_Window #2024_10_22_Time_3_ms_(88.00%)_Space_35.9_MB_(76.00%)

class Solution {
    fun numberOfSubstrings(s: String, k: Int): Int {
        var left = 0
        var result = 0
        val count = IntArray(26)
        for (i in 0 until s.length) {
            val ch = s.get(i)
            count[ch.code - 'a'.code]++

            while (count[ch.code - 'a'.code] == k) {
                result += s.length - i
                val atLeft = s.get(left)
                count[atLeft.code - 'a'.code]--
                left++
            }
        }
        return result
    }
}
