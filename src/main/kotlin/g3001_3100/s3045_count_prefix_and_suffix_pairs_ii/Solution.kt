package g3001_3100.s3045_count_prefix_and_suffix_pairs_ii

// #Hard #Array #String #Trie #Hash_Function #String_Matching #Rolling_Hash
// #2024_02_29_Time_19_ms_(100.00%)_Space_55.7_MB_(94.24%)

class Solution {
    fun countPrefixSuffixPairs(words: Array<String>): Long {
        var ans: Long = 0
        val visited = BooleanArray(words.size)
        for (i in words.indices) {
            val p = words[i]
            if (!visited[i]) {
                var found = 1
                for (j in i + 1 until words.size) {
                    val s = words[j]
                    if (s.length >= p.length && s.startsWith(p) && s.endsWith(p)) {
                        ans += found.toLong()
                    }
                    if (p == s) {
                        found++
                        visited[j] = true
                    }
                }
            }
        }
        return ans
    }
}
