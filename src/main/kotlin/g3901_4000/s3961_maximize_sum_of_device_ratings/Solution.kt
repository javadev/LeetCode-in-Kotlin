package g3901_4000.s3961_maximize_sum_of_device_ratings

// #Medium #Array #Sorting #Greedy #Matrix #Staff #Weekly_Contest_506
// #2026_10_20_Time_6_ms_(98.67%)_Space_209.82_MB_(68.00%)

class Solution {
    fun maxRatings(nums: Array<IntArray>): Long {
        val n = nums[0].size
        if (n == 1) {
            var totalSum: Long = 0
            for (num in nums) {
                totalSum += num[0].toLong()
            }
            return totalSum
        }
        var sumM2: Long = 0
        var min1Global = Int.MAX_VALUE
        var min2Global = Int.MAX_VALUE
        for (num in nums) {
            var min1 = Int.MAX_VALUE
            var min2 = Int.MAX_VALUE
            for (j in 0..<n) {
                val `val` = num[j]
                if (`val` < min1) {
                    min2 = min1
                    min1 = `val`
                } else if (`val` < min2) {
                    min2 = `val`
                }
            }
            sumM2 += min2.toLong()
            if (min1 < min1Global) {
                min1Global = min1
            }
            if (min2 < min2Global) {
                min2Global = min2
            }
        }
        return min1Global + sumM2 - min2Global
    }
}
