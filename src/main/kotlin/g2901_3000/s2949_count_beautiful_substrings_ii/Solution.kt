package g2901_3000.s2949_count_beautiful_substrings_ii

// #Hard #String #Hash_Table #Math #Prefix_Sum #Number_Theory
// #2023_12_31_Time_299_ms_(100.00%)_Space_38.4_MB_(96.15%)

class Solution {
    fun beautifulSubstrings(s: String, k: Int): Long {
        var res: Long = 0
        val n = s.length
        var l = 1
        while ((l * l) % (4 * k) != 0) {
            l++
        }
        val seen: Array<HashMap<Int, Int>> = Array(l) { HashMap() }
        var v = 0
        seen[l - 1][0] = 1
        for (i in 0 until n) {
            val c = s[i]
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                v += 1
            } else {
                v -= 1
            }
            val cnt = seen[i % l].getOrDefault(v, 0)
            res += cnt.toLong()
            seen[i % l][v] = cnt + 1
        }
        return res
    }
}
