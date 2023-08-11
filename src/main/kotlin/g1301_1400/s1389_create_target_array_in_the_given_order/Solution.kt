package g1301_1400.s1389_create_target_array_in_the_given_order

// #Easy #Array #Simulation #2023_06_06_Time_155_ms_(91.67%)_Space_34.2_MB_(100.00%)

class Solution {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        val list: MutableList<Int> = ArrayList()
        for (i in nums.indices) {
            list.add(index[i], nums[i])
        }
        val target = IntArray(list.size)
        for (i in target.indices) {
            target[i] = list[i]
        }
        return target
    }
}
