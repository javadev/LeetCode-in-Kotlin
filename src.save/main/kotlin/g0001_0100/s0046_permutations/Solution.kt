package g0001_0100.s0046_permutations

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Backtracking
// #Algorithm_I_Day_11_Recursion_Backtracking #Level_2_Day_20_Brute_Force/Backtracking
// #Udemy_Backtracking/Recursion #2022_08_29_Time_186_ms_(100.00%)_Space_36.9_MB_(98.90%)

class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        if (nums.isEmpty()) {
            return ArrayList()
        }
        val finalResult: MutableList<List<Int>> = ArrayList()
        permuteRecur(nums, finalResult, ArrayList(), BooleanArray(nums.size))
        return finalResult
    }

    private fun permuteRecur(
        nums: IntArray,
        finalResult: MutableList<List<Int>>,
        currResult: MutableList<Int>,
        used: BooleanArray
    ) {
        if (currResult.size == nums.size) {
            finalResult.add(ArrayList(currResult))
            return
        }
        for (i in nums.indices) {
            if (used[i]) {
                continue
            }
            currResult.add(nums[i])
            used[i] = true
            permuteRecur(nums, finalResult, currResult, used)
            used[i] = false
            currResult.removeAt(currResult.size - 1)
        }
    }
}
