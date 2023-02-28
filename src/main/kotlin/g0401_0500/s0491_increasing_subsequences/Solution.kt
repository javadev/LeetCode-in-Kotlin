package g0401_0500.s0491_increasing_subsequences

// #Medium #Array #Hash_Table #Bit_Manipulation #Backtracking
// #2023_01_03_Time_499_ms_(100.00%)_Space_50.1_MB_(100.00%)

class Solution {
    fun findSubsequences(nums: IntArray?): List<List<Int>> {
        if (nums == null || nums.size == 1) {
            return ArrayList()
        }
        val answer: MutableSet<List<Int>> = HashSet()
        val list: MutableList<Int> = ArrayList()
        return ArrayList(backtracking(nums, 0, list, answer))
    }

    private fun backtracking(
        nums: IntArray,
        start: Int,
        currList: MutableList<Int>,
        answer: MutableSet<List<Int>>
    ): Set<List<Int>> {
        if (currList.size >= 2) {
            answer.add(ArrayList(currList))
        }
        for (i in start until nums.size) {
            if (currList.isEmpty() || currList[currList.size - 1] <= nums[i]) {
                currList.add(nums[i])
                backtracking(nums, i + 1, currList, answer)
                currList.removeAt(currList.size - 1)
            }
        }
        return answer
    }
}
