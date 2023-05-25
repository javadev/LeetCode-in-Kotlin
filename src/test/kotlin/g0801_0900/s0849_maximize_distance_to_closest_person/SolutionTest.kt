package g0801_0900.s0849_maximize_distance_to_closest_person

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDistToClosest() {
        assertThat(Solution().maxDistToClosest(intArrayOf(1, 0, 0, 0, 1, 0, 1)), equalTo(2))
    }

    @Test
    fun maxDistToClosest2() {
        assertThat(Solution().maxDistToClosest(intArrayOf(1, 0, 0, 0)), equalTo(3))
    }

    @Test
    fun maxDistToClosest3() {
        assertThat(Solution().maxDistToClosest(intArrayOf(0, 1)), equalTo(1))
    }
}
