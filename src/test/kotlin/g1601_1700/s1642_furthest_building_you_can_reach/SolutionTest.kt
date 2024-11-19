package g1601_1700.s1642_furthest_building_you_can_reach

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun furthestBuilding() {
        assertThat(
            Solution().furthestBuilding(intArrayOf(4, 2, 7, 6, 9, 14, 12), 5, 1),
            equalTo(4),
        )
    }

    @Test
    fun furthestBuilding2() {
        assertThat(
            Solution().furthestBuilding(intArrayOf(4, 12, 2, 7, 3, 18, 20, 3, 19), 10, 2),
            equalTo(7),
        )
    }

    @Test
    fun furthestBuilding3() {
        assertThat(Solution().furthestBuilding(intArrayOf(14, 3, 19, 3), 17, 0), equalTo(3))
    }
}
