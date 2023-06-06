package g1301_1400.s1383_maximum_performance_of_a_team

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxPerformance() {
        assertThat(
            Solution()
                .maxPerformance(
                    6, intArrayOf(2, 10, 3, 1, 5, 8), intArrayOf(5, 4, 3, 9, 7, 2), 2
                ),
            equalTo(60)
        )
    }

    @Test
    fun maxPerformance2() {
        assertThat(
            Solution()
                .maxPerformance(
                    6, intArrayOf(2, 10, 3, 1, 5, 8), intArrayOf(5, 4, 3, 9, 7, 2), 3
                ),
            equalTo(68)
        )
    }

    @Test
    fun maxPerformance3() {
        assertThat(
            Solution()
                .maxPerformance(
                    6, intArrayOf(2, 10, 3, 1, 5, 8), intArrayOf(5, 4, 3, 9, 7, 2), 4
                ),
            equalTo(72)
        )
    }
}
