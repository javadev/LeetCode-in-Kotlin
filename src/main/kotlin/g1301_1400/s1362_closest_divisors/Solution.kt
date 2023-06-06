package g1301_1400.s1362_closest_divisors

// #Medium #Math
class Solution {
    fun closestDivisors(num: Int): IntArray {
        val sqrt1 = Math.sqrt(num + 1.0).toInt()
        val sqrt2 = Math.sqrt(num + 2.0).toInt()
        if (sqrt1 * sqrt1 == num + 1) {
            return intArrayOf(sqrt1, sqrt1)
        }
        if (sqrt2 * sqrt2 == num + 2) {
            return intArrayOf(sqrt2, sqrt2)
        }
        var ans1 = IntArray(2)
        for (i in sqrt1 downTo 1) {
            if ((num + 1) % i == 0) {
                ans1 = intArrayOf(i, (num + 1) / i)
                break
            }
        }
        var ans2 = IntArray(2)
        for (i in sqrt2 downTo 1) {
            if ((num + 2) % i == 0) {
                ans2 = intArrayOf(i, (num + 2) / i)
                break
            }
        }
        return if (Math.abs(ans2[0] - ans2[1]) < Math.abs(ans1[0] - ans1[1])) ans2 else ans1
    }
}
