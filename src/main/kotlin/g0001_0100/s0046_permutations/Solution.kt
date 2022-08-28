package g0001_0100.s0046_permutations

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Backtracking
// #Algorithm_I_Day_11_Recursion_Backtracking #Level_2_Day_20_Brute_Force/Backtracking
// #Udemy_Backtracking/Recursion #2022_08_28_Time_299_ms_(80.72%)_Space_39.8_MB_(85.67%)

class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        var result = mutableListOf<MutableList<Int>>()
        val subResult = mutableListOf<Int>()
        subResult.add(nums[0])
        result.add(subResult)
        for (i in 1 until nums.size) {
            result = insert(nums[i], result)
        }
        return result
    }

    private fun insert(n: Int, arr: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
        val result = mutableListOf<MutableList<Int>>()
        arr.forEach { p ->
            for (i in 0..p.size) {
                val subResult = mutableListOf<Int>()
                subResult.addAll(p)
                subResult.add(i, n)
                result.add(subResult)
            }
        }
        return result
    }
}
