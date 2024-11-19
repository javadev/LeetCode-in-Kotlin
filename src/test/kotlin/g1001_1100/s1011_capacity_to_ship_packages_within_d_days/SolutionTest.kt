package g1001_1100.s1011_capacity_to_ship_packages_within_d_days

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shipWithinDays() {
        assertThat(
            Solution().shipWithinDays(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5),
            equalTo(15),
        )
    }

    @Test
    fun shipWithinDays2() {
        assertThat(Solution().shipWithinDays(intArrayOf(3, 2, 2, 4, 1, 4), 3), equalTo(6))
    }
}
