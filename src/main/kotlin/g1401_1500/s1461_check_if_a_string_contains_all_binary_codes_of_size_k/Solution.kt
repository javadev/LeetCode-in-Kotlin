package g1401_1500.s1461_check_if_a_string_contains_all_binary_codes_of_size_k

// #Medium #String #Hash_Table #Bit_Manipulation #Hash_Function #Rolling_Hash
// #2023_10_02_Time_482_ms_(100.00%)_Space_65.5_MB_(75.00%)

class Solution {
    fun hasAllCodes(s: String, k: Int): Boolean {
        val total = Math.pow(2.0, k.toDouble()).toInt()
        var start = 0
        var end = start + k
        val st: MutableSet<String> = HashSet()
        while (end <= s.length) {
            val sbStr = s.substring(start, end)
            st.add(sbStr)
            if (st.size == total) {
                return true
            }
            start++
            end++
        }
        return false
    }
}
