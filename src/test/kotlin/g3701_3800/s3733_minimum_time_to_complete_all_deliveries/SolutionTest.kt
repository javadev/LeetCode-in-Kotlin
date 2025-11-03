package g3701_3800.s3733_minimum_time_to_complete_all_deliveries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumTime() {
        assertThat<Long>(
            Solution().minimumTime(intArrayOf(3, 1), intArrayOf(2, 3)),
            equalTo<Long>(5L),
        )
    }

    @Test
    fun minimumTime2() {
        assertThat<Long>(
            Solution().minimumTime(intArrayOf(1, 3), intArrayOf(2, 2)),
            equalTo<Long>(7L),
        )
    }

    @Test
    fun minimumTime3() {
        assertThat<Long>(
            Solution().minimumTime(intArrayOf(2, 1), intArrayOf(3, 4)),
            equalTo<Long>(3L),
        )
    }
}
