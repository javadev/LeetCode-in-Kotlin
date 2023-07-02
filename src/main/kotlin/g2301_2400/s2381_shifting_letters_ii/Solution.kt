package g2301_2400.s2381_shifting_letters_ii

// #Medium #Array #String #Prefix_Sum
class Solution {
    fun shiftingLetters(s: String, shifts: Array<IntArray>): String {
        val diff = IntArray(s.length + 1)
        var l: Int
        var r: Int
        for (shift in shifts) {
            l = shift[0]
            r = shift[1] + 1
            diff[l] += 26
            diff[r] += 26
            if (shift[2] == 0) {
                diff[l]--
                diff[r]++
            } else {
                diff[l]++
                diff[r]--
            }
            diff[l] %= 26
            diff[r] %= 26
        }
        val sb = StringBuilder()
        var current = 0
        var `val`: Int
        for (i in 0 until s.length) {
            current += diff[i]
            `val` = s[i].code - 'a'.code
            `val` += current
            `val` %= 26
            sb.append(('a'.code + `val`).toChar())
        }
        return sb.toString()
    }
}
