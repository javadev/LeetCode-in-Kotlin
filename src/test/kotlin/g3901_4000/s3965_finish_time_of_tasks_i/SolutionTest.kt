package g3901_4000.s3965_finish_time_of_tasks_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun finishTime() {
        assertThat<Long>(
            Solution().finishTime(3, arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 2)), intArrayOf(9, 5, 3)),
            equalTo<Long>(17L),
        )
    }

    @Test
    fun finishTime2() {
        assertThat<Long>(
            Solution().finishTime(3, arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(0, 2)), intArrayOf(4, 7, 6)),
            equalTo<Long>(12L),
        )
    }
}
