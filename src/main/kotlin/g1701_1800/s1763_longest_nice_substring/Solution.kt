package g1701_1800.s1763_longest_nice_substring

// #Easy #String #Hash_Table #Bit_Manipulation #Sliding_Window
class Solution {
    fun longestNiceSubstring(s: String): String {
        val index = isNotNiceString(s)
        if (index == -1) {
            return s
        }
        val left = longestNiceSubstring(s.substring(0, index))
        val right = longestNiceSubstring(s.substring(index + 1))
        return if (left.length >= right.length) left else right
    }

    private fun isNotNiceString(s: String): Int {
        val set: MutableSet<Char> = HashSet()
        for (c in s.toCharArray()) {
            set.add(c)
        }
        for (i in 0 until s.length) {
            val c = s[i]
            if (!set.contains(c.lowercaseChar()) ||
                !set.contains(c.uppercaseChar())
            ) {
                return i
            }
        }
        return -1
    }
}
