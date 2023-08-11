package g1601_1700.s1681_minimum_incompatibility

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumIncompatibility() {
        assertThat(Solution().minimumIncompatibility(intArrayOf(1, 2, 1, 4), 2), equalTo(4))
    }

    @Test
    fun minimumIncompatibility2() {
        assertThat(
            Solution().minimumIncompatibility(intArrayOf(6, 3, 8, 1, 3, 1, 2, 2), 4),
            equalTo(6)
        )
    }

    @Test
    fun minimumIncompatibility3() {
        assertThat(
            Solution().minimumIncompatibility(intArrayOf(5, 3, 3, 6, 3, 3), 3),
            equalTo(-1)
        )
    }
}
