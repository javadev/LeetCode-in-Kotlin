package g2001_2100.s2060_check_if_an_original_string_exists_given_two_encoded_strings

// #Hard #String #Dynamic_Programming #2023_06_25_Time_1219_ms_(100.00%)_Space_74.8_MB_(100.00%)

class Solution {
    private var stringMatched = false
    private var s1: String? = null
    private var s2: String? = null

    private lateinit var memo: Array<Array<Array<Boolean?>>>
    fun possiblyEquals(s1: String, s2: String): Boolean {
        this.s1 = s1
        this.s2 = s2
        memo = Array(s1.length + 1) { Array<Array<Boolean?>>(s2.length + 1) { arrayOfNulls(2000) } }
        dfs(0, 0, 0)
        return stringMatched
    }

    private fun dfs(i1: Int, i2: Int, diff: Int) {
        if (stringMatched) {
            return
        }
        if (i1 == s1!!.length && i2 == s2!!.length) {
            if (diff == 0) {
                stringMatched = true
            }
            return
        }
        if (i1 == s1!!.length && diff <= 0) {
            return
        }
        if (i2 == s2!!.length && diff >= 0) {
            return
        }
        if (memo[i1][i2][diff + 999] != null) {
            stringMatched = memo[i1][i2][diff + 999]!!
            return
        }
        val indexNums1: MutableList<IntArray> = ArrayList()
        var num1 = 0
        var x1 = i1
        while (x1 < s1!!.length && Character.isDigit(s1!![x1])) {
            num1 = num1 * 10 + (s1!![x1].code - '0'.code)
            indexNums1.add(intArrayOf(x1, num1))
            x1++
        }
        val indexNums2: MutableList<IntArray> = ArrayList()
        var num2 = 0
        var x2 = i2
        while (x2 < s2!!.length && Character.isDigit(s2!![x2])) {
            num2 = num2 * 10 + (s2!![x2].code - '0'.code)
            indexNums2.add(intArrayOf(x2, num2))
            x2++
        }
        if (diff == 0) {
            if (extracted(i1, i2, diff, indexNums1, indexNums2)) {
                return
            }
        } else if (diff > 0) {
            if (Character.isLetter(s2!![i2])) {
                dfs(i1, i2 + 1, diff - 1)
            } else {
                for (num2Item in indexNums2) {
                    dfs(i1, num2Item[0] + 1, diff - num2Item[1])
                }
            }
        } else {
            if (Character.isLetter(s1!![i1])) {
                dfs(i1 + 1, i2, diff + 1)
            } else {
                for (num1Item in indexNums1) {
                    dfs(num1Item[0] + 1, i2, diff + num1Item[1])
                }
            }
        }
        memo[i1][i2][diff + 999] = stringMatched
    }

    private fun extracted(
        i1: Int,
        i2: Int,
        diff: Int,
        indexNums1: List<IntArray>,
        indexNums2: List<IntArray>
    ): Boolean {
        val c1 = s1!![i1]
        val c2 = s2!![i2]
        if (Character.isLetter(c1) && Character.isLetter(c2)) {
            if (c1 != c2) {
                return true
            }
            dfs(i1 + 1, i2 + 1, diff)
            return true
        } else {
            if (!indexNums1.isEmpty()) {
                for (num1Item in indexNums1) {
                    dfs(num1Item[0] + 1, i2, diff + num1Item[1])
                }
            } else {
                for (num2Item in indexNums2) {
                    dfs(i1, num2Item[0] + 1, diff - num2Item[1])
                }
            }
        }
        return false
    }
}
