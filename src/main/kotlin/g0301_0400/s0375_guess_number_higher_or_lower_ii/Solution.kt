package g0301_0400.s0375_guess_number_higher_or_lower_ii

// #Medium #Dynamic_Programming #Math #Game_Theory
// #2022_11_22_Time_235_ms_(75.00%)_Space_35.1_MB_(50.00%)

class Solution {
    lateinit var matrix: Array<IntArray>
    fun getMoneyAmount(n: Int): Int {
        matrix = Array(n + 1) { IntArray(n + 1) }
        return get(1, n)
    }

    private operator fun get(min: Int, max: Int): Int {
        if (max - min < 3) {
            return if (max - min <= 0) 0 else max - 1
        }
        if (matrix[min][max] != 0) {
            return matrix[min][max]
        }
        var select = max - 3
        var minRes = Int.MAX_VALUE
        var res: Int
        val end = min + (max - min shr 1) - 1
        var cnt = 0
        while (true) {
            res = select + Math.max(get(min, select - 1), get(select + 1, max))
            if (res > minRes) {
                cnt++
                if (cnt >= 3) {
                    break
                }
            }
            if (res < minRes) {
                minRes = res
            }
            select--
            if (select <= end) {
                break
            }
        }
        matrix[min][max] = minRes
        return minRes
    }
}
