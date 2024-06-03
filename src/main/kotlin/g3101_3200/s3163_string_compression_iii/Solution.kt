package g3101_3200.s3163_string_compression_iii

// #Medium #String #2024_06_03_Time_331_ms_(66.13%)_Space_45.8_MB_(41.94%)

class Solution {
    fun compressedString(word: String): String {
        val builder = StringBuilder()
        var last = word[0]
        var count = 1
        var i = 1
        val l = word.length
        while (i < l) {
            if (word[i] == last) {
                count++
                if (count == 10) {
                    builder.append(9).append(last)
                    count = 1
                }
            } else {
                builder.append(count).append(last)
                last = word[i]
                count = 1
            }
            i++
        }
        builder.append(count).append(last)
        return builder.toString()
    }
}
