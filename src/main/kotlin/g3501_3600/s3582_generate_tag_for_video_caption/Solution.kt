package g3501_3600.s3582_generate_tag_for_video_caption

// #Easy #2025_06_16_Time_40_ms_(100.00%)_Space_46.98_MB_(55.56%)

import java.util.Locale

class Solution {
    fun generateTag(caption: String): String? {
        if (caption.trim { it <= ' ' }.isEmpty()) {
            return "#"
        }
        val arr = caption.trim { it <= ' ' }.split("\\s+".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val res = StringBuilder("#")
        var firstWord = arr[0]
        firstWord =
            (
                firstWord.substring(0, 1).lowercase(Locale.getDefault()) +
                    (if (firstWord.length > 1) firstWord.substring(1).lowercase(Locale.getDefault()) else "")
                )
        res.append(firstWord)
        for (i in 1..<arr.size) {
            var w = arr[i]
            if (w.isEmpty()) {
                continue
            }
            w =
                (
                    w.substring(0, 1).uppercase(Locale.getDefault()) +
                        (if (w.length > 1) w.substring(1).lowercase(Locale.getDefault()) else "")
                    )
            res.append(w)
            if (res.length >= 100) {
                break
            }
        }
        return if (res.length > 100) res.substring(0, 100) else res.toString()
    }
}
