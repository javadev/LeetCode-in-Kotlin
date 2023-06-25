package g2001_2100.s2055_plates_between_candles

// #Medium #Array #String #Binary_Search #Prefix_Sum
// #2023_06_25_Time_831_ms_(100.00%)_Space_96.3_MB_(100.00%)

class Solution {
    fun platesBetweenCandles(s: String, queries: Array<IntArray>): IntArray {
        val sa = s.toCharArray()
        val n = sa.size
        val nextCandle = IntArray(n + 1)
        nextCandle[n] = -1
        for (i in n - 1 downTo 0) {
            nextCandle[i] = if (sa[i] == '|') i else nextCandle[i + 1]
        }
        val prevCandle = IntArray(n)
        val prevPlates = IntArray(n)
        var countPlate = 0
        if (sa[0] == '*') {
            countPlate = 1
            prevCandle[0] = -1
        }
        for (i in 1 until n) {
            if (sa[i] == '|') {
                prevCandle[i] = i
                prevPlates[i] = countPlate
            } else {
                prevCandle[i] = prevCandle[i - 1]
                countPlate++
            }
        }
        val len = queries.size
        val res = IntArray(len)
        for (i in 0 until len) {
            val query = queries[i]
            val start = query[0]
            val end = query[1]
            var curPlates = 0
            val endCandle = prevCandle[end]
            if (endCandle >= start) {
                val startCandle = nextCandle[start]
                curPlates = prevPlates[endCandle] - prevPlates[startCandle]
            }
            res[i] = curPlates
        }
        return res
    }
}
