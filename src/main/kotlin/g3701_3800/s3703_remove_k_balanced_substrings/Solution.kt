package g3701_3800.s3703_remove_k_balanced_substrings

// #Medium #String #Stack #Simulation #Weekly_Contest_470
// #2025_10_06_Time_58_ms_(100.00%)_Space_51.31_MB_(80.00%)

class Solution {
    fun removeSubstring(s: String, k: Int): String {
        val sb = StringBuilder()
        var count = 0
        for (ch in s.toCharArray()) {
            sb.append(ch)
            if (ch == '(') {
                count++
            } else {
                if (count >= k && sb.length >= 2 * k) {
                    val len = sb.length
                    var b = true
                    for (i in len - 2 * k..<len - k) {
                        if (sb[i] != '(') {
                            b = false
                            break
                        }
                    }
                    for (i in len - k..<len) {
                        if (sb[i] != ')') {
                            b = false
                            break
                        }
                    }
                    if (b) {
                        sb.delete(sb.length - 2 * k, sb.length)
                        count -= k
                    }
                }
            }
        }
        return sb.toString()
    }
}
