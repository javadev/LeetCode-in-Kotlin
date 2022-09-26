package g0001_0100.s0090_subsets_ii

// #Medium #Array #Bit_Manipulation #Backtracking #Algorithm_II_Day_9_Recursion_Backtracking
// #2022_09_26_Time_366_ms_(58.09%)_Space_38.9_MB_(88.97%

import java.util.Arrays

class Solution {
    var allComb: MutableList<List<Int>> = ArrayList()
    var comb: MutableList<Int> = ArrayList()
    lateinit var nums: IntArray
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        Arrays.sort(nums)
        this.nums = nums
        dfs(0)
        allComb.add(ArrayList())
        return allComb
    }

    private fun dfs(start: Int) {
        if (start > nums.size) {
            return
        }
        for (i in start until nums.size) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue
            }
            comb.add(nums[i])
            allComb.add(ArrayList(comb))
            dfs(i + 1)
            comb.removeAt(comb.size - 1)
        }
    }
}
