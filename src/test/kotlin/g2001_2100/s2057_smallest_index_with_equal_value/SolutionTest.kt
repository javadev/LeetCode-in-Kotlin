package g2001_2100.s2057_smallest_index_with_equal_value

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestEqual() {
        assertThat(Solution().smallestEqual(intArrayOf(0, 1, 2)), equalTo(0))
    }

    @Test
    fun smallestEqual2() {
        assertThat(Solution().smallestEqual(intArrayOf(4, 3, 2, 1)), equalTo(2))
    }

    @Test
    fun smallestEqual3() {
        assertThat(
            Solution().smallestEqual(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)),
            equalTo(-1)
        )
    }
}
