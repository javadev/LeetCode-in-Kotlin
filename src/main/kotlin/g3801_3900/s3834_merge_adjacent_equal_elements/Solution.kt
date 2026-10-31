package g3801_3900.s3834_merge_adjacent_equal_elements

// #Medium #Array #Stack #Simulation #Senior #Weekly_Contest_488
// #2026_07_21_Time_17_ms_(97.36%)_Space_130.84_MB_(46.15%)

class Solution {
    fun mergeAdjacent(nums: IntArray): MutableList<Long> {
        val ans: MutableList<Long> = ArrayList<Long>()
        for (num in nums) {
            var curr: Long = num.toLong()
            while (ans.isNotEmpty() && ans.get(ans.size - 1) == curr) {
                ans.removeAt(ans.size - 1)
                curr *= 2
            }
            ans.add(curr)
        }
        return ans
    }
}
