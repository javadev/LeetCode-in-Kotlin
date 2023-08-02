package g2501_2600.s2560_house_robber_iv

// #Medium #Array #Binary_Search #2023_07_07_Time_467_ms_(100.00%)_Space_56.6_MB_(100.00%)

class Solution {
    fun minCapability(nums: IntArray, k: Int): Int {
        var l = 1
        var r = 1e9.toInt()
        while (l < r) {
            val mid = l + (r - l) / 2
            if (isPossible(nums, mid, k)) {
                r = mid
            } else {
                l = mid + 1
            }
        }
        return r
    }

    private fun isPossible(nums: IntArray, maxMoney: Int, k: Int): Boolean {
        var houseStolen = 0
        var lastStolenIdx = -2
        for (i in nums.indices) {
            if (nums[i] > maxMoney) {
                continue
            }
            if (i == lastStolenIdx + 1) {
                continue
            }
            houseStolen++
            lastStolenIdx = i
        }
        return houseStolen >= k
    }
}
