package g0001_0100.s0012_integer_to_roman

class Solution {
    fun intToRoman(num: Int): String? {
        var localNum = num
        val sb = StringBuilder()
        val m = 1000
        val c = 100
        val x = 10
        val i = 1
        localNum = numerals(sb, localNum, m, ' ', ' ', 'M')
        localNum = numerals(sb, localNum, c, 'M', 'D', 'C')
        localNum = numerals(sb, localNum, x, 'C', 'L', 'X')
        numerals(sb, localNum, i, 'X', 'V', 'I')
        return sb.toString()
    }

    private fun numerals(sb: StringBuilder, num: Int, one: Int, cTen: Char, cFive: Char, cOne: Char): Int {
        val div = num / one
        when (div) {
            9 -> {
                sb.append(cOne)
                sb.append(cTen)
            }
            8 -> {
                sb.append(cFive)
                sb.append(cOne)
                sb.append(cOne)
                sb.append(cOne)
            }
            7 -> {
                sb.append(cFive)
                sb.append(cOne)
                sb.append(cOne)
            }
            6 -> {
                sb.append(cFive)
                sb.append(cOne)
            }
            5 -> sb.append(cFive)
            4 -> {
                sb.append(cOne)
                sb.append(cFive)
            }
            3 -> {
                sb.append(cOne)
                sb.append(cOne)
                sb.append(cOne)
            }
            2 -> {
                sb.append(cOne)
                sb.append(cOne)
            }
            1 -> sb.append(cOne)
        }
        return num - div * one
    }
}
