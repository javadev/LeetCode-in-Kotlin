package g3801_3900.s3862_find_the_smallest_balanced_index

// #Medium #Array #Prefix_Sum #Senior #Weekly_Contest_492
// #2026_07_27_Time_3_ms_(100.00%)_Space_143.54_MB_(51.17%)

class Solution {
    fun smallestBalancedIndex(nums: IntArray): Int {
        var lsum: Long = 0
        for (x in nums) {
            lsum += x.toLong()
        }
        var rprod: Long = 1
        for (i in nums.indices.reversed()) {
            lsum -= nums[i].toLong()
            if (lsum == rprod) {
                return i
            }
            if (rprod > lsum / nums[i]) {
                break
            }
            rprod *= nums[i].toLong()
        }
        return -1
    }
}
