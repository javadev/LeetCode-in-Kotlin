package g3101_3200.s3112_minimum_time_to_visit_disappearing_nodes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumTime() {
        assertThat(
            Solution()
                .minimumTime(
                    3,
                    arrayOf(intArrayOf(0, 1, 2), intArrayOf(1, 2, 1), intArrayOf(0, 2, 4)),
                    intArrayOf(1, 1, 5),
                ),
            equalTo(intArrayOf(0, -1, 4)),
        )
    }

    @Test
    fun minimumTime2() {
        assertThat(
            Solution()
                .minimumTime(
                    3,
                    arrayOf(intArrayOf(0, 1, 2), intArrayOf(1, 2, 1), intArrayOf(0, 2, 4)),
                    intArrayOf(1, 3, 5),
                ),
            equalTo(intArrayOf(0, 2, 3)),
        )
    }

    @Test
    fun minimumTime3() {
        assertThat(
            Solution().minimumTime(2, arrayOf(intArrayOf(0, 1, 1)), intArrayOf(1, 1)),
            equalTo(intArrayOf(0, -1)),
        )
    }
}
