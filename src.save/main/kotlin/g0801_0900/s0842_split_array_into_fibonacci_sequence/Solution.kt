package g0801_0900.s0842_split_array_into_fibonacci_sequence

// #Medium #String #Backtracking #2023_03_29_Time_142_ms_(100.00%)_Space_35_MB_(100.00%)

class Solution {
    fun splitIntoFibonacci(num: String): List<Int> {
        val res: MutableList<Int> = ArrayList()
        solve(num, res, 0)
        return res
    }

    private fun solve(s: String, res: MutableList<Int>, idx: Int): Boolean {
        if (idx == s.length && res.size >= 3) {
            return true
        }
        for (i in idx until s.length) {
            if (s[idx] == '0' && i > idx) {
                return false
            }
            val num = s.substring(idx, i + 1).toLong()
            if (num > Int.MAX_VALUE) {
                return false
            }
            val size = res.size
            if (size >= 2 && num > res[size - 1] + res[size - 2]) {
                return false
            }
            if (size <= 1 || num == (res[size - 1] + res[size - 2]).toLong()) {
                res.add(num.toInt())
                if (solve(s, res, i + 1)) {
                    return true
                }
                res.removeAt(res.size - 1)
            }
        }
        return false
    }
}
