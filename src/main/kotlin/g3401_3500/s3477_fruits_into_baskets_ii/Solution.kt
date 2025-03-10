package g3401_3500.s3477_fruits_into_baskets_ii

// #Easy #Array #Binary_Search #Simulation #Segment_Tree
// #2025_03_10_Time_4_ms_(100.00%)_Space_47.71_MB_(100.00%)

class Solution {
    fun numOfUnplacedFruits(fruits: IntArray, baskets: IntArray): Int {
        val n = fruits.size
        var ct = 0
        val used = BooleanArray(n)
        for (fruit in fruits) {
            var flag = true
            for (i in 0..<n) {
                if (fruit <= baskets[i] && !used[i]) {
                    used[i] = true
                    flag = false
                    break
                }
            }
            if (flag) {
                ct++
            }
        }
        return ct
    }
}
