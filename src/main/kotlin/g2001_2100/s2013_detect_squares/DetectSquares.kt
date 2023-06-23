package g2001_2100.s2013_detect_squares

// #Medium #Array #Hash_Table #Design #Counting
// #2023_06_23_Time_511_ms_(100.00%)_Space_61.4_MB_(80.00%)

class DetectSquares {
    private val map: MutableMap<Int, IntArray>

    init {
        map = HashMap()
    }

    fun add(point: IntArray) {
        val x = point[0]
        val y = point[1]
        val hash = x * MUL + y
        if (map.containsKey(hash)) {
            map[hash]!![2]++
        } else {
            map[hash] = intArrayOf(x, y, 1)
        }
    }

    fun count(point: IntArray): Int {
        var ans = 0
        val x = point[0]
        val y = point[1]
        for ((_, diap) in map) {
            val x1 = diap[0]
            val y1 = diap[1]
            val num = diap[2]
            if (Math.abs(x - x1) == Math.abs(y - y1) && x != x1 && y != y1) {
                val p1hash = x * MUL + y1
                val p2hash = x1 * MUL + y
                if (map.containsKey(p1hash) && map.containsKey(p2hash)) {
                    ans += map[p1hash]!![2] * map[p2hash]!![2] * num
                }
            }
        }
        return ans
    }

    companion object {
        private const val MUL = 1002
    }
}
/*
 * Your DetectSquares object will be instantiated and called as such:
 * var obj = DetectSquares()
 * obj.add(point)
 * var param_2 = obj.count(point)
 */
