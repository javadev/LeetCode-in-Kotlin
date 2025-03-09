package g3401_3500.s3477_fruits_into_baskets_ii

// #Easy #2025_03_09_Time_6_ms_(100.00%)_Space_47.78_MB_(100.00%)

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
