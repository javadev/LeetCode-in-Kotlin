package g0001_0100.s0044_wildcard_matching

// #Hard #Top_Interview_Questions #String #Dynamic_Programming #Greedy #Recursion
// #Udemy_Dynamic_Programming #2023_07_05_Time_220_ms_(84.85%)_Space_37.8_MB_(90.91%)

class Solution {
    fun isMatch(s: String, p: String): Boolean {
        var i = 0
        var j = 0
        var starIdx = -1
        var lastMatch = -1
        while (i < s.length) {
            if (j < p.length &&
                (s[i] == p[j] || p[j] == '?')
            ) {
                i++
                j++
            } else if (j < p.length && p[j] == '*') {
                starIdx = j
                lastMatch = i
                j++
            } else if (starIdx != -1) {
                // there is a no match and there was a previous star, we will reset the j to indx
                // after star_index
                // lastMatch will tell from which index we start comparing the string if we
                // encounter * in pattern
                j = starIdx + 1
                // we are saying we included more characters in * so we incremented the
                lastMatch++
                // index
                i = lastMatch
            } else {
                return false
            }
        }
        var isMatch = true
        while (j < p.length && p[j] == '*') {
            j++
        }
        if (i != s.length || j != p.length) {
            isMatch = false
        }
        return isMatch
    }
}
