package g0001_0100.s0039_combination_sum

// #Medium #Top_100_Liked_Questions #Array #Backtracking #Algorithm_II_Day_10_Recursion_Backtracking
// #Level_2_Day_20_Brute_Force/Backtracking #Udemy_Backtracking/Recursion
// #2022_08_27_Time_317_ms_(86.85%)_Space_45.1_MB_(63.75%)

class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        fun backtrack(start: Int, case: MutableList<Int>, sum: Int) {
            if (sum >= target) {
                if (sum == target) {
                    result.add(case.toList())
                }
                return
            }
            for (i in start until candidates.size) {
                case.add(candidates[i])
                backtrack(i, case, sum + candidates[i])
                case.removeAt(case.size - 1)
            }
        }
        backtrack(0, mutableListOf(), 0)
        return result
    }
}
