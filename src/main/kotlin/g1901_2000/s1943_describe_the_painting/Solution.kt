package g1901_2000.s1943_describe_the_painting

// #Medium #Array #Prefix_Sum #2023_06_20_Time_951_ms_(100.00%)_Space_63.9_MB_(100.00%)

class Solution {
    fun splitPainting(segments: Array<IntArray>): List<List<Long>> {
        val result: MutableList<List<Long>> = ArrayList()
        var n = 1
        for (s in segments) {
            n = Math.max(n, s[1])
        }
        n += 1
        val line = LongArray(n)
        val endpoint = BooleanArray(n)
        for (s in segments) {
            val start = s[0]
            val end = s[1]
            val color = s[2]
            line[start] += color.toLong()
            line[end] -= color.toLong()
            endpoint[end] = true
            endpoint[start] = endpoint[end]
        }
        var mixedColor: Long = 0
        var start = 1
        for (end in 1 until n) {
            if (endpoint[end]) {
                if (mixedColor > 0) {
                    result.add(listOf(start.toLong(), end.toLong(), mixedColor))
                }
                start = end
            }
            mixedColor += line[end]
        }
        return result
    }
}
