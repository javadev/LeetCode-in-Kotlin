package g2701_2800.s2781_length_of_the_longest_valid_substring

// #Hard #Array #String #Hash_Table #Sliding_Window
// #2023_08_09_Time_647_ms_(100.00%)_Space_60.3_MB_(100.00%)

class Solution {
    fun longestValidSubstring(word: String, forbidden: List<String>): Int {
        val set = HashSet<String>()
        for (s in forbidden) {
            set.add(s)
        }
        val n = word.length
        var ans = 0
        var i = 0
        var j = 0
        while (j < n) {
            var k = j
            while (k > j - 10 && k >= i) {
                if (set.contains(word.substring(k, j + 1))) {
                    i = k + 1
                    break
                }
                k--
            }
            ans = Math.max(j - i + 1, ans)
            j++
        }
        return ans
    }
}
