package g2301_2400.s2334_subarray_with_elements_greater_than_varying_threshold

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun validSubarraySize() {
        assertThat(Solution().validSubarraySize(intArrayOf(1, 3, 4, 3, 1), 6), equalTo(3))
    }

    @Test
    fun validSubarraySize2() {
        assertThat(Solution().validSubarraySize(intArrayOf(6, 5, 6, 5, 8), 7), equalTo(2))
    }

    @Test
    fun validSubarraySize3() {
        assertThat(
            Solution()
                .validSubarraySize(
                    intArrayOf(
                        818, 232, 595, 418, 608, 229, 37, 330, 876, 774, 931, 939, 479,
                        884, 354, 328
                    ),
                    3790
                ),
            equalTo(-1)
        )
    }
}