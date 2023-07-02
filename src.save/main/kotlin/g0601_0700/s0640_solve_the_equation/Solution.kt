package g0601_0700.s0640_solve_the_equation

// #Medium #String #Math #Simulation #2023_02_10_Time_170_ms_(66.67%)_Space_35.3_MB_(66.67%)

class Solution {
    fun solveEquation(equation: String): String {
        val eqs = equation.split("=".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val arr1 = evaluate(eqs[0])
        val arr2 = evaluate(eqs[1])
        return if (arr1[0] == arr2[0] && arr1[1] == arr2[1]) {
            "Infinite solutions"
        } else if (arr1[0] == arr2[0]) {
            "No solution"
        } else {
            "x=" + (arr2[1] - arr1[1]) / (arr1[0] - arr2[0])
        }
    }

    private fun evaluate(eq: String): IntArray {
        val arr = eq.toCharArray()
        var f = false
        var a = 0
        var b = 0
        var i = 0
        if (arr[0] == '-') {
            f = true
            i++
        }
        while (i < arr.size) {
            if (arr[i] == '-') {
                f = true
                i++
            } else if (arr[i] == '+') {
                i++
            }
            val sb = StringBuilder()
            while (i < arr.size && Character.isDigit(arr[i])) {
                sb.append(arr[i])
                i++
            }
            val n = sb.toString()
            if (i < arr.size && arr[i] == 'x') {
                var number: Int
                number = if (n == "") {
                    1
                } else {
                    n.toInt()
                }
                if (f) {
                    number = -number
                }
                a += number
                i++
            } else {
                var number = n.toInt()
                if (f) {
                    number = -number
                }
                b += number
            }
            f = false
        }
        val op = IntArray(2)
        op[0] = a
        op[1] = b
        return op
    }
}
