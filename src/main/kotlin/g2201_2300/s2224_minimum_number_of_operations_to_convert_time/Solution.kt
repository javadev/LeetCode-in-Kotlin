package g2201_2300.s2224_minimum_number_of_operations_to_convert_time

// #Easy #String #Greedy
class Solution {
    private val duration = intArrayOf(60, 15, 5, 1)
    private var c = 0
    fun convertTime(current: String, correct: String): Int {
        val dmin = correct.substring(3).toInt() - current.substring(3).toInt()
        val dhour = correct.substring(0, 2).toInt() - current.substring(0, 2).toInt()
        val min = dhour * 60 + dmin
        dfs(0, min)
        return c
    }

    private fun dfs(i: Int, amount: Int) {
        if (i == 4) {
            return
        }
        if (amount == 0) {
            return
        }
        if (amount - duration[i] >= 0) {
            c++
            dfs(i, amount - duration[i])
        } else {
            dfs(i + 1, amount)
        }
    }
}
