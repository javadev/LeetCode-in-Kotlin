package g2901_3000.s2904_shortest_and_lexicographically_smallest_beautiful_string

// #Medium #String #Sliding_Window #2023_12_27_Time_169_ms_(66.67%)_Space_35.1_MB_(83.33%)

@Suppress("NAME_SHADOWING")
class Solution {
    private var n = 0

    private fun nextOne(s: String, i: Int): Int {
        var i = i
        i++
        while (i < n) {
            if (s[i] == '1') {
                return i
            }
            i++
        }
        return -1
    }

    fun shortestBeautifulSubstring(s: String, k: Int): String {
        n = s.length
        var i = nextOne(s, -1)
        var j = i
        var c = 1
        while (c != k && j != -1) {
            j = nextOne(s, j)
            c++
        }
        if (c != k || j == -1) {
            return ""
        }
        var min = j - i + 1
        var r = s.substring(i, i + min)
        i = nextOne(s, i)
        j = nextOne(s, j)
        while (j != -1) {
            val temp = j - i + 1
            if (temp < min) {
                min = j - i + 1
                r = s.substring(i, i + min)
            } else if (temp == min) {
                val r1 = s.substring(i, i + min)
                if (r1.compareTo(r) < 0) {
                    r = r1
                }
            }
            i = nextOne(s, i)
            j = nextOne(s, j)
        }
        return r
    }
}
