package g1801_1900.s1848_minimum_distance_to_the_target_element

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDistance() {
        assertThat(
            Solution().getMinDistance(intArrayOf(1, 2, 3, 4, 5), 5, 3),
            equalTo(1)
        )
    }

    @Test
    fun minDistance2() {
        assertThat(Solution().getMinDistance(intArrayOf(1), 1, 0), equalTo(0))
    }

    @Test
    fun minDistance3() {
        assertThat(
            Solution().getMinDistance(intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1), 5, 3),
            equalTo(0)
        )
    }
}
