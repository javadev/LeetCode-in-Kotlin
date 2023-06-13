package g1501_1600.s1567_maximum_length_of_subarray_with_positive_product

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val maxLen: Unit
        get() {
            MatcherAssert.assertThat(Solution().getMaxLen(intArrayOf(1, -2, -3, 4)), CoreMatchers.equalTo(4))
        }

    @get:Test
    val maxLen2: Unit
        get() {
            MatcherAssert.assertThat(Solution().getMaxLen(intArrayOf(0, 1, -2, -3, -4)), CoreMatchers.equalTo(3))
        }

    @get:Test
    val maxLen3: Unit
        get() {
            MatcherAssert.assertThat(Solution().getMaxLen(intArrayOf(-1, -2, -3, 0, 1)), CoreMatchers.equalTo(2))
        }
}
