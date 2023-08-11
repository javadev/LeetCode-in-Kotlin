package g2501_2600.s2594_minimum_time_to_repair_cars

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun repairCars() {
        assertThat(Solution().repairCars(intArrayOf(4, 2, 3, 1), 10), equalTo(16))
    }

    @Test
    fun repairCars2() {
        assertThat(Solution().repairCars(intArrayOf(5, 1, 8), 6), equalTo(16))
    }
}
