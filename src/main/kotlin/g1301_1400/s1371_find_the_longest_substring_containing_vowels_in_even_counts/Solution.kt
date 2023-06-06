package g1301_1400.s1371_find_the_longest_substring_containing_vowels_in_even_counts

// #Medium #String #Hash_Table #Bit_Manipulation #Prefix_Sum
// #2023_06_06_Time_317_ms_(100.00%)_Space_49.1_MB_(100.00%)

class Solution {
    private var result: Int? = null

    fun findTheLongestSubstring(s: String): Int {
        val arr = IntArray(s.length)
        var sum = 0
        val set: Set<Char> = HashSet(mutableListOf('a', 'e', 'i', 'o', 'u'))
        for (i in 0 until s.length) {
            val c = s[i]
            if (set.contains(c)) {
                sum = if (sum and (1 shl 'a'.code - c.code) == 0) sum or (1 shl 'a'.code - c.code) else
                    sum and (1 shl 'a'.code - c.code).inv()
            }
            arr[i] = sum
        }
        for (i in 0 until s.length) {
            if (result != null && result!! > s.length - i) {
                break
            }
            for (j in s.length - 1 downTo i) {
                val e = arr[j]
                val k = if (i - 1 < 0) 0 else arr[i - 1]
                val m = e xor k
                if (m == 0) {
                    result = if (result == null) j - i + 1 else Math.max(result!!, j - i + 1)
                    break
                }
            }
        }
        return if (result == null) 0 else result!!
    }
}
