package g0501_0600.s0554_brick_wall

// #Medium #Array #Hash_Table #2023_01_17_Time_307_ms_(100.00%)_Space_47.5_MB_(90.00%)

class Solution {
    fun leastBricks(wall: List<List<Int>>): Int {
        val gapMap = mutableMapOf<Int, Int>()

        wall.forEach { row ->
            var pos = 0
            for (brickId in 0 until row.lastIndex) {
                pos += row[brickId]
                gapMap[pos] = gapMap.getOrDefault(pos, 0) + 1
            }
        }
        var value = 0
        if (gapMap.size > 0) {
            value = gapMap.values.max()
        }
        return wall.size - value
    }
}
