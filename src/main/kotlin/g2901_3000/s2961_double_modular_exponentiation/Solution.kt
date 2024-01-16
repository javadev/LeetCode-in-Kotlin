package g2901_3000.s2961_double_modular_exponentiation

// #Medium #Array #Math #Simulation #2024_01_16_Time_197_ms_(92.50%)_Space_41.8_MB_(52.50%)

@Suppress("NAME_SHADOWING")
class Solution {
    private fun myPow(a: Int, b: Int, mod: Int): Long {
        var a = a
        var b = b
        var ans: Long = 1
        if (b == 0) {
            return 1
        }
        if (a <= 1) {
            return a.toLong()
        }
        while (b > 0) {
            if (b % 2 == 0) {
                a = a * a % mod
                b = b / 2
            } else {
                ans *= a.toLong()
                b -= 1
                ans = ans % mod
            }
        }
        return ans
    }

    fun getGoodIndices(variables: Array<IntArray>, target: Int): List<Int> {
        val n = variables.size
        val goodIndices: MutableList<Int> = ArrayList()
        for (i in 0 until n) {
            val ai = variables[i][0]
            val bi = variables[i][1]
            val ci = variables[i][2]
            val mi = variables[i][3]
            var ans = myPow(ai % 10, bi, 10) % 10
            ans = myPow(ans.toInt(), ci, mi) % mi
            if (ans == target.toLong()) {
                goodIndices.add(i)
            }
        }
        return goodIndices
    }
}
