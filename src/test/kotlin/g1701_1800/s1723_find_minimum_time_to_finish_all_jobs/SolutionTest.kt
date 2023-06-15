package g1701_1800.s1723_find_minimum_time_to_finish_all_jobs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumTimeRequired() {
        assertThat(Solution().minimumTimeRequired(intArrayOf(3, 2, 3), 3), equalTo(3))
    }

    @Test
    fun minimumTimeRequired2() {
        assertThat(Solution().minimumTimeRequired(intArrayOf(1, 2, 4, 7, 8), 2), equalTo(11))
    }
}
