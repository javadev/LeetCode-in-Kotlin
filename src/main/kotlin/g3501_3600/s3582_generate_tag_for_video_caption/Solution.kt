package g3501_3600.s3582_generate_tag_for_video_caption

// #Easy #String #Simulation #2025_06_17_Time_3_ms_(100.00%)_Space_45.13_MB_(85.00%)

class Solution {
    fun generateTag(caption: String): String? {
        var caption = caption
        val sb = StringBuilder()
        sb.append('#')
        var space = false
        caption = caption.trim { it <= ' ' }
        for (i in 0..<caption.length) {
            val c = caption[i]
            if (c == ' ') {
                space = true
            }
            if (c >= 'A' && c <= 'Z') {
                if (space) {
                    space = !space
                    sb.append(c)
                } else {
                    sb.append(c.lowercaseChar())
                }
            }
            if (c >= 'a' && c <= 'z') {
                if (space) {
                    space = !space
                    sb.append(c.uppercaseChar())
                } else {
                    sb.append(c)
                }
            }
        }
        if (sb.length > 100) {
            return sb.substring(0, 100)
        }
        return sb.toString()
    }
}
