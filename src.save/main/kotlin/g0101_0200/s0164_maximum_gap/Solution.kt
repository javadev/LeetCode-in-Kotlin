package g0101_0200.s0164_maximum_gap

// #Hard #Array #Sorting #Bucket_Sort #Radix_Sort
// #2022_10_11_Time_991_ms_(68.00%)_Space_77.2_MB_(88.00%)

class Solution {
    fun maximumGap(nums: IntArray): Int {
        if (nums.size < 2) {
            return 0
        }
        var ret = Int.MIN_VALUE
        nums.sort()
        for (i in 0 until nums.size - 1) {
            if (nums[i + 1] - nums[i] > ret) {
                ret = nums[i + 1] - nums[i]
            }
        }
        return ret
    }
}
