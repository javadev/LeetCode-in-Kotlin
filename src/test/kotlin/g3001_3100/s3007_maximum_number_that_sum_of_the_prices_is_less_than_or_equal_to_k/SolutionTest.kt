package g3001_3100.s3007_maximum_number_that_sum_of_the_prices_is_less_than_or_equal_to_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMaximumNumber() {
        assertThat(Solution().findMaximumNumber(9, 1), equalTo(6L))
    }

    @Test
    fun findMaximumNumber2() {
        assertThat(Solution().findMaximumNumber(7, 2), equalTo(9L))
    }
}
