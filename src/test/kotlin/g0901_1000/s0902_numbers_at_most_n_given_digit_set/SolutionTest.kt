package g0901_1000.s0902_numbers_at_most_n_given_digit_set

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun atMostNGivenDigitSet() {
        assertThat(
            Solution().atMostNGivenDigitSet(arrayOf("1", "3", "5", "7"), 100),
            equalTo(20),
        )
    }

    @Test
    fun atMostNGivenDigitSet2() {
        assertThat(
            Solution().atMostNGivenDigitSet(arrayOf("1", "4", "9"), 1000000000),
            equalTo(29523),
        )
    }

    @Test
    fun atMostNGivenDigitSet3() {
        assertThat(Solution().atMostNGivenDigitSet(arrayOf("7"), 8), equalTo(1))
    }
}
