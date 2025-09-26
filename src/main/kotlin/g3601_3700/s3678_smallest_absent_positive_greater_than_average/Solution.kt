package g3601_3700.s3678_smallest_absent_positive_greater_than_average

// #Easy #Array #Hash_Table #Biweekly_Contest_165
// #2025_09_20_Time_3_ms_(100.00%)_Space_47.84_MB_(100.00%)

class Solution {
    fun smallestAbsent(nums: IntArray): Int {
        var sum = 0
        for (j in nums) {
            sum += j
        }
        val avg = sum.toDouble() / nums.size
        var num: Int
        if (avg < 0) {
            num = 1
        } else {
            num = avg.toInt() + 1
        }
        while (true) {
            var flag = false
            for (j in nums) {
                if (num == j) {
                    flag = true
                    break
                }
            }
            if (!flag && num > avg) {
                return num
            }
            num++
        }
    }
}
