package g0001_0100.s0040_combination_sum_ii

// #Medium #Array #Backtracking #Algorithm_II_Day_10_Recursion_Backtracking
// #2023_07_05_Time_217_ms_(93.75%)_Space_38_MB_(89.06%)

import java.util.LinkedList

class Solution {
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        val sums: MutableList<List<Int>> = ArrayList()
        // optimize
        candidates.sort()
        combinationSum(candidates, target, 0, sums, LinkedList())
        return sums
    }

    private fun combinationSum(
        candidates: IntArray,
        target: Int,
        start: Int,
        sums: MutableList<List<Int>>,
        sum: LinkedList<Int>,
    ) {
        if (target == 0) {
            // make a deep copy of the current combination
            sums.add(ArrayList(sum))
            return
        }
        var i = start
        while (i < candidates.size && target >= candidates[i]) {
            // If candidate[i] equals candidate[i-1], then solutions for i is subset of
            // solution of i-1
            if (i == start || i > start && candidates[i] != candidates[i - 1]) {
                sum.addLast(candidates[i])
                // call on 'i+1' (not i) to avoid duplicate usage of same element
                combinationSum(candidates, target - candidates[i], i + 1, sums, sum)
                sum.removeLast()
            }
            i++
        }
    }
}
