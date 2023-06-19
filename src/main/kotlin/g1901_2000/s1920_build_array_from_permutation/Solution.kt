package g1901_2000.s1920_build_array_from_permutation

// #Easy #Array #Simulation
class Solution {
    fun buildArray(nums: IntArray): IntArray {
        val ans = IntArray(nums.size)
        for (i in nums.indices) {
            ans[i] = nums[nums[i]]
        }
        return ans
    }
}
