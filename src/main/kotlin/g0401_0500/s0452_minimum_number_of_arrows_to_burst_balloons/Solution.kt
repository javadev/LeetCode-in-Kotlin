package g0401_0500.s0452_minimum_number_of_arrows_to_burst_balloons

// #Medium #Array #Sorting #Greedy #2022_12_25_Time_934_ms_(100.00%)_Space_87_MB_(100.00%)

class Solution {
    /*
     * I'm glad to have come up with this solution on my own on 10/13/2021:
     * we'll have to sort the
     * balloons by its ending points, a counter case to this is below:
     * {{0, 6}, {0, 9}, {7, 8}}
     * if we sort by starting points, then it becomes:
     * {0, 6}, {0, 9}, {7, 8}
     * this way, if we shoot 9,
     * {0, 6} won't be burst however, if we sort by ending points, then it becomes:
     * {0, 6}, {7, 8}, {0, 9}, then we shoot at 6, then at 8, this gives us the result of bursting all balloons.
     */
    fun findMinArrowShots(points: Array<IntArray>): Int {
        points.sort { a: IntArray, b: IntArray ->
            Integer.compare(
                a[1],
                b[1]
            )
        }
        var minArrows = 1
        var end = points[0][1].toLong()
        for (i in 1 until points.size) {
            if (points[i][0] > end) {
                minArrows++
                end = points[i][1].toLong()
            }
        }
        return minArrows
    }
}
