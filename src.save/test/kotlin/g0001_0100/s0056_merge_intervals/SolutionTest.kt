package g0001_0100.s0056_merge_intervals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun merge() {
        assertThat(
            Solution().merge(arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18))),
            equalTo(
                arrayOf(intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18))
            )
        )
    }

    @Test
    fun merge2() {
        assertThat(
            Solution().merge(arrayOf(intArrayOf(1, 4), intArrayOf(4, 5))),
            equalTo(
                arrayOf(intArrayOf(1, 5))
            )
        )
    }
}
