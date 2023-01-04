package g0001_0100.s0077_combinations

// #Medium #Backtracking #Algorithm_I_Day_11_Recursion_Backtracking
// #2022_09_24_Time_244_ms_(100.00%)_Space_40.5_MB_(99.00%)

import java.util.Stack

class Solution {
    fun combine(n: Int, k: Int): List<List<Int>> {
        val ans: MutableList<List<Int>> = ArrayList()
        // Boundary case
        if (n > 20 || k < 1 || k > n) {
            return ans
        }
        backtrack(ans, n, k, 1, Stack())
        return ans
    }

    private fun backtrack(ans: MutableList<List<Int>>, n: Int, k: Int, s: Int, stack: Stack<Int>) {
        // Base case
        // If k becomes 0
        if (k == 0) {
            ans.add(ArrayList(stack))
            return
        }
        // Start with s till n-k+1
        for (i in s..n - k + 1) {
            stack.push(i)
            // Update start for recursion and decrease k by 1
            backtrack(ans, n, k - 1, i + 1, stack)
            stack.pop()
        }
    }
}
