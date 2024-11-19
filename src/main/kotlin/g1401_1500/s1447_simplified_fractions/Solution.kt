package g1401_1500.s1447_simplified_fractions

// #Medium #String #Math #Number_Theory #2023_06_07_Time_338_ms_(100.00%)_Space_38_MB_(100.00%)

class Solution {
    fun simplifiedFractions(n: Int): List<String> {
        val result: MutableList<String> = ArrayList()
        if (n == 1) {
            return result
        }
        val str = StringBuilder()
        for (denom in 2..n) {
            for (num in 1 until denom) {
                if (checkGCD(num, denom) == 1) {
                    result.add(str.append(num).append("/").append(denom).toString())
                }
                str.setLength(0)
            }
        }
        return result
    }

    private fun checkGCD(a: Int, b: Int): Int {
        if (a < b) {
            return checkGCD(b, a)
        }
        return if (a == b || a % b == 0 || b == 1) {
            b
        } else {
            checkGCD(a % b, b)
        }
    }
}
