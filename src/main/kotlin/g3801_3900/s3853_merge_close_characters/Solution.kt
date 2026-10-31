package g3801_3900.s3853_merge_close_characters

// #Medium #String #Hash_Table #Senior #Biweekly_Contest_177
// #2026_07_27_Time_2_ms_(91.01%)_Space_44.66_MB_(52.91%)

class Solution {
    fun mergeCharacters(s: String, k: Int): String {
        val result = StringBuilder()
        result.ensureCapacity(s.length)
        val cnt = IntArray(26)
        for (t in 0..<s.length) {
            val c = s.get(t)
            val idx = c.code - 'a'.code
            if (cnt[idx] > 0) {
                continue
            }
            result.append(c)
            cnt[idx]++
            if (result.length > k) {
                val drop = result.get(result.length - k - 1)
                cnt[drop.code - 'a'.code]--
            }
        }
        return result.toString()
    }
}
