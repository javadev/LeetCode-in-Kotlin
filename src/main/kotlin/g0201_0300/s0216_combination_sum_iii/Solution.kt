package g0201_0300.s0216_combination_sum_iii

// #Medium #Array #Backtracking #Udemy_Backtracking/Recursion
// #2022_10_25_Time_175_ms_(90.91%)_Space_34.4_MB_(72.73%)

class Solution {
    fun combinationSum3(k: Int, n: Int): List<List<Int>> {
        val a = MutableList(0) { MutableList(0) { 0 } }
        comb(a, k, n, 1, MutableList<Int>(0) { 0 })
        return a
    }

    fun comb(a: MutableList<MutableList<Int>>, k: Int, n: Int, index: Int, tmp: MutableList<Int>) {
        if (n < 0) {
            return
        }
        if (tmp.size > k) {
            return
        }
        if (n == 0 && tmp.size == k) {
            a.add(tmp.map { it -> it }.toMutableList())
            return
        }
        for (i in index until 10) {
            tmp.add(i)
            comb(a, k, n - i, i + 1, tmp)
            tmp.removeAt(tmp.size - 1)
        }
    }
}
