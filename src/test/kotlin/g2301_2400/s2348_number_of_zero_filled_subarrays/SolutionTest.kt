package g2301_2400.s2348_number_of_zero_filled_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun zeroFilledSubarray() {
        assertThat(
            Solution().zeroFilledSubarray(intArrayOf(1, 3, 0, 0, 2, 0, 0, 4)),
            equalTo(6L),
        )
    }

    @Test
    fun zeroFilledSubarray2() {
        assertThat(Solution().zeroFilledSubarray(intArrayOf(0, 0, 0, 2, 0, 0)), equalTo(9L))
    }

    @Test
    fun zeroFilledSubarray3() {
        assertThat(Solution().zeroFilledSubarray(intArrayOf(2, 10, 2019)), equalTo(0L))
    }
}
