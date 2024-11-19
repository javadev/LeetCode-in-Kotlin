package g2201_2300.s2249_count_lattice_points_inside_a_circle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countLatticePoints() {
        assertThat(Solution().countLatticePoints(arrayOf(intArrayOf(2, 2, 1))), equalTo(5))
    }

    @Test
    fun countLatticePoints2() {
        assertThat(
            Solution().countLatticePoints(arrayOf(intArrayOf(2, 2, 2), intArrayOf(3, 4, 1))),
            equalTo(16),
        )
    }
}
