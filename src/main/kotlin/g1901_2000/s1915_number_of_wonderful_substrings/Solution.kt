package g1901_2000.s1915_number_of_wonderful_substrings

// #Medium #String #Hash_Table #Bit_Manipulation #Prefix_Sum
class Solution {
    fun wonderfulSubstrings(word: String): Long {
        val count = IntArray(1024)
        var res: Long = 0
        var cur = 0
        count[0] = 1
        for (i in 0 until word.length) {
            cur = cur xor (1 shl word[i].code - 'a'.code)
            res += count[cur].toLong()
            for (j in 0..9) {
                res += count[cur xor (1 shl j)].toLong()
            }
            ++count[cur]
        }
        return res
    }
}
