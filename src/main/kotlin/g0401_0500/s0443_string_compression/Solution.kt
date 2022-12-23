package g0401_0500.s0443_string_compression

// #Medium #String #Two_Pointers #2022_12_23_Time_198_ms_(92.68%)_Space_35.4_MB_(95.12%)

class Solution {
    /* This is breaking the rules, it's not in-place. */
    fun compress(chars: CharArray?): Int {
        if (chars == null || chars.size == 0) {
            return 0
        }
        val sb = StringBuilder()
        var count = 1
        var prev = chars[0]
        for (i in 1 until chars.size) {
            if (chars[i] == prev) {
                count++
            } else {
                if (count > 1) {
                    sb.append(prev)
                    sb.append(count)
                } else if (count == 1) {
                    sb.append(prev)
                }
                prev = chars[i]
                count = 1
            }
        }
        sb.append(prev)
        if (count > 1) {
            sb.append(count)
        }
        var i = 0
        for (c in sb.toString().toCharArray()) {
            chars[i++] = c
        }
        return sb.length
    }
}
