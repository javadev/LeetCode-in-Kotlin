package g1801_1900.s1840_maximum_building_height

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxBuilding() {
        assertThat(
            Solution().maxBuilding(5, arrayOf(intArrayOf(2, 1), intArrayOf(4, 1))),
            equalTo(2),
        )
    }

    @Test
    fun maxBuilding2() {
        assertThat(Solution().maxBuilding(6, arrayOf()), equalTo(5))
    }

    @Test
    fun maxBuilding3() {
        assertThat(
            Solution().maxBuilding(5, arrayOf(intArrayOf(5, 3), intArrayOf(2, 5), intArrayOf(7, 4), intArrayOf(10, 3))),
            equalTo(5),
        )
    }
}
