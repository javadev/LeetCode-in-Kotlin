package g1501_1600.s1528_shuffle_string

// #Easy #Array #String #2023_06_12_Time_180_ms_(89.23%)_Space_36.5_MB_(81.54%)

class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        val c = CharArray(s.length)
        for (i in 0 until s.length) {
            val index = findIndex(indices, i)
            c[i] = s[index]
        }
        return String(c)
    }

    companion object {
        private fun findIndex(indices: IntArray, i: Int): Int {
            for (j in indices.indices) {
                if (indices[j] == i) {
                    return j
                }
            }
            return 0
        }
    }
}
