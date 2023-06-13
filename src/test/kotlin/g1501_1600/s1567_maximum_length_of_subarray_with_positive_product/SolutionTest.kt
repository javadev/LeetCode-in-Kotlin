package g1501_1600.s1567_maximum_length_of_subarray_with_positive_product

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val maxLen: Unit
        get() {
            assertThat(Solution().getMaxLen(intArrayOf(1, -2, -3, 4)), equalTo(4))
        }

    @get:Test
    val maxLen2: Unit
        get() {
            assertThat(Solution().getMaxLen(intArrayOf(0, 1, -2, -3, -4)), equalTo(3))
        }

    @get:Test
    val maxLen3: Unit
        get() {
            assertThat(Solution().getMaxLen(intArrayOf(-1, -2, -3, 0, 1)), equalTo(2))
        }
}
