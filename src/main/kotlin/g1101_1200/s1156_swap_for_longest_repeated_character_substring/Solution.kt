package g1101_1200.s1156_swap_for_longest_repeated_character_substring

// #Medium #String #Sliding_Window #2023_05_25_Time_195_ms_(20.00%)_Space_38.9_MB_(20.00%)

class Solution {
    private class Pair(var character: Char, var count: Int)

    fun maxRepOpt1(text: String): Int {
        val pairs: MutableList<Pair> = ArrayList()
        val map: MutableMap<Char, Int> = HashMap()
        // collect counts for each char-block
        var i = 0
        while (i < text.length) {
            val c = text[i]
            var count = 0
            while (i < text.length && text[i] == c) {
                count++
                i++
            }
            pairs.add(Pair(c, count))
            map[c] = map.getOrDefault(c, 0) + count
        }
        var max = 0
        // case 1, swap 1 item to the boundary of a consecutive cha-block to achieve possible max
        // length
        // we need total count to make sure whether a swap is possible!
        for (p in pairs) {
            val totalCount = map[p.character]!!
            max = if (totalCount > p.count) {
                Math.max(max, p.count + 1)
            } else {
                Math.max(max, p.count)
            }
        }
        // case 2, find xxxxYxxxxx pattern
        // we need total count to make sure whether a swap is possible!
        for (j in 1 until pairs.size - 1) {
            if (pairs[j - 1].character == pairs[j + 1].character &&
                pairs[j].count == 1
            ) {
                val totalCount = map[pairs[j - 1].character]!!
                val groupSum = pairs[j - 1].count + pairs[j + 1].count
                max = if (totalCount > groupSum) {
                    Math.max(max, groupSum + 1)
                } else {
                    Math.max(max, groupSum)
                }
            }
        }
        return max
    }
}
