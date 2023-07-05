package g2401_2500.s2451_odd_string_difference

// #Easy #String #Hash_Table #Math #2023_07_04_Time_141_ms_(100.00%)_Space_34.1_MB_(87.50%)

class Solution {
    fun oddString(words: Array<String>): String {
        val n = words[0].length - 1
        val x = IntArray(n)
        var s = 1
        var y = 0
        var index = 1
        for (i in 0 until n) {
            x[i] = words[0][i + 1].code - words[0][i].code
        }
        var i = 1
        while (y * s == 0 || s + y < 3) {
            var b = true
            for (j in 0 until n) {
                if (x[j] != words[i][j + 1].code - words[i][j].code) {
                    b = false
                    break
                }
            }
            if (b) {
                s++
            } else {
                y++
                index = i
            }
            i++
        }
        return if (s == 1) words[0] else words[index]
    }
}
