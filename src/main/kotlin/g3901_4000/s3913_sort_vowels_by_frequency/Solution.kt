package g3901_4000.s3913_sort_vowels_by_frequency

// #Medium #String #Sorting #Counting #Senior #Weekly_Contest_499
// #2026_09_17_Time_9_ms_(100.00%)_Space_47.32_MB_(89.74%)

class Solution {
    fun sortVowels(s: String): String {
        val freq = IntArray(26)
        val ch = s.toCharArray()
        for (c in ch) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                freq[c.code - 'a'.code]++
            }
        }
        val x: MutableList<IntArray> = ArrayList<IntArray>()
        for (i in 0..25) {
            if (freq[i] > 0) {
                x.add(intArrayOf(i, freq[i]))
            }
        }
        x.sortWith { a: IntArray, b: IntArray ->
            if (b[1] - a[1] == 0) {
                s.indexOf((a[0] + 'a'.code).toChar()) - s.indexOf((b[0] + 'a'.code).toChar())
            } else {
                b[1] - a[1]
            }
        }
        var i = 0
        for (f in x) {
            while (f[1] > 0) {
                val c = ch[i]
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    ch[i] = (f[0] + 'a'.code).toChar()
                    f[1]--
                }
                i++
            }
        }
        return String(ch)
    }
}
