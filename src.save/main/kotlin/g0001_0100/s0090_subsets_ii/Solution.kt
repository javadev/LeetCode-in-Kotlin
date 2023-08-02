package g0001_0100.s0090_subsets_ii

// #Medium #Array #Bit_Manipulation #Backtracking #Algorithm_II_Day_9_Recursion_Backtracking
// #2023_07_10_Time_200_ms_(88.33%)_Space_38_MB_(85.00%)

class Solution {
    private var allComb: MutableList<List<Int>> = ArrayList()
    private var comb: MutableList<Int> = ArrayList()
    private lateinit var nums: IntArray

    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        nums.sort()
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
