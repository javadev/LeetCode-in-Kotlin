package g0301_0400.s0394_decode_string

// #Medium #Top_100_Liked_Questions #String #Stack #Recursion #Level_1_Day_14_Stack #Udemy_Strings
// #Big_O_Time_O(n)_Space_O(n) #2022_09_27_Time_224_ms_(64.86%)_Space_34.3_MB_(84.46%)

class Solution {
    private var i = 0

    fun decodeString(s: String): String {
        var count = 0
        val sb = StringBuilder()
        while (i < s.length) {
            val c = s[i]
            i++
            if (Character.isLetter(c)) {
                sb.append(c)
            } else if (Character.isDigit(c)) {
                count = count * 10 + Character.getNumericValue(c)
            } else if (c == ']') {
                break
            } else if (c == '[') {
                // sub problem
                val repeat = decodeString(s)
                while (count > 0) {
                    sb.append(repeat)
                    count--
                }
            }
        }
        return sb.toString()
    }
}
