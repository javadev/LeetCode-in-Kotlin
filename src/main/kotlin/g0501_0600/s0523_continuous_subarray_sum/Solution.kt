package g0501_0600.s0523_continuous_subarray_sum

// #Medium #Array #Hash_Table #Math #Prefix_Sum
// #2023_01_14_Time_682_ms_(95.45%)_Space_55_MB_(86.36%)

class Solution {
    fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
        val map: MutableMap<Int, Int> = HashMap()
        var sum = 0
        map[0] = -1
        for (i in nums.indices) {
            sum += nums[i]
            val remainder = sum % k
            if (map.containsKey(remainder)) {
                if (map[remainder]!! + 1 < i) {
                    return true
                }
            } else {
                map[remainder] = i
            }
        }
        return false
    }
}
