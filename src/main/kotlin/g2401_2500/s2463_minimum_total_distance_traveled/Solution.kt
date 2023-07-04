package g2401_2500.s2463_minimum_total_distance_traveled

import java.util.Arrays

// #Hard #Array #Dynamic_Programming #Sorting
class Solution {
    fun minimumTotalDistance(robot: List<Int>, f: Array<IntArray>): Long {
        // sort factories :
        // 1. move all factories with 0-capacity to the end
        // 2. sort everything else by x-position in asc order
        Arrays.sort(f) { a: IntArray, b: IntArray -> if (a[1] == 0) 1 else if (b[1] == 0) -1 else a[0] - b[0] }
        // Sort robots by x-position in asc order
        // As we don't know the implementation of the List that is passed, it is better to map it to
        // an array explicitly
        val r = IntArray(robot.size)
        var i = 0
        for (x in robot) {
            r[i++] = x
        }
        r.sort()
        // An array to be used for tracking robots assigned to each factory
        val d = Array(f.size) { IntArray(2) }
        // For each robot starting from the rightmost find the most optimal destination factory
        // and add it's cost to the result.
        var res: Long = 0
        i = r.size - 1
        while (i >= 0) {
            res += pop(d, i, r, f)
            i--
        }
        return res
    }

    private fun pop(d: Array<IntArray>, i: Int, r: IntArray, f: Array<IntArray>): Long {
        var cost = Long.MAX_VALUE
        // try assigning robot to each factory starting from the leftmost
        var j = 0
        while (j < d.size) {

            // cost of adding robot to the current factory
            var t = Math.abs(r[i] - f[j][0]).toLong()
            var tj = j
            // if current factory is full calculate the cost of moving the rightmost robot in the
            // factory to the next one
            // and add the calculated cost to the current cost.
            // repeat the same action until we fit our robots to factories.
            while (tj < d.size && d[tj][1] == f[tj][1]) {
                // if we faced a factory with 0-capactity or the rightmost factory
                // it would mean we reached the end and cannot fit our robot to the current factory
                if (d[tj][1] == 0 || tj == d.size - 1) {
                    t = Long.MAX_VALUE
                    break
                }
                val l = d[tj][0] + d[tj][1] - 1
                t += (Math.abs(f[tj + 1][0] - r[l]) - Math.abs(f[tj][0] - r[l])).toLong()
                ++tj
            }
            // if the cost for adding robot to the current factory is greater than the previous one
            // it means that the previous one was the most optimal
            if (t > cost) {
                break
            }
            cost = t
            j++
        }
        // assign current robot to the previous factory and move any non-fit robots to the right
        d[j - 1][0] = i
        var tj = j - 1
        while (d[tj][1] == f[tj][1]) {
            d[tj + 1][0] = d[tj][0] + d[tj][1]
            ++tj
        }
        d[tj][1]++
        return cost
    }
}
