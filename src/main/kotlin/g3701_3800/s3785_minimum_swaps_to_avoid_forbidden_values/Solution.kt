package g3701_3800.s3785_minimum_swaps_to_avoid_forbidden_values

// #Hard #Array #Hash_Table #Greedy #Counting #Senior_Staff #Weekly_Contest_481
// #2026_05_22_Time_88_ms_(86.89%)_Space_159.68_MB_(81.97%)

import kotlin.math.max

class Solution {
    fun minSwaps(nums: IntArray, forbidden: IntArray): Int {
        val n = nums.size
        val map: MutableMap<Int?, Int?> = HashMap<Int?, Int?>()
        for (num in nums) {
            map.put(num, map.getOrDefault(num, 0)!! + 1)
        }
        for (num in forbidden) {
            map.put(num, map.getOrDefault(num, 0)!! + 1)
        }
        for (`val` in map.values) {
            if (`val`!! > n) {
                return -1
            }
        }
        val map2: MutableMap<Int?, Int?> = HashMap<Int?, Int?>()
        var total = 0
        for (i in 0..<n) {
            if (nums[i] == forbidden[i]) {
                map2.put(nums[i], map2.getOrDefault(nums[i], 0)!! + 1)
                total++
            }
        }
        if (total == 0) {
            return 0
        }
        var maxSwaps = 0
        for (num in map2.values) {
            maxSwaps = max(maxSwaps, num!!)
        }
        return max(maxSwaps, (total + 1) / 2)
    }
}
