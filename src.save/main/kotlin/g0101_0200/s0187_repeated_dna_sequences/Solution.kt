package g0101_0200.s0187_repeated_dna_sequences

// #Medium #String #Hash_Table #Bit_Manipulation #Sliding_Window #Hash_Function #Rolling_Hash
// #Data_Structure_II_Day_9_String #Udemy_Strings
// #2022_10_17_Time_319_ms_(79.03%)_Space_66.7_MB_(16.13%)

class Solution {
    fun findRepeatedDnaSequences(s: String): List<String> {
        if (s.length < 10) {
            return emptyList()
        }
        val seen = BooleanArray(1024 * 1024)
        val added = BooleanArray(1024 * 1024)
        val chars = s.toCharArray()
        var buf = 0
        val map = IntArray(128)
        map['A'.code] = 0
        map['C'.code] = 1
        map['G'.code] = 2
        map['T'.code] = 3
        val ans: MutableList<String> = ArrayList(s.length / 2)
        for (i in 0..9) {
            buf = (buf shl 2) + map[chars[i].code]
        }
        seen[buf] = true
        for (i in 10 until chars.size) {
            buf = (buf shl 2 and 0xFFFFF) + map[chars[i].code]
            if (seen[buf]) {
                if (!added[buf]) {
                    ans.add(String(chars, i - 9, 10))
                    added[buf] = true
                }
            } else {
                seen[buf] = true
            }
        }
        return ans
    }
}
