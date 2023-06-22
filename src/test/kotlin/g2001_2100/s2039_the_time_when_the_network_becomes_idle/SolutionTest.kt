package g2001_2100.s2039_the_time_when_the_network_becomes_idle

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun networkBecomesIdle() {
        MatcherAssert.assertThat(
            Solution()
                .networkBecomesIdle(arrayOf(intArrayOf(0, 1), intArrayOf(1, 2)), intArrayOf(0, 2, 1)),
            CoreMatchers.equalTo(8)
        )
    }

    @Test
    fun networkBecomesIdle2() {
        MatcherAssert.assertThat(
            Solution()
                .networkBecomesIdle(
                    arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 2)),
                    intArrayOf(0, 10, 10)
                ),
            CoreMatchers.equalTo(3)
        )
    }
}
