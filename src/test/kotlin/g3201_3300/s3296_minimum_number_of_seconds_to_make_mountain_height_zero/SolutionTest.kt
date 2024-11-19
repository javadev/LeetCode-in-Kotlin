package g3201_3300.s3296_minimum_number_of_seconds_to_make_mountain_height_zero

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minNumberOfSeconds() {
        assertThat<Long>(
            Solution().minNumberOfSeconds(4, intArrayOf(2, 1, 1)),
            equalTo<Long>(3L),
        )
    }

    @Test
    fun minNumberOfSeconds2() {
        assertThat<Long>(
            Solution().minNumberOfSeconds(10, intArrayOf(3, 2, 2, 4)),
            equalTo<Long>(12L),
        )
    }

    @Test
    fun minNumberOfSeconds3() {
        assertThat<Long>(
            Solution().minNumberOfSeconds(5, intArrayOf(1)),
            equalTo<Long>(15L),
        )
    }
}
