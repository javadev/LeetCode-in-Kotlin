package g2501_2600.s2529_maximum_count_of_positive_integer_and_negative_integer

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumCount() {
        assertThat(Solution().maximumCount(intArrayOf(-2, -1, -1, 1, 2, 3)), equalTo(3))
    }

    @Test
    fun maximumCount2() {
        assertThat(Solution().maximumCount(intArrayOf(-3, -2, -1, 0, 0, 1, 2)), equalTo(3))
    }

    @Test
    fun maximumCount3() {
        assertThat(Solution().maximumCount(intArrayOf(5, 20, 66, 1314)), equalTo(4))
    }
}
