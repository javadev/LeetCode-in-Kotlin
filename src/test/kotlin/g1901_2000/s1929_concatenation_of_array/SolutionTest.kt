package g1901_2000.s1929_concatenation_of_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun concatenation() {
        assertThat(
            Solution().getConcatenation(intArrayOf(1, 2, 1)),
            equalTo(intArrayOf(1, 2, 1, 1, 2, 1))
        )
    }

    @Test
    fun concatenation2() {
        assertThat(
            Solution().getConcatenation(intArrayOf(1, 3, 2, 1)),
            equalTo(intArrayOf(1, 3, 2, 1, 1, 3, 2, 1))
        )
    }
}
