package g3301_3400.s3376_minimum_time_to_break_locks_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMinimumTime() {
        assertThat<Int>(
            Solution().findMinimumTime(mutableListOf<Int>(3, 4, 1), 1),
            equalTo<Int>(4),
        )
    }

    @Test
    fun findMinimumTime2() {
        assertThat<Int>(
            Solution().findMinimumTime(mutableListOf<Int>(2, 5, 4), 2),
            equalTo<Int>(5),
        )
    }
}
