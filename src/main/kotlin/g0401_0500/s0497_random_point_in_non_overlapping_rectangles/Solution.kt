package g0401_0500.s0497_random_point_in_non_overlapping_rectangles

// #Medium #Math #Binary_Search #Prefix_Sum #Ordered_Set #Randomized #Reservoir_Sampling
// #2023_01_04_Time_759_ms_(100.00%)_Space_100.1_MB_(100.00%)

import java.util.Random

@Suppress("kotlin:S2245")
class Solution(rects: Array<IntArray>) {
    private val weights: IntArray
    private val rects: Array<IntArray>
    private val random: Random

    init {
        weights = IntArray(rects.size)
        this.rects = rects
        random = Random()
        for (i in rects.indices) {
            val rect = rects[i]
            val count = (1 + rect[2] - rect[0]) * (1 + rect[3] - rect[1])
            weights[i] = (if (i == 0) 0 else weights[i - 1]) + count
        }
    }

    fun pick(): IntArray {
        val picked: Int = 1 + random.nextInt(weights[weights.size - 1])
        val idx = findGreaterOrEqual(picked)
        return getRandomPoint(idx)
    }

    private fun findGreaterOrEqual(target: Int): Int {
        var left = 0
        var right = weights.size - 1
        while (left + 1 < right) {
            val mid = left + (right - left) / 2
            if (weights[mid] >= target) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return if (weights[left] >= target) left else right
    }

    private fun getRandomPoint(idx: Int): IntArray {
        val r = rects[idx]
        val left = r[0]
        val right = r[2]
        val bot = r[1]
        val top = r[3]
        return intArrayOf(
            left + random.nextInt(right - left + 1),
            bot + random.nextInt(top - bot + 1),
        )
    }
}

/*
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(rects)
 * var param_1 = obj.pick()
 */
