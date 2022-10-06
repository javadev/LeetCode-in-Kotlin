package g0001_0100.s0013_roman_to_integer

// #Easy #Top_Interview_Questions #String #Hash_Table #Math
// #2022_10_06_Time_358_ms_(75.16%)_Space_38.4_MB_(83.72%)

class Solution {
    fun romanToInt(s: String): Int {
        var x = 0
        var y: Char
        for (i in s.indices) {
            y = s[i]
            when (y) {
                'I' -> x = getX(s, x, i, 1, 'V', 'X')
                'V' -> x += 5
                'X' -> x = getX(s, x, i, 10, 'L', 'C')
                'L' -> x += 50
                'C' -> x = getX(s, x, i, 100, 'D', 'M')
                'D' -> x += 500
                'M' -> x += 1000
            }
        }
        return x
    }

    private fun getX(s: String, x: Int, i: Int, i2: Int, v: Char, x2: Char): Int {
        var localX = x
        if (i + 1 == s.length) {
            localX += i2
        } else if (s[i + 1] == v) {
            localX -= i2
        } else if (s[i + 1] == x2) {
            localX -= i2
        } else {
            localX += i2
        }
        return localX
    }
}
