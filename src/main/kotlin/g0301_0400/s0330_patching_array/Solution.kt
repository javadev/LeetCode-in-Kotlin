package g0301_0400.s0330_patching_array

// #Hard #Array #Greedy #2022_11_12_Time_201_ms_(100.00%)_Space_36.5_MB_(100.00%)

class Solution {
    fun minPatches(nums: IntArray, n: Int): Int {
        var res = 0
        var sum: Long = 0
        var i = 0
        while (sum < n) {
            // required number
            val req = sum + 1
            if (i < nums.size && nums[i] <= req) {
                sum += nums[i++].toLong()
            } else {
                sum += req
                res++
            }
        }
        return res
    }
}
