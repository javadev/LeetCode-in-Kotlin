package g1001_1100.s1011_capacity_to_ship_packages_within_d_days

// #Medium #Array #Binary_Search #2023_05_16_Time_325_ms_(66.67%)_Space_65.5_MB_(33.33%)

class Solution {
    fun shipWithinDays(weights: IntArray, days: Int): Int {
        var max = weights[0]
        var sum = 0
        for (`val` in weights) {
            sum += `val`
            max = max.coerceAtLeast(`val`)
        }
        var lo = max
        var hi = sum
        var ans = 0
        while (lo <= hi) {
            val mid = lo + (hi - lo) / 2
            if (isPossible(weights, mid, days)) {
                ans = mid
                hi = mid - 1
            } else {
                lo = mid + 1
            }
        }
        return ans
    }

    private fun isPossible(arr: IntArray, mid: Int, days: Int): Boolean {
        var capacity = 1
        var sum = 0
        for (j in arr) {
            sum += j
            if (sum > mid) {
                capacity++
                sum = j
            }
        }
        return capacity <= days
    }
}
