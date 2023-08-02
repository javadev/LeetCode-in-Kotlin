package g1801_1900.s1889_minimum_space_wasted_from_packaging

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minWastedSpace() {
        assertThat(
            Solution().minWastedSpace(intArrayOf(2, 3, 5), arrayOf(intArrayOf(4, 8), intArrayOf(2, 8))),
            equalTo(6)
        )
    }

    @Test
    fun minWastedSpace2() {
        assertThat(
            Solution()
                .minWastedSpace(intArrayOf(2, 3, 5), arrayOf(intArrayOf(1, 4), intArrayOf(2, 3), intArrayOf(3, 4))),
            equalTo(-1)
        )
    }

    @Test
    fun minWastedSpace3() {
        assertThat(
            Solution()
                .minWastedSpace(
                    intArrayOf(3, 5, 8, 10, 11, 12),
                    arrayOf(intArrayOf(12), intArrayOf(11, 9), intArrayOf(10, 5, 14))
                ),
            equalTo(9)
        )
    }
}
