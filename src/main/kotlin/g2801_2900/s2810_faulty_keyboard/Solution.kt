package g2801_2900.s2810_faulty_keyboard

// #Easy #String #Simulation #2023_12_06_Time_196_ms_(91.67%)_Space_36.9_MB_(91.67%)

class Solution {
    fun finalString(s: String): String {
        val stringBuilder = StringBuilder()
        for (ch in s.toCharArray()) {
            if (ch == 'i') {
                stringBuilder.reverse()
                continue
            }
            stringBuilder.append(ch)
        }
        return stringBuilder.toString()
    }
}
