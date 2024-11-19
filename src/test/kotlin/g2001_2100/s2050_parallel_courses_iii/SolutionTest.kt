package g2001_2100.s2050_parallel_courses_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumTime() {
        assertThat(
            Solution().minimumTime(3, arrayOf(intArrayOf(1, 3), intArrayOf(2, 3)), intArrayOf(3, 2, 5)),
            equalTo(8),
        )
    }

    @Test
    fun minimumTime2() {
        assertThat(
            Solution()
                .minimumTime(
                    5,
                    arrayOf(intArrayOf(1, 5), intArrayOf(2, 5), intArrayOf(3, 5), intArrayOf(3, 4), intArrayOf(4, 5)),
                    intArrayOf(1, 2, 3, 4, 5),
                ),
            equalTo(12),
        )
    }
}
