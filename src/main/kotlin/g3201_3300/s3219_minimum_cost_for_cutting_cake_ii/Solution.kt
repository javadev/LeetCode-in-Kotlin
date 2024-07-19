package g3201_3300.s3219_minimum_cost_for_cutting_cake_ii

// #Hard #Array #Sorting #Greedy #2024_07_19_Time_776_ms_(100.00%)_Space_66.8_MB_(96.88%)

class Solution {
    fun minimumCost(m: Int, n: Int, horizontalCut: IntArray, verticalCut: IntArray): Long {
        val horizontalCounts = IntArray(N)
        val verticalCounts = IntArray(N)
        var max = 0
        for (x in horizontalCut) {
            if (x > max) {
                max = x
            }
            horizontalCounts[x]++
        }
        for (x in verticalCut) {
            if (x > max) {
                max = x
            }
            verticalCounts[x]++
        }
        var ans: Long = 0
        var horizontalCount = 1
        var verticalCount = 1
        for (x in max downTo 1) {
            ans += horizontalCounts[x].toLong() * x * horizontalCount
            verticalCount += horizontalCounts[x]
            horizontalCounts[x] = 0
            ans += verticalCounts[x].toLong() * x * verticalCount
            horizontalCount += verticalCounts[x]
            verticalCounts[x] = 0
        }
        return ans
    }

    companion object {
        private const val N = 1001
    }
}
