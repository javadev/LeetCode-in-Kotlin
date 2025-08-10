package g3601_3700.s3639_minimum_time_to_activate_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minTime() {
        assertThat<Int>(Solution().minTime("abc", intArrayOf(1, 0, 2), 2), equalTo<Int>(0))
    }

    @Test
    fun minTime2() {
        assertThat<Int>(Solution().minTime("cat", intArrayOf(0, 2, 1), 6), equalTo<Int>(2))
    }

    @Test
    fun minTime3() {
        assertThat<Int>(Solution().minTime("xy", intArrayOf(0, 1), 4), equalTo<Int>(-1))
    }
}
