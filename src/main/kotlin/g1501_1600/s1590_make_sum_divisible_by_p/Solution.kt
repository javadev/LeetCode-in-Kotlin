package g1501_1600.s1590_make_sum_divisible_by_p

// #Medium #Array #Hash_Table #Prefix_Sum #2023_10_02_Time_464_ms_(100.00%)_Space_58.6_MB_(100.00%)

class Solution {
    fun minSubarray(nums: IntArray, p: Int): Int {
        val hmp = HashMap<Int, Int>()
        val n = nums.size
        var target = 0
        var sum = 0
        for (num in nums) {
            target = (num + target) % p
        }
        if (target == 0) {
            return 0
        }
        hmp[0] = -1
        var ans = n
        for (i in 0 until n) {
            sum = (sum + nums[i]) % p
            val key = (sum - target + p) % p
            if (hmp.containsKey(key)) {
                ans = Math.min(ans, i - hmp[key]!!)
            }
            hmp[sum % p] = i
        }
        return if (ans < n) {
            ans
        } else {
            -1
        }
    }
}
