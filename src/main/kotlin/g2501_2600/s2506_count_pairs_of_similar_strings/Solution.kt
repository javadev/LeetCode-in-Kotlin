package g2501_2600.s2506_count_pairs_of_similar_strings

// #Easy #Array #String #Hash_Table #2023_07_04_Time_208_ms_(100.00%)_Space_37.4_MB_(100.00%)

class Solution {
    fun similarPairs(words: Array<String>): Int {
        val len = words.size
        if (len == 1) {
            return 0
        }
        val alPh = Array(len) { ByteArray(26) }
        val map: MutableMap<String, Int> = HashMap()
        for (i in 0 until len) {
            val word = words[i]
            for (c in word.toCharArray()) {
                val idx = c.code - 'a'.code
                if (alPh[i][idx].toInt() == 0) {
                    alPh[i][idx]++
                }
            }
            val s = String(alPh[i])
            if (map.containsKey(s)) {
                map[s] = map[s]!! + 1
            } else {
                map[s] = 1
            }
        }
        var pairs = 0
        for ((_, freq) in map) {
            if (freq > 1) {
                pairs += freq * (freq - 1) / 2
            }
        }
        return pairs
    }
}
