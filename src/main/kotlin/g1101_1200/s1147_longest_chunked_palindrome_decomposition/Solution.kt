package g1101_1200.s1147_longest_chunked_palindrome_decomposition

// #Hard #String #Dynamic_Programming #Greedy #Two_Pointers #Hash_Function #Rolling_Hash

class Solution {
    fun longestDecomposition(text: String): Int {
        val n = text.length
        var l = 0
        var r = n - 1
        var len = 1
        var ans = 0
        var lft: String
        var rit: String
        var perfectSubstring = false
        while (l + len <= r - len + 1) {
            lft = text.substring(l, l + len)
            rit = text.substring(r - len + 1, r + 1)
            if (lft == rit) {
                ans += 2
                if (l + len == r - len + 1) {
                    perfectSubstring = true
                    break
                }
                l = l + len
                r = r - len
                len = 1
            } else {
                len++
            }
        }
        if (!perfectSubstring) {
            ans++
        }
        return ans
    }
}