package g0001_0100.s0040_combination_sum_ii

// #Medium #Array #Backtracking #Algorithm_II_Day_10_Recursion_Backtracking
// #2022_09_18_Time_348_ms_(80.92%)_Space_38_MB_(96.18%)

import java.util.Arrays
import java.util.LinkedList

class Solution {
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        val sums: MutableList<List<Int>> = ArrayList()
        // optimize
        Arrays.sort(candidates)
        combinationSum(candidates, target, 0, sums, LinkedList())
        return sums
    }

    private fun combinationSum(
        candidates: IntArray,
        target: Int,
        start: Int,
        sums: MutableList<List<Int>>,
        sum: LinkedList<Int>
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
