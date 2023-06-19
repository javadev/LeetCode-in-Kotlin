package g1901_2000.s1937_maximum_number_of_points_with_cost

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxPoints() {
        assertThat(
            Solution().maxPoints(arrayOf(intArrayOf(1, 2, 3), intArrayOf(1, 5, 1), intArrayOf(3, 1, 1))),
            equalTo(9L)
        )
    }

    @Test
    fun maxPoints2() {
        assertThat(Solution().maxPoints(arrayOf(intArrayOf(1, 5), intArrayOf(2, 3), intArrayOf(4, 2))), equalTo(11L))
    }
}
