package g0401_0500.s0414_third_maximum_number

// #Easy #Array #Sorting #2022_12_06_Time_317_ms_(73.00%)_Space_36.9_MB_(94.00%)

class Solution {
    fun thirdMax(nums: IntArray): Int {
        var max1 = Long.MIN_VALUE
        var max2 = Long.MIN_VALUE
        var max3 = Long.MIN_VALUE
        for (i in nums) {
            max1 = Math.max(max1, i.toLong())
        }
        for (i in nums) {
            if (i.toLong() == max1) {
                continue
            }
            max2 = Math.max(max2, i.toLong())
        }
        for (i in nums) {
            if (i.toLong() == max1 || i.toLong() == max2) {
                continue
            }
            max3 = Math.max(max3, i.toLong())
        }
        return (if (max3 == Long.MIN_VALUE) max1 else max3).toInt()
    }
}
