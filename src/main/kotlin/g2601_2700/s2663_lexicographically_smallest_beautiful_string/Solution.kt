package g2601_2700.s2663_lexicographically_smallest_beautiful_string

// #Hard #String #Greedy #2023_07_25_Time_324_ms_(100.00%)_Space_40.6_MB_(100.00%)

class Solution {
    fun smallestBeautifulString(s: String, k: Int): String {
        val n = s.length
        val charr = s.toCharArray()
        for (i in n - 1 downTo 0) {
            ++charr[i]
            var canbuild = true
            if (charr[i] > 'a' + k - 1) continue
            while (!isValid(charr, i)) {
                ++charr[i]
                if (charr[i] > 'a' + k - 1) {
                    canbuild = false
                    break
                }
            }
            if (!canbuild) continue
            for (j in i + 1 until n) {
                charr[j] = 'a'
                while (!isValid(charr, j)) {
                    ++charr[j]
                }
            }
            return StringBuilder().append(charr).toString()
        }
        return ""
    }

    private fun isValid(s: CharArray, i: Int): Boolean {
        if (i - 1 >= 0 && s[i - 1] == s[i]) return false
        if (i - 2 >= 0 && s[i - 2] == s[i]) return false
        return true
    }
}
