package g0201_0300.s0204_count_primes

// #Medium #Top_Interview_Questions #Array #Math #Enumeration #Number_Theory
// #2022_10_19_Time_360_ms_(96.61%)_Space_61.2_MB_(71.19%)

class Solution {
    fun countPrimes(n: Int): Int {
        val isprime = BooleanArray(n)
        var count = 0
        run {
            var i = 2
            while (i * i <= n) {
                if (!isprime[i]) {
                    var j = i * 2
                    while (j < n) {
                        isprime[j] = true
                        j += i
                    }
                }
                i++
            }
        }
        for (i in 2 until isprime.size) {
            if (!isprime[i]) {
                count++
            }
        }
        return count
    }
}
