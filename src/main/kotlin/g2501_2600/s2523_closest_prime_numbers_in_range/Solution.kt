package g2501_2600.s2523_closest_prime_numbers_in_range

// #Medium #Math #Number_Theory
class Solution {
    fun closestPrimes(left: Int, right: Int): IntArray {
        var diff = -1
        var x = -1
        var y = -1
        var prev = -1
        for (i in left..right) {
            val isPrime = isPrime(i)
            if (isPrime) {
                if (prev != -1) {
                    val d = i - prev
                    if (diff == -1 || d < diff) {
                        diff = d
                        x = prev
                        y = i
                        if (diff <= 2) {
                            return intArrayOf(x, y)
                        }
                    }
                }
                prev = i
            }
        }
        return intArrayOf(x, y)
    }

    private fun isPrime(x: Int): Boolean {
        if (x == 1) {
            return false
        }
        val sqrt = Math.sqrt(x.toDouble())
        var i = 2
        while (i <= sqrt) {
            if (x % i == 0) {
                return false
            }
            i++
        }
        return true
    }
}
