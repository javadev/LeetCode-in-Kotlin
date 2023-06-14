package g1501_1600.s1592_rearrange_spaces_between_words

// #Easy #String #2023_06_14_Time_182_ms_(75.00%)_Space_35.2_MB_(100.00%)

class Solution {
    fun reorderSpaces(text: String): String {
        var spaceCount = 0
        for (c in text.toCharArray()) {
            if (c == ' ') {
                spaceCount++
            }
        }
        val words = text.trim { it <= ' ' }.split("\\s+".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        if (words.size == 1) {
            val sb = StringBuilder(words[0])
            for (i in 0 until spaceCount) {
                sb.append(" ")
            }
            return sb.toString()
        }
        val trailingSpaces = spaceCount % (words.size - 1)
        val newSpaces = spaceCount / (words.size - 1)
        val sb = StringBuilder()
        for (j in words.indices) {
            sb.append(words[j])
            if (j < words.size - 1) {
                for (i in 0 until newSpaces) {
                    sb.append(" ")
                }
            } else {
                for (i in 0 until trailingSpaces) {
                    sb.append(" ")
                }
            }
        }
        return sb.toString()
    }
}
