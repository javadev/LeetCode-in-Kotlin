package g3001_3100.s3042_count_prefix_and_suffix_pairs_i

// #Easy #Array #String #Trie #Hash_Function #String_Matching #Rolling_Hash
// #2024_03_03_Time_160_ms_(96.72%)_Space_35.3_MB_(90.16%)

class Solution {
    fun countPrefixSuffixPairs(words: Array<String>): Int {
        var count = 0
        for (i in words.indices) {
            for (j in i + 1 until words.size) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++
                }
            }
        }
        return count
    }

    private fun isPrefixAndSuffix(str1: String, str2: String): Boolean {
        val m = str1.length
        val n = str2.length
        if (m > n) {
            return false
        }
        for (i in 0 until m) {
            if (str1[i] != str2[i]) {
                return false
            }
        }
        for (i in 0 until m) {
            if (str1[i] != str2[n - m + i]) {
                return false
            }
        }
        return true
    }
}
