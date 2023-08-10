package g2701_2800.s2761_prime_pairs_with_target_sum

// #Medium #Array #Math #Enumeration #Number_Theory
// #2023_08_10_Time_537_ms_(100.00%)_Space_54.2_MB_(46.15%)

class Solution {
    fun findPrimePairs(n: Int): List<List<Int>> {
        val answer: MutableList<List<Int>> = ArrayList()
        for (a in list) {
            val other = n - a
            if (other < n / 2 || a > n / 2) break
            if (primes.contains(other)) answer.add(listOf(a, other))
        }
        return answer
    }

    companion object {
        private val primes: HashSet<Int> = HashSet()
        private val list: MutableList<Int> = ArrayList()

        init {
            val m = 1000001
            val visited = BooleanArray(m)
            for (i in 2 until m) {
                if (!visited[i]) {
                    primes.add(i)
                    list.add(i)
                    var j: Int = i
                    while (j < m) {
                        visited[j] = true
                        j += i
                    }
                }
            }
        }
    }
}
