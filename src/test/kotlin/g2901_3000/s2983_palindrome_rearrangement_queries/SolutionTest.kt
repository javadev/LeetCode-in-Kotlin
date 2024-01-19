package g2901_3000.s2983_palindrome_rearrangement_queries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canMakePalindromeQueries() {
        assertThat(
            Solution()
                .canMakePalindromeQueries(
                    "abcabc", arrayOf(intArrayOf(1, 1, 3, 5), intArrayOf(0, 2, 5, 5))
                ),
            equalTo(booleanArrayOf(true, true))
        )
    }

    @Test
    fun canMakePalindromeQueries2() {
        assertThat(
            Solution().canMakePalindromeQueries("abbcdecbba", arrayOf(intArrayOf(0, 2, 7, 9))),
            equalTo(booleanArrayOf(false))
        )
    }

    @Test
    fun canMakePalindromeQueries3() {
        assertThat(
            Solution().canMakePalindromeQueries("acbcab", arrayOf(intArrayOf(1, 2, 4, 5))),
            equalTo(booleanArrayOf(true))
        )
    }

    @Test
    fun canMakePalindromeQueries4() {
        assertThat(
            Solution().canMakePalindromeQueries("bb", arrayOf(intArrayOf(0, 0, 1, 1))),
            equalTo(booleanArrayOf(true))
        )
    }

    @Test
    fun canMakePalindromeQueries5() {
        assertThat(
            Solution()
                .canMakePalindromeQueries(
                    "abcabc", arrayOf(intArrayOf(1, 1, 3, 5), intArrayOf(0, 2, 5, 5))
                ),
            equalTo(booleanArrayOf(true, true))
        )
    }

    @Test
    fun canMakePalindromeQueries6() {
        assertThat(
            Solution()
                .canMakePalindromeQueries(
                    "ckwbnmqmtzbixrrkixbtbqzmnwmc", arrayOf(intArrayOf(1, 9, 15, 24))
                ),
            equalTo(booleanArrayOf(true))
        )
    }
}
