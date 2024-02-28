package g3001_3100.s3015_count_the_number_of_houses_at_a_certain_distance_i

// #Medium #Breadth_First_Search #Graph #Prefix_Sum
// #2024_02_28_Time_203_ms_(90.91%)_Space_37.3_MB_(69.70%)

import kotlin.math.abs

@Suppress("NAME_SHADOWING")
class Solution {
    fun countOfPairs(n: Int, x: Int, y: Int): IntArray {
        var x = x
        var y = y
        val answer = IntArray(n)
        var distance = n - 1
        var k = distance - 1
        while (distance > 0) {
            answer[k] = (n - distance) * 2
            distance--
            k--
        }
        if (x > y) {
            val tmp = x
            x = y
            y = tmp
        }
        val skip = y - x
        if (skip < 2) {
            return answer
        }
        for (i in 1 until n) {
            for (j in i + 1..n) {
                val oldDistance = j - i
                val newDistance = (abs((x - i)) + abs((y - j)) + 1)
                if (newDistance < oldDistance) {
                    answer[oldDistance - 1] -= 2
                    answer[newDistance - 1] += 2
                }
            }
        }
        return answer
    }
}
