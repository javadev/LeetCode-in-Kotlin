package g2101_2200.s2155_all_divisions_with_the_highest_score_of_a_binary_array

// #Medium #Array
class Solution {
    fun maxScoreIndices(nums: IntArray): List<Int> {
        var curone = 0
        var curzero = 0
        var max = 0
        for (i in nums) {
            curone += i
        }
        val list: MutableList<Int> = ArrayList()
        for (i in nums.indices) {
            if (curzero + curone > max) {
                list.clear()
                list.add(i)
                max = curzero + curone
            } else if (curzero + curone == max) {
                list.add(i)
            }
            if (nums[i] == 1) {
                curone--
            } else {
                curzero++
            }
        }
        if (curzero > max) {
            list.clear()
            list.add(nums.size)
        } else if (curzero == max) {
            list.add(nums.size)
        }
        return list
    }
}
