package g0201_0300.s0282_expression_add_operators

// #Hard #String #Math #Backtracking #2022_07_06_Time_9_ms_(98.48%)_Space_45.3_MB_(73.71%)
class Solution {
    fun addOperators(num: String, target: Int): List<String> {
        val res: MutableList<String> = ArrayList()
        if (num.length == 0 || java.lang.Long.valueOf(num) > Int.MAX_VALUE) {
            return res
        }
        val list = num.toCharArray()
        dfs(res, list, 0, 0, target, CharArray(2 * list.size - 1), 0, 1, '+', 0)
        return res
    }

    private fun dfs(
        res: MutableList<String>,
        list: CharArray,
        i: Int,
        j: Int,
        target: Int,
        arr: CharArray,
        `val`: Int,
        mul: Int,
        preOp: Char,
        join: Int
    ) {
        var j = j
        arr[j++] = list[i]
        val digit = 10 * join + (list[i].code - '0'.code)
        var result = `val` + mul * digit
        if (preOp == '-') {
            result = `val` - mul * digit
        }
        if (i == list.size - 1) {
            if (result == target) {
                val sb = StringBuilder()
                for (k in 0 until j) {
                    sb.append(arr[k])
                }
                res.add(sb.toString())
            }
            return
        }
        if (preOp == '+') {
            arr[j] = '+'
            dfs(res, list, i + 1, j + 1, target, arr, `val` + mul * digit, 1, '+', 0)
            arr[j] = '-'
            dfs(res, list, i + 1, j + 1, target, arr, `val` + mul * digit, 1, '-', 0)
            arr[j] = '*'
            dfs(res, list, i + 1, j + 1, target, arr, `val`, mul * digit, '+', 0)
            if (digit != 0) {
                dfs(res, list, i + 1, j, target, arr, `val`, mul, '+', digit)
            }
        } else {
            arr[j] = '+'
            dfs(res, list, i + 1, j + 1, target, arr, `val` - mul * digit, 1, '+', 0)
            arr[j] = '-'
            dfs(res, list, i + 1, j + 1, target, arr, `val` - mul * digit, 1, '-', 0)
            arr[j] = '*'
            dfs(res, list, i + 1, j + 1, target, arr, `val`, mul * digit, '-', 0)
            if (digit != 0) {
                dfs(res, list, i + 1, j, target, arr, `val`, mul, '-', digit)
            }
        }
    }
}
