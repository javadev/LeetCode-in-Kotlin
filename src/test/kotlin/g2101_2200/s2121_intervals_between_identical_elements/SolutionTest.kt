package g2101_2200.s2121_intervals_between_identical_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distances() {
        assertThat(
            Solution().getDistances(intArrayOf(2, 1, 3, 1, 2, 3, 3)),
            equalTo(longArrayOf(4, 2, 7, 2, 4, 4, 5))
        )
    }

    @Test
    fun distances2() {
        assertThat(
            Solution().getDistances(intArrayOf(10, 5, 10, 10)),
            equalTo(longArrayOf(5, 0, 3, 4))
        )
    }
}
