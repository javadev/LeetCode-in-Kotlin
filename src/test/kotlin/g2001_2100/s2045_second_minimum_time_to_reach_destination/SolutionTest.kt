package g2001_2100.s2045_second_minimum_time_to_reach_destination

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun secondMinimum() {
        assertThat(
            Solution()
                .secondMinimum(
                    5,
                    arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(1, 4), intArrayOf(3, 4), intArrayOf(4, 5)),
                    3,
                    5,
                ),
            equalTo(13),
        )
    }

    @Test
    fun secondMinimum2() {
        assertThat(Solution().secondMinimum(2, arrayOf(intArrayOf(1, 2)), 3, 2), equalTo(11))
    }
}
