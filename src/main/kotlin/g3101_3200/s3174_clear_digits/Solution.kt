package g3101_3200.s3174_clear_digits

// #Easy #String #Hash_Table #Simulation #2024_06_15_Time_180_ms_(70.18%)_Space_35.1_MB_(94.74%)

class Solution {
    fun clearDigits(s: String): String {
        val result = StringBuilder()
        for (ch in s.toCharArray()) {
            if (ch in '0'..'9') {
                if (result.isNotEmpty()) {
                    result.deleteCharAt(result.length - 1)
                }
            } else {
                result.append(ch)
            }
        }
        return result.toString()
    }
}
