package g1801_1900.s1851_minimum_interval_to_include_each_query

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minInterval() {
        assertThat(
            Solution()
                .minInterval(
                    arrayOf(intArrayOf(1, 4), intArrayOf(2, 4), intArrayOf(3, 6), intArrayOf(4, 4)),
                    intArrayOf(2, 3, 4, 5),
                ),
            equalTo(intArrayOf(3, 3, 1, 4)),
        )
    }

    @Test
    fun minInterval2() {
        assertThat(
            Solution()
                .minInterval(
                    arrayOf(intArrayOf(2, 3), intArrayOf(2, 5), intArrayOf(1, 8), intArrayOf(20, 25)),
                    intArrayOf(2, 19, 5, 22),
                ),
            equalTo(intArrayOf(2, -1, 4, 6)),
        )
    }
}
