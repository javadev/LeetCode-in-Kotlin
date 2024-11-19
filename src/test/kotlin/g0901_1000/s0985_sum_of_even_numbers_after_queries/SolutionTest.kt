package g0901_1000.s0985_sum_of_even_numbers_after_queries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumEvenAfterQueries() {
        assertThat(
            Solution()
                .sumEvenAfterQueries(
                    intArrayOf(1, 2, 3, 4),
                    arrayOf(intArrayOf(1, 0), intArrayOf(-3, 1), intArrayOf(-4, 0), intArrayOf(2, 3)),
                ),
            equalTo(intArrayOf(8, 6, 2, 4)),
        )
    }

    @Test
    fun sumEvenAfterQueries2() {
        assertThat(
            Solution().sumEvenAfterQueries(intArrayOf(1), arrayOf(intArrayOf(4, 0))),
            equalTo(intArrayOf(0)),
        )
    }
}
