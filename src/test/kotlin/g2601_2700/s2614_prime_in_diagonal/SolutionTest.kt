package g2601_2700.s2614_prime_in_diagonal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun diagonalPrime() {
        assertThat(
            Solution().diagonalPrime(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(5, 6, 7),
                    intArrayOf(9, 10, 11)
                )
            ),
            equalTo(11)
        )
    }

    @Test
    fun diagonalPrime2() {
        assertThat(
            Solution().diagonalPrime(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(5, 17, 7),
                    intArrayOf(9, 11, 10)
                )
            ),
            equalTo(17)
        )
    }
}
