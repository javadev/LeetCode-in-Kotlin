package g1901_2000.s1920_build_array_from_permutation

// #Easy #Array #Simulation #2023_06_20_Time_252_ms_(81.25%)_Space_39.3_MB_(70.83%)

class Solution {
    fun buildArray(nums: IntArray): IntArray {
        val ans = IntArray(nums.size)
        for (i in nums.indices) {
            ans[i] = nums[nums[i]]
        }
        return ans
    }
}
