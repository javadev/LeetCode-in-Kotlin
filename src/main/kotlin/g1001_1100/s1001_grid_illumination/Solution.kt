package g1001_1100.s1001_grid_illumination

// #Hard #Array #Hash_Table #2023_05_14_Time_801_ms_(100.00%)_Space_121_MB_(100.00%)

class Solution {
    fun gridIllumination(n: Int, lamps: Array<IntArray>, queries: Array<IntArray>): IntArray {
        val rowIlluminations: MutableMap<Int, Int> = HashMap()
        val colIlluminations: MutableMap<Int, Int> = HashMap()
        val posDiagIlluminations: MutableMap<Int, Int> = HashMap()
        val negDiagIlluminations: MutableMap<Int, Int> = HashMap()
        val lampPlacements: MutableSet<Long> = HashSet()
        for (lamp in lamps) {
            val row = lamp[0]
            val col = lamp[1]
            var key = row.toLong()
            key = key * n + col
            if (lampPlacements.contains(key)) {
                continue
            }
            incr(rowIlluminations, row)
            incr(colIlluminations, col)
            incr(posDiagIlluminations, row + col)
            incr(negDiagIlluminations, row + (n - 1 - col))
            lampPlacements.add(key)
        }
        val ans = IntArray(queries.size)
        for (i in ans.indices) {
            val row = queries[i][0]
            val col = queries[i][1]
            if (rowIlluminations.containsKey(row) ||
                colIlluminations.containsKey(col) ||
                posDiagIlluminations.containsKey(row + col) ||
                negDiagIlluminations.containsKey(row + (n - 1 - col))
            ) {
                ans[i] = 1
            }
            val topRow = 0.coerceAtLeast(row - 1)
            val bottomRow = (n - 1).coerceAtMost(row + 1)
            val leftCol = 0.coerceAtLeast(col - 1)
            val rightCol = (n - 1).coerceAtMost(col + 1)
            for (r in topRow..bottomRow) {
                for (c in leftCol..rightCol) {
                    var key = r.toLong()
                    key = key * n + c
                    if (lampPlacements.contains(key)) {
                        decr(rowIlluminations, r)
                        decr(colIlluminations, c)
                        decr(posDiagIlluminations, r + c)
                        decr(negDiagIlluminations, r + (n - 1 - c))
                        lampPlacements.remove(key)
                    }
                }
            }
        }
        return ans
    }

    private fun incr(map: MutableMap<Int, Int>, key: Int) {
        map[key] = map.getOrDefault(key, 0) + 1
    }

    private fun decr(map: MutableMap<Int, Int>, key: Int) {
        val v = map.getOrDefault(key, 0)
        if (map[key] == 1) {
            map.remove(key)
        } else {
            map[key] = v - 1
        }
    }
}
