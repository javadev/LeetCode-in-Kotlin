package g2001_2100.s2056_number_of_valid_move_combinations_on_chessboard

// #Hard #Array #String #Simulation #Backtracking
// #2023_06_25_Time_600_ms_(100.00%)_Space_44.1_MB_(100.00%)

class Solution {
    // 0: rook, queen, bishop
    private val dirs = arrayOf(
        arrayOf(intArrayOf(-1, 0), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(0, 1)),
        arrayOf(
            intArrayOf(-1, 0),
            intArrayOf(1, 0),
            intArrayOf(0, -1),
            intArrayOf(0, 1),
            intArrayOf(1, 1),
            intArrayOf(-1, -1),
            intArrayOf(-1, 1),
            intArrayOf(1, -1),
        ),
        arrayOf(intArrayOf(1, 1), intArrayOf(-1, -1), intArrayOf(-1, 1), intArrayOf(1, -1)),
    )

    fun countCombinations(pieces: Array<String?>, positions: Array<IntArray>): Int {
        val endPosition: Array<ArrayList<IntArray>?> = arrayOfNulls(pieces.size)
        for (i in pieces.indices) {
            endPosition[i] = ArrayList()
        }
        for (i in pieces.indices) {
            positions[i][0]--
            positions[i][1]--
            endPosition[i]!!.add(positions[i])
            var dirIndex = 0
            when (pieces[i]) {
                "rook" -> dirIndex = 0
                "queen" -> dirIndex = 1
                "bishop" -> dirIndex = 2
            }
            for (d in dirs[dirIndex]) {
                var r = positions[i][0]
                var c = positions[i][1]
                while (true) {
                    r += d[0]
                    c += d[1]
                    if (r < 0 || r >= 8 || c < 0 || c >= 8) {
                        break
                    }
                    endPosition[i]!!.add(intArrayOf(r, c))
                }
            }
        }
        return dfs(positions, endPosition, IntArray(pieces.size), 0)
    }

    private fun dfs(positions: Array<IntArray>, stop: Array<ArrayList<IntArray>?>, stopIndex: IntArray, cur: Int): Int {
        if (cur == stopIndex.size) {
            val p = Array(positions.size) { IntArray(2) }
            for (i in p.indices) {
                p[i] = intArrayOf(positions[i][0], positions[i][1])
            }
            return check(p, stop, stopIndex)
        }
        var res = 0
        for (i in stop[cur]!!.indices) {
            stopIndex[cur] = i
            res += dfs(positions, stop, stopIndex, cur + 1)
        }
        return res
    }

    private fun check(positions: Array<IntArray>, stop: Array<ArrayList<IntArray>?>, stopIndex: IntArray): Int {
        var keepGoing = true
        while (keepGoing) {
            keepGoing = false
            for (i in positions.indices) {
                var diff = stop[i]!![stopIndex[i]][0] - positions[i][0]
                if (diff > 0) {
                    keepGoing = true
                    positions[i][0]++
                } else if (diff < 0) {
                    keepGoing = true
                    positions[i][0]--
                }
                diff = stop[i]!![stopIndex[i]][1] - positions[i][1]
                if (diff > 0) {
                    keepGoing = true
                    positions[i][1]++
                } else if (diff < 0) {
                    keepGoing = true
                    positions[i][1]--
                }
            }
            val seen: MutableSet<Int> = HashSet()
            for (position in positions) {
                val key = position[0] * 100 + position[1]
                if (seen.contains(key)) {
                    return 0
                }
                seen.add(key)
            }
        }
        return 1
    }
}
