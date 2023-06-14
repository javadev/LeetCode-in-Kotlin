package g1501_1600.s1552_magnetic_force_between_two_balls

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDistance() {
        MatcherAssert.assertThat(Solution().maxDistance(intArrayOf(1, 2, 3, 4, 7), 3), CoreMatchers.equalTo(3))
    }

    @Test
    fun maxDistance2() {
        MatcherAssert.assertThat(
            Solution().maxDistance(intArrayOf(5, 4, 3, 2, 1, 1000000000), 2),
            CoreMatchers.equalTo(999999999)
        )
    }
}
