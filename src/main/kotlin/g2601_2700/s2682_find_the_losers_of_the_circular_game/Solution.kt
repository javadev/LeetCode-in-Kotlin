package g2601_2700.s2682_find_the_losers_of_the_circular_game

// #Easy #Array #Hash_Table #Simulation #2023_07_28_Time_186_ms_(100.00%)_Space_37.4_MB_(81.82%)

class Solution {
    fun circularGameLosers(n: Int, k: Int): IntArray {
        val pointsMap = IntArray(n)
        var friend = 0
        var turn = 1
        while (true) {
            pointsMap[friend] = pointsMap[friend] + 1
            if (pointsMap[friend] == 2) break
            friend = (friend + turn * k) % n
            turn++
        }
        val result = IntArray(n - (turn - 1))
        var i = 0
        pointsMap.forEachIndexed { index, points ->
            if (points == 0) {
                result[i] = index + 1
                i++
            }
        }
        return result
    }
}
