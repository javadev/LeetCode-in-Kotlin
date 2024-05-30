package g3101_3200.s3160_find_the_number_of_distinct_colors_among_the_balls

// #Medium #Array #Hash_Table #Simulation #2024_05_30_Time_1055_ms_(58.82%)_Space_101.1_MB_(86.27%)

class Solution {
    fun queryResults(ignoredLimit: Int, queries: Array<IntArray>): IntArray {
        val ballToColor: MutableMap<Int, Int> = HashMap()
        val colorToCnt: MutableMap<Int, Int> = HashMap()
        val ret = IntArray(queries.size)
        var i = 0
        while (i < queries.size) {
            val ball = queries[i][0]
            val color = queries[i][1]
            if (ballToColor.containsKey(ball)) {
                val oldColor = ballToColor[ball]!!
                val oldColorCnt = colorToCnt[oldColor]!!
                if (oldColorCnt >= 2) {
                    colorToCnt[oldColor] = oldColorCnt - 1
                } else {
                    colorToCnt.remove(oldColor)
                }
            }
            ballToColor[ball] = color
            colorToCnt[color] = colorToCnt.getOrDefault(color, 0) + 1
            ret[i] = colorToCnt.size
            i += 1
        }
        return ret
    }
}
