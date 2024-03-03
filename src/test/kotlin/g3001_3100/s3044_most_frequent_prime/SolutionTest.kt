package g3001_3100.s3044_most_frequent_prime

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mostFrequentPrime() {
        assertThat(
            Solution().mostFrequentPrime(arrayOf(intArrayOf(1, 1), intArrayOf(9, 9), intArrayOf(1, 1))),
            equalTo(19)
        )
    }

    @Test
    fun mostFrequentPrime2() {
        assertThat(Solution().mostFrequentPrime(arrayOf(intArrayOf(7))), equalTo(-1))
    }

    @Test
    fun mostFrequentPrime3() {
        assertThat(
            Solution().mostFrequentPrime(arrayOf(intArrayOf(9, 7, 8), intArrayOf(4, 6, 5), intArrayOf(2, 8, 6))),
            equalTo(97)
        )
    }
}
