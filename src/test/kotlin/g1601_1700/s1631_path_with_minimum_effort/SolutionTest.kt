package g1601_1700.s1631_path_with_minimum_effort

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumEffortPath() {
        assertThat(
            Solution().minimumEffortPath(arrayOf(intArrayOf(1, 2, 2), intArrayOf(3, 8, 2), intArrayOf(5, 3, 5))),
            equalTo(2),
        )
    }

    @Test
    fun minimumEffortPath2() {
        assertThat(
            Solution().minimumEffortPath(arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 8, 4), intArrayOf(5, 3, 5))),
            equalTo(1),
        )
    }

    @Test
    fun minimumEffortPath3() {
        assertThat(
            Solution()
                .minimumEffortPath(
                    arrayOf(
                        intArrayOf(1, 2, 1, 1, 1),
                        intArrayOf(1, 2, 1, 2, 1),
                        intArrayOf(1, 2, 1, 2, 1),
                        intArrayOf(1, 2, 1, 2, 1),
                        intArrayOf(1, 1, 1, 2, 1),
                    ),
                ),
            equalTo(0),
        )
    }
}
