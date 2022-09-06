package g0201_0300.s0216_combination_sum_iii

// #Medium #Array #Backtracking #Udemy_Backtracking/Recursion
// #2022_07_02_Time_1_ms_(81.35%)_Space_41.8_MB_(46.36%)
class Solution {
    fun combinationSum3(k: Int, n: Int): List<List<Int>> {
        val res: MutableList<List<Int>> = ArrayList()
        solve(k, n, ArrayList(), res, 0, 1)
        return res
    }

    private fun solve(
        k: Int,
        target: Int,
        temp: MutableList<Int>,
        res: MutableList<List<Int>>,
        sum: Int,
        start: Int
    ) {
        if (sum == target && temp.size == k) {
            res.add(ArrayList(temp))
            return
        }
        if (temp.size >= k) {
            return
        }
        if (sum > target) {
            return
        }
        for (i in start..9) {
            temp.add(i)
            solve(k, target, temp, res, sum + i, i + 1)
            temp.removeAt(temp.size - 1)
        }
    }
}
