package g1301_1400.s1389_create_target_array_in_the_given_order

// #Easy #Array #Simulation
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
