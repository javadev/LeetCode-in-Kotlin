package g3401_3500.s3477_fruits_into_baskets_ii

// #Easy #Array #Binary_Search #Simulation #Segment_Tree
// #2025_03_11_Time_3_ms_(100.00%)_Space_47.78_MB_(75.61%)

class Solution {
    fun numOfUnplacedFruits(fruits: IntArray, baskets: IntArray): Int {
        val n = fruits.size
        var currfruits: Int
        var count = 0
        for (i in 0..<n) {
            currfruits = fruits[i]
            for (j in 0..<n) {
                if (baskets[j] >= currfruits) {
                    count++
                    baskets[j] = 0
                    break
                }
            }
        }
        return n - count
    }
}
