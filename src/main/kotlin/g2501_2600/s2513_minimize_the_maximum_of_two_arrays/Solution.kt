package g2501_2600.s2513_minimize_the_maximum_of_two_arrays

// #Medium #Math #Binary_Search #Number_Theory
@Suppress("NAME_SHADOWING")
class Solution {
    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) {
            a
        } else gcd(b, a % b)
    }

    fun minimizeSet(divisor1: Int, divisor2: Int, uniqueCnt1: Int, uniqueCnt2: Int): Int {
        var divisor2 = divisor2
        var lo: Long = 1
        var hi = 10e10.toInt().toLong()
        if (divisor2 == 0) {
            divisor2 = 1
        }
        val lcm = divisor1.toLong() * divisor2.toLong() / gcd(divisor1, divisor2)
        while (lo < hi) {
            val mi = lo + (hi - lo) / 2
            val cnt1 = (mi - mi / divisor1).toInt()
            val cnt2 = (mi - mi / divisor2).toInt()
            val cntAll = (mi - mi / lcm).toInt()
            if (cnt1 < uniqueCnt1 || cnt2 < uniqueCnt2 || cntAll < uniqueCnt1 + uniqueCnt2) {
                lo = mi + 1
            } else {
                hi = mi
            }
        }
        return lo.toInt()
    }
}
