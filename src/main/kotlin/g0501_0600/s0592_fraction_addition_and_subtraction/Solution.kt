package g0501_0600.s0592_fraction_addition_and_subtraction

// #Medium #String #Math #Simulation #2023_01_31_Time_164_ms_(100.00%)_Space_35.9_MB_(66.67%)

class Solution {
    private fun gcd(a: Int, b: Int): Int {
        return if (a % b == 0) b else gcd(b, a % b)
    }

    private fun format(a: Int, b: Int): String {
        val gcd = Math.abs(gcd(a, b))
        return (a / gcd).toString() + "/" + b / gcd
    }

    private fun parse(s: String): IntArray {
        val idx = s.indexOf("/")
        return intArrayOf(s.substring(0, idx).toInt(), s.substring(idx + 1).toInt())
    }

    fun fractionAddition(expression: String): String {
        var rst = intArrayOf(0, 1)
        val list: MutableList<IntArray> = ArrayList()
        var sb = StringBuilder().append(expression[0])
        for (i in 1 until expression.length) {
            val c = expression[i]
            if (c == '+' || c == '-') {
                list.add(parse(sb.toString()))
                sb = StringBuilder().append(c)
            } else {
                sb.append(c)
            }
        }
        list.add(parse(sb.toString()))
        for (num in list) {
            rst = intArrayOf(rst[0] * num[1] + rst[1] * num[0], rst[1] * num[1])
        }
        return format(rst[0], rst[1])
    }
}
