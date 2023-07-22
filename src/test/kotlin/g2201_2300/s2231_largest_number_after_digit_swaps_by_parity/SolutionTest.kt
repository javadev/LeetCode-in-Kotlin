package g2201_2300.s2231_largest_number_after_digit_swaps_by_parity

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestInteger() {
        assertThat(Solution().largestInteger(1234), equalTo(3412))
    }

    @Test
    fun largestInteger2() {
        assertThat(Solution().largestInteger(65875), equalTo(87655))
    }
}
