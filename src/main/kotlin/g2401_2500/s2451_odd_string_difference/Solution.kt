package g2401_2500.s2451_odd_string_difference

// #Easy #String #Hash_Table #Math
class Solution {
    fun oddString(w: Array<String>): String {
        val n = w[0].length - 1
        val x = IntArray(n)
        var s = 1
        var y = 0
        var index = 1
        for (i in 0 until n) {
            x[i] = w[0][i + 1].code - w[0][i].code
        }
        var i = 1
        while (y * s == 0 || s + y < 3) {
            var b = true
            for (j in 0 until n) {
                if (x[j] != w[i][j + 1].code - w[i][j].code) {
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
        return if (s == 1) w[0] else w[index]
    }
}
